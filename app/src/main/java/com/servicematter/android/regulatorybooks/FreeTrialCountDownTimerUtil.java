package com.servicematter.android.regulatorybooks;


import android.content.Context;

public class FreeTrialCountDownTimerUtil extends android.os.CountDownTimer {


    Context context;
    FreeTrialTimerProcessor freeTrialTimerProcessor = new FreeTrialTimerProcessor();
    public FreeTrialCountDownTimerUtil(long millisInFuture, long countDownInterval, Context mcontext) {
        super(millisInFuture, countDownInterval);
        this.context = mcontext;

    }

    @Override
    public void onTick(long millisUntilFinished) {

         freeTrialTimerProcessor.PutTimeRemainingFromTrialCountDownTimer(context,millisUntilFinished);

    }

    @Override
    public void onFinish() {



    }

}