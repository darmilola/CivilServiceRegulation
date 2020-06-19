package com.servicematter.android.civilserviceregulation;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    Context context;
    AppDatabase appdatabase;
    @Override
    public void onCreate() {

        super.onCreate();
        context = this;


        //DatabaseCopier copier = DatabaseCopier.getInstance(getApplicationContext());


        // appdatabase = Room.databaseBuilder(this, AppDatabase.class,"mydb").allowMainThreadQueries().build();



    }

}
