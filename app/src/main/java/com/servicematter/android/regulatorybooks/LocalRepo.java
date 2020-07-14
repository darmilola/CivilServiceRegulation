package com.servicematter.android.regulatorybooks;

import android.content.Context;
import android.util.Log;

import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class LocalRepo {
    private static AppDatabase appDatabase;
    private static final Object LOCK = new Object();
    private static Context context;

    public synchronized static AppDatabase getAppDatabase(Context mcontext) {
        if (appDatabase == null) {
            context = mcontext;
            synchronized (LOCK) {
                if (appDatabase == null) {
                    appDatabase = Room.databaseBuilder(mcontext, AppDatabase.class, "mydb")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .addCallback(dbcallback).build();
                }
            }
        }
        return appDatabase;
    }

    private static RoomDatabase.Callback dbcallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    Log.e("i reach here", "  run: ");
                    getAppDatabase(context).sectionDao().InsertAll(Section.populateSection());
                }
            });

        }

    };

}
