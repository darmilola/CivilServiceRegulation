package com.servicematter.android.civilserviceregulation;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class MailingFragment extends Fragment {




    View view;
    LinearLayout linearLayout;
    TextView textView;
    Dialog loadingdialog;
    Dialog dialog;
    public MailingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view  =  inflater.inflate(R.layout.fragment_mailing, container, false);

        linearLayout = view.findViewById(R.id.mailusback);
        textView = view.findViewById(R.id.mailustext);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
        textView.setTypeface(customfont);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(getContext(),.class));

                displayDialog();
            }
        });
        return view;
    }


    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(5,R.drawable.rectanglemailing);
        }
    }

    private void displayDialog(){


        TextView emailtitle,subjecttitle,messagetitle;
        EditText emailvalue,subjectvalue,messagevalue;
        Button send;
        dialog = new Dialog(getContext(),android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.mailusdialog,null);
        dialog.setContentView(view);
        emailtitle = view.findViewById(R.id.mailusemailtitle);
        emailvalue = view.findViewById(R.id.mailusemailvalue);
        subjecttitle = view.findViewById(R.id.mailussubjecttitle);
        subjectvalue = view.findViewById(R.id.mailussubjectvalue);
        messagetitle = view.findViewById(R.id.mailusmessagetitle);
        messagevalue = view.findViewById(R.id.mailusmessagevalue);
        send = view.findViewById(R.id.mailussend);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");

        emailtitle.setTypeface(customfont);
        emailvalue.setTypeface(customfont);
        subjecttitle.setTypeface(customfont);
        subjectvalue.setTypeface(customfont);
        messagetitle.setTypeface(customfont);
        messagevalue.setTypeface(customfont);
        send.setTypeface(customfont);



        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailvalue.getText().toString().trim().equalsIgnoreCase("")){
                    emailvalue.setError("Required");
                }
                if(subjectvalue.getText().toString().trim().equalsIgnoreCase("")){
                    subjectvalue.setError("Required");
                }
                if(messagevalue.getText().toString().equalsIgnoreCase("")){
                    messagevalue.setError("Required");
                }

                String mEmail = emailvalue.getText().toString().trim();
                String mSubject = subjectvalue.getText().toString().trim();
                String mMessage = messagevalue.getText().toString().trim();


                new ContactUsTask(mEmail,mSubject,mMessage).execute();
            }

        });


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.9f);
        int dialogWindowHeight = (int) (displayHeight * 0.9f);

        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        dialog.getWindow().setAttributes(layoutParams);
        dialog.show();

    }





    public class ContactUsTask extends AsyncTask {
        String prompt;
        String user_email;
        String user_subject;
        String user_message;
        private String url = "http://jl-market.com/user/ContactUs.php";


        public ContactUsTask(String user_email,String user_subject,String user_message) {
            this.user_email = user_email;
            this.user_subject = user_subject;
            this.user_message = user_message;
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
            String serverResponse = new ContactUsData().GetData(url, user_email,user_subject,user_message);

            if (serverResponse != null) {
                try {
                    JSONObject jsonObject = new JSONObject(serverResponse);
                    JSONObject info = jsonObject.getJSONObject("info");
                    String status = info.getString("status");

                    if (status.equalsIgnoreCase("mail_sent")) {
                        prompt = "mail_sent";
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

                Toast.makeText(getContext(), "Error Occured is null", Toast.LENGTH_SHORT).show();
            }
            else if(result.toString().equalsIgnoreCase("mail_sent")){

                Toast.makeText(getContext(), "Mail Delivered Successfully", Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
            else{
                Toast.makeText(getContext(), result.toString(), Toast.LENGTH_SHORT).show();
            }

        }


    }
    public class ContactUsData {

        public String GetData(String url, String user_email,String user_subject, String user_message) {

            try {
                OkHttpClient client = new OkHttpClient.Builder()
                        .connectTimeout(50, TimeUnit.SECONDS)
                        .writeTimeout(50, TimeUnit.SECONDS)
                        .readTimeout(50, TimeUnit.SECONDS)
                        .build();

                RequestBody formBody = new FormBody.Builder()
                        .add("user_email", user_email)
                        .add("mail_subject",user_subject)
                        .add("mail_message",user_message)
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




    private void showloadingdialog() {
        loadingdialog = new Dialog(getContext(), android.R.style.Theme_Light);
        loadingdialog.setContentView(R.layout.loadingdialog);
        ImageView image = loadingdialog.findViewById(R.id.loadingimage);
        DrawableImageViewTarget imageViewTarget = new DrawableImageViewTarget(image);
        Glide.with(getContext()).load(R.drawable.loading).into(imageViewTarget);
        loadingdialog.setCancelable(false);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayWidth = displayMetrics.widthPixels;
        int displayHeight = displayMetrics.heightPixels;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(loadingdialog.getWindow().getAttributes());
        int dialogWindowWidth = (int) (displayWidth * 0.4f);
        int dialogWindowHeight = (int) (displayHeight * 0.3f);


        layoutParams.width = dialogWindowWidth;
        layoutParams.height = dialogWindowHeight;
        loadingdialog.getWindow().setAttributes(layoutParams);
        loadingdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#70000000")));
        loadingdialog.show();
    }

    private Boolean isNetworkAvailable() {

        ConnectivityManager connectivityManager = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

}
