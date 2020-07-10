package com.servicematter.android.civilserviceregulation;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class FreeTrialTimerProcessor {


    public  FreeTrialTimerProcessor(){

    }
    public long ProcessFreeTrialTimeRemaining(Context context){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        long currentTime = System.currentTimeMillis();
        Log.e("currentTime   ", Long.toString(currentTime));
        long LeftTimeStamp = GetLeftTimeStamp(context);
        Log.e("LeftTimeStamp   ", Long.toString(LeftTimeStamp));
        long TimeDiff = currentTime - LeftTimeStamp;

        Log.e("TimeDiff   ", Long.toString(TimeDiff));
        long FormerTimeRemainingFromTrial = preferences.getLong("TimeRemaining",0);

        Log.e("FormerTimeFromTrial ", Long.toString(FormerTimeRemainingFromTrial) );
        long TrueRemainingTimeFromTrial =  FormerTimeRemainingFromTrial - TimeDiff;

        return TrueRemainingTimeFromTrial;

    }

    public long GetLeftTimeStamp(Context context){

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        long LeftTimeStamp = preferences.getLong("LeftTimeStamp",0);

        return LeftTimeStamp;


    }

    public void PutLeftTimeStamp(Context context){

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        long currentTimeUserLeft = System.currentTimeMillis();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("LeftTimeStamp",currentTimeUserLeft);
        editor.commit();

    }

    public void PutTimeRemainingFromTrialCountDownTimer(Context context, long TimeRemaining){


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong("TimeRemaining",TimeRemaining);
        editor.commit();

    }

}
