package com.servicematter.android.regulatorybooks;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class MyApplication extends Application {

    Context context;
    AppDatabase appdatabase;
    String TimeRemaining;
    String LeftTimeStamp;
    String currentTimeStamp;
    Boolean isFirstTime;
    SharedPreferences preferences;
    @Override
    public void onCreate() {

        super.onCreate();
        context = this;


    }






}
