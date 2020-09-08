package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import co.paystack.android.Paystack;
import co.paystack.android.PaystackSdk;
import co.paystack.android.Transaction;
import co.paystack.android.exceptions.ChargeException;
import co.paystack.android.exceptions.ExpiredAccessCodeException;
import co.paystack.android.exceptions.InvalidEmailException;
import co.paystack.android.model.Card;
import co.paystack.android.model.Charge;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.eftimoff.viewpagertransformers.BackgroundToForegroundTransformer;
import com.manojbhadane.PaymentCardView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class DashBoard extends AppCompatActivity {


    FragmentPagerAdapter adapter;
    ViewPager pager;
    Button upgrade;
    static LinearLayout dasboard_background;
    static TextView pagecount,pagenumbers;
    Dialog loadingdialog;
    Dialog dialog;
    boolean isActivated;
    TextView fiveDaysTrial;
    FreeTrialTimerProcessor freeTrialTimerProcessor = new FreeTrialTimerProcessor();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        PaystackSdk.initialize(DashBoard.this);
        SharedPreferences preferences2 = PreferenceManager.getDefaultSharedPreferences(DashBoard.this);
        isActivated = preferences2.getBoolean("isActivated",false);
        if(!isActivated){
            processFreeTrialTimeRemaining();
        }

        pager = findViewById(R.id.dashboard_pager);
        fiveDaysTrial = findViewById(R.id.fivedaystrial);
        dasboard_background = findViewById(R.id.dashboard_background);
        pagecount = findViewById(R.id.pagecount);
        pagenumbers = findViewById(R.id.pagenumbers);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        pagecount.setTypeface(customfont);
        pagenumbers.setTypeface(customfont);
        //pager.setPageMargin(30);
        adapter = new MypagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new BackgroundToForegroundTransformer());
        upgrade = findViewById(R.id.upgrade_button);
        upgrade.setTypeface(customfont);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("firsttime",false);
        editor.commit();

        upgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog();
            }
        });

        if(isActivated){
            fiveDaysTrial.setVisibility(View.GONE);
            upgrade.setVisibility(View.GONE);
        }

    }


    private class MypagerAdapter extends FragmentPagerAdapter {


        public MypagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {

                case 0:

                    return new firstpage();

                case 1:

                    return new secondpage();

                case 2:
                    return new fragment_financeregulation();

                case 3:
                    return new Procurement_fragment();
                case 4:

                    return new MailingFragment();
                case 5:


                    return new aboutus();
                case 6:
                    return new thirdpage();




            }
            return null;
        }
            @Override
            public int getCount () {
                return 7;
            }

    }

    public static void AuthPage(int mpagecount,int Background){
        pagecount.setText(Integer.toString(mpagecount));
        dasboard_background.setBackgroundResource(Background);

    }


    private void displayDialog(){


        EditText email,activationkey;
        TextView oractivate,checkmail;
        MyPaymentCardView myPaymentCardView;
        Button activate;
        int amountToPay = 500;

        dialog = new Dialog(DashBoard.this,android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(DashBoard.this).inflate(R.layout.payment_dialog,null);
        dialog.setContentView(view);

        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");

        email = view.findViewById(R.id.payment_dialog_email);
        activate = view.findViewById(R.id.payment_dialog_activate_button);
        activationkey = view.findViewById(R.id.payment_dialog_activation_key_value);
        oractivate = view.findViewById(R.id.payment_dialog_or_activate);
        checkmail = view.findViewById(R.id.payment_dialog_activation_key_send_to_mail);
        myPaymentCardView = view.findViewById(R.id.cardview_payment);
        email.setTypeface(customfont);
        activate.setTypeface(customfont);
        activationkey.setTypeface(customfont);
        oractivate.setTypeface(customfont);
        checkmail.setTypeface(customfont);


        myPaymentCardView.setOnPaymentCardEventListener(new PaymentCardView.OnPaymentCardEventListener() {
            @Override
            public void onCardDetailsSubmit(String month, String year, String cardNumber, String cvv) {

                 if(email.getText().toString().trim().equalsIgnoreCase("")){

                     Toast.makeText(DashBoard.this, "Please Provide your Email", Toast.LENGTH_SHORT).show();
                     email.setError("Required");
                 }
                 else{

                     ProcessPaystackPayment(email.getText().toString().trim(),amountToPay,cardNumber,Integer.parseInt(month),Integer.parseInt(year),cvv);
                     email.setError(null);

                 }



            }

            @Override
            public void onError(String error) {

                Toast.makeText(DashBoard.this, "Please Provide your card details", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onCancelClick() {

            }
        });




        activate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(activationkey.getText().toString().trim().equalsIgnoreCase("")){
                    activationkey.setError("Required");
                }
                if(email.getText().toString().trim().equalsIgnoreCase("")){
                    email.setError("Required");
                }
                else{
                    String mActivationKey = activationkey.getText().toString().trim();
                    String mEmail = email.getText().toString().trim();

                    new processActivationKeytask(mEmail,mActivationKey).execute();

                }
            }
        });




        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.rectanglemailing);
        Bitmap blurredBit =  BlurBuilder.blur(this,bitmap);
        BitmapDrawable background = new BitmapDrawable(getResources(),blurredBit);
        LinearLayout root = view.findViewById(R.id.payment_dialog_root);
        root.setBackground(background);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.9f);
        int dialogWindowHeight = (int) (displayHeight * 0.9f);


        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#70000000")));
        dialog.show();

    }



    private void ProcessPaystackPayment(String email, int amounttopay, String cardnum,int expirymonth,int expiryyear,String cvv){

        Card card = new Card(cardnum, expirymonth, expiryyear, cvv);
        showloadingdialog();
        if (card.isValid()) {

            Charge charge = new Charge();
            charge.setCard(card);
            charge.setAmount(amounttopay * 100);

            try {
                charge.setEmail(email);
            } catch (InvalidEmailException E) {
                loadingdialog.dismiss();
                Toast.makeText(DashBoard.this, "Invalid Email", Toast.LENGTH_LONG).show();
            }
            PaystackSdk.chargeCard(DashBoard.this, charge, new Paystack.TransactionCallback() {
                @Override
                public void onSuccess(Transaction transaction) {
                    new processpaymenttask(email).execute();

                }

                @Override
                public void beforeValidate(Transaction transaction) {

                    //Toast.makeText(getContext(), "before validate", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onError(Throwable error, Transaction transaction) {

                    loadingdialog.dismiss();

                    //4084 0840 8408 4081  11 21 408


                       if (!isNetworkAvailable()) {
                        Toast.makeText(DashBoard.this, "No Network Connection", Toast.LENGTH_SHORT).show();
                    } else {
                         if(error instanceof ExpiredAccessCodeException){

                             Toast.makeText(DashBoard.this, "Expired Code", Toast.LENGTH_SHORT).show();
                         }
                         else if(error instanceof ChargeException){

                             Toast.makeText(DashBoard.this, "Card Error", Toast.LENGTH_SHORT).show();
                         }

                        //Toast.makeText(DashBoard.this, "Error Occured", Toast.LENGTH_LONG).show();
                    }

                }
            });

        } else {
            loadingdialog.dismiss();
            Toast.makeText(DashBoard.this, "Card not valid", Toast.LENGTH_SHORT).show();
        }

    }

    private Boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void showloadingdialog() {
        loadingdialog = new Dialog(DashBoard.this, android.R.style.Theme_Light);
        loadingdialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        loadingdialog.setContentView(R.layout.loadingdialog);
        ImageView image = loadingdialog.findViewById(R.id.loadingimage);
        DrawableImageViewTarget imageViewTarget = new DrawableImageViewTarget(image);
        Glide.with(DashBoard.this).load(R.drawable.loading).into(imageViewTarget);
        loadingdialog.setCancelable(false);
     
        loadingdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        loadingdialog.show();
    }






    public class processpaymenttask extends AsyncTask {
        String prompt;
        String user_email;
        private String url = "http://jl-market.com/user/process_user_key.php";


        public processpaymenttask(String user_email) {
            this.user_email = user_email;
        }

        @Override
        protected void onPreExecute() {

        }


        @Override
        protected Object doInBackground(Object[] objects) {

            if (!isNetworkAvailable()) {
                prompt = "No Network Connection";
                return prompt;
            }
            String serverResponse = new processpayment().GetData(url, user_email);

            if (serverResponse != null) {
                try {
                    JSONObject jsonObject = new JSONObject(serverResponse);
                    JSONObject info = jsonObject.getJSONObject("info");
                    String status = info.getString("status");

                    if (status.equalsIgnoreCase("payment_successful")) {
                        prompt = "payment_successful";
                        return prompt;
                    }

                } catch (JSONException e) {
                    e.printStackTrace();

                }
            }
            return serverResponse;
        }

        protected void onPostExecute(Object result) {
            loadingdialog.dismiss();

            if(result == null){

                Toast.makeText(DashBoard.this, "Error Occured is null", Toast.LENGTH_SHORT).show();
            }
            else if(result.toString().equalsIgnoreCase("payment_successful")){

                Toast.makeText(DashBoard.this, "Payment Successful Please Check your mail to get Your Activation Key", Toast.LENGTH_LONG).show();
                //dialog.dismiss();
            }
            else{
                Toast.makeText(DashBoard.this, result.toString(), Toast.LENGTH_SHORT).show();
            }

        }


    }
    public class processpayment {

        public String GetData(String url, String user_email) {

            try {
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(50, TimeUnit.SECONDS)
                        .writeTimeout(50, TimeUnit.SECONDS)
                        .readTimeout(50, TimeUnit.SECONDS)
                        .build();

                RequestBody formBody = new FormBody.Builder()
                        .add("user_email", user_email)
                        .build();

                Request request = new Request.Builder().url(url).post(formBody).build();
                Response response = client.newCall(request).execute();
                String data = response.body().string();
                return data;

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }






    public class processActivationKeytask extends AsyncTask {
        String prompt;
        String user_email;
        String activation_key;
        private String url = "http://jl-market.com/user/validate_user_key.php";


        public processActivationKeytask(String user_email,String activationkey) {
            this.user_email = user_email;
            this.activation_key = activationkey;
        }

        @Override
        protected void onPreExecute() {
               showloadingdialog();
        }


        @Override
        protected Object doInBackground(Object[] objects) {

            if (!isNetworkAvailable()) {
                prompt = "No Network Connection";
                return prompt;
            }
            String serverResponse = new processactivation().GetData(url, user_email,activation_key);

            if (serverResponse != null) {
                try {
                    JSONObject jsonObject = new JSONObject(serverResponse);
                    JSONObject info = jsonObject.getJSONObject("info");
                    String status = info.getString("status");

                    if (status.equalsIgnoreCase("valid_key")) {
                        prompt = "valid_key";
                        return prompt;
                    }

                } catch (JSONException e) {
                    e.printStackTrace();

                }
            }
            return serverResponse;
        }

        protected void onPostExecute(Object result) {
            loadingdialog.dismiss();

            if(result == null){

                Toast.makeText(DashBoard.this, "Error Occured", Toast.LENGTH_SHORT).show();
            }
            else if(result.toString().equalsIgnoreCase("valid_key")){

                dialog.dismiss();
                fiveDaysTrial.setVisibility(View.GONE);
                upgrade.setVisibility(View.GONE);
                Toast.makeText(DashBoard.this, "Regulatory Books Successfully Activated", Toast.LENGTH_LONG).show();

                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(DashBoard.this);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putBoolean("isActivated",true);
                editor.commit();



            }
            else if(result.toString().equalsIgnoreCase("No Network Connection")){

                Toast.makeText(DashBoard.this, "No Network Connection", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(DashBoard.this, "Invalid Activation Key", Toast.LENGTH_SHORT).show();

            }

        }


    }
    public class processactivation {

        public String GetData(String url, String user_email,String user_key) {

            try {
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(50, TimeUnit.SECONDS)
                        .writeTimeout(50, TimeUnit.SECONDS)
                        .readTimeout(50, TimeUnit.SECONDS)
                        .build();

                RequestBody formBody = new FormBody.Builder()
                        .add("user_email", user_email)
                        .add("user_activation_key",user_key)
                        .build();

                Request request = new Request.Builder().url(url).post(formBody).build();
                Response response = client.newCall(request).execute();
                String data = response.body().string();
                return data;

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public void processFreeTrialTimeRemaining(){

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(DashBoard.this);
        boolean isFirstTime = preferences.getBoolean("firsttime",true);
        if(isFirstTime){

        }
        else {

            long timeremaining = freeTrialTimerProcessor.ProcessFreeTrialTimeRemaining(DashBoard.this);
            Log.e("Time Remaining   ", Long.toString(timeremaining));
            if (timeremaining <= 0) {
                displayDialog();
                dialog.setCancelable(false);
            }

        }
    }

}


