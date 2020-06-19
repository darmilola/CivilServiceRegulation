package com.servicematter.android.civilserviceregulation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Civil_Service_Rules_Coat_Of_Arm extends AppCompatActivity {

    TextView ondostateofnigeria1,civilservicerules,revisededition,preparedunder,executivegovernor,of,ondostateofnigeria2,july1999;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil__service__rules__coat__of__arm);

        ondostateofnigeria1 = findViewById(R.id.ondostateofnigeria1);
        ondostateofnigeria2 = findViewById(R.id.ondostateofnigeria2);
        civilservicerules = findViewById(R.id.civilservicerules1999);
        revisededition = findViewById(R.id.revisededition);
        preparedunder = findViewById(R.id.preparedunderauthority);
        executivegovernor = findViewById(R.id.executivegovernor);
        of = findViewById(R.id.of);
        july1999 = findViewById(R.id.july1999);

        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Medium.otf");
        Typeface customfont3= Typeface.createFromAsset(getAssets(), "Kylo-Light-Italic.otf");

        ondostateofnigeria1.setTypeface(customfont);
        civilservicerules.setTypeface(customfont2);
        revisededition.setTypeface(customfont2);
        preparedunder.setTypeface(customfont3);
        executivegovernor.setTypeface(customfont2);
        of.setTypeface(customfont3);
        ondostateofnigeria2.setTypeface(customfont2);
        july1999.setTypeface(customfont2);

        intent = new Intent(this,rule_main.class);
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
}
