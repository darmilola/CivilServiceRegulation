package com.servicematter.android.regulatorybooks;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import androidx.room.Room;

public class DatabaseCopier {
    private static final String TAG = DatabaseCopier.class.getSimpleName();
    private static final String DATABASE_NAME = "csr.db";

    private AppDatabase appDatabase;
    private static Context context ;

    public static class Holder {
        private static final DatabaseCopier INSTANCE = new DatabaseCopier();
    }

    public static DatabaseCopier getInstance(Context mcontext){
        context = mcontext;
        return Holder.INSTANCE;
    }

    public DatabaseCopier(){
        copyAttachedDatabase(context,DATABASE_NAME);
        appDatabase = Room.databaseBuilder(context,AppDatabase.class,DATABASE_NAME)
                .build();
    }

    private void copyAttachedDatabase(Context context, String databaseName) {
         final File dbpath = context.getDatabasePath(databaseName);
         if(dbpath.exists()){
             return;
         }

        Log.e("database", "copying");

         dbpath.getParentFile().mkdirs();

         try{
             final InputStream inputStream = context.getAssets().open("database/"+databaseName);
             final OutputStream outputStream = new FileOutputStream(dbpath);

             byte[] buffer = new byte[8192];
             int lenght;

             while ((lenght = inputStream.read(buffer,0,8192)) > 0){
                 outputStream.write(buffer,0,lenght);
             }
             outputStream.flush();
             outputStream.close();
             inputStream.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();

             Log.e("filenot found ", e.getMessage());
         } catch (IOException e) {
             e.printStackTrace();
             Log.e("ioexception ", e.getMessage());
         }

    }

    public AppDatabase getRoomDatabase(){
        return appDatabase;
    }
}
