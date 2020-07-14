package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Financial_Regulations_Coat_of_Arm extends AppCompatActivity {

    TextView ondostateofnigeria1,financialreg;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial__regulations__coat_of__arm);
        ondostateofnigeria1 = findViewById(R.id.ondostateofnigerial);
        financialreg = findViewById(R.id.financialregulations);

        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Medium.otf");

        ondostateofnigeria1.setTypeface(customfont);
        financialreg.setTypeface(customfont2);

        intent = new Intent(this,Financial_Main.class);
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
