package com.servicematter.android.civilserviceregulation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Intent intent;
    AppDatabase appDatabase;
    rulesDatabase rulesDatabase;
    Finance_Database finance_database;
    Procurement_Database procurement_database;
    boolean isFirstTime;
    TextView splashtext;
    FreeTrialTimerProcessor freeTrialTimerProcessor = new FreeTrialTimerProcessor();
    FreeTrialCountDownTimerUtil freeTrialCountDownTimerUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_scren);
        splashtext = findViewById(R.id.splashscreentitle);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        splashtext.setTypeface(customfont);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(SplashScreen.this);
        isFirstTime = preferences.getBoolean("firsttime",true);
        if(isFirstTime){
            rulesDatabase = Room.databaseBuilder(this, com.servicematter.android.civilserviceregulation.rulesDatabase.class,"ruledb").allowMainThreadQueries().build();
            rulesDatabase.rulesDao().InsertAll(Rules_Section.populate_rule());
            appDatabase = Room.databaseBuilder(this, AppDatabase.class,"mydb").allowMainThreadQueries().build();
            appDatabase.sectionDao().InsertAll(Section.populateSection());
            finance_database = Room.databaseBuilder(this,Finance_Database.class,"finance_db").allowMainThreadQueries().build();
            finance_database.finance_dao().InsertAll(Finance_Section.populate_finance_rule());
            procurement_database = Room.databaseBuilder(this,Procurement_Database.class,"Procurement_Section").allowMainThreadQueries().build();
            procurement_database.procurement_dao().InsertAll(Procurement_Section.populateSection());
        }
        intent = new Intent(SplashScreen.this,DashBoard.class);
        CountDownTimer timer = new CountDownTimer(3000,1000);
        timer.start();
    }



    public class CountDownTimer extends android.os.CountDownTimer {


        public CountDownTimer(long millisInFuture, long countDownInterval) {

            super(millisInFuture, countDownInterval);

        }

        @Override
        public void onTick(long millisUntilFinished) {


        }

        @Override
        public void onFinish() {

             startActivity(intent);
             overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
             finish();

            }

        }


        @Override
       public void onResume() {
            super.onResume();

            if (isFirstTime) {
                freeTrialCountDownTimerUtil = new FreeTrialCountDownTimerUtil(120000, 1000, SplashScreen.this);
                freeTrialCountDownTimerUtil.start();
            } else {

                long TimeRemaining = freeTrialTimerProcessor.ProcessFreeTrialTimeRemaining(SplashScreen.this);
                freeTrialCountDownTimerUtil = new FreeTrialCountDownTimerUtil(TimeRemaining, 1000, SplashScreen.this);
                freeTrialCountDownTimerUtil.start();
            }


        }
        @Override
       public void onStop() {

            freeTrialTimerProcessor.PutLeftTimeStamp(SplashScreen.this);
            super.onStop();
        }
}

