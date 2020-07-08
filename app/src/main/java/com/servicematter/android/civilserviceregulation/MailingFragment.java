package com.servicematter.android.civilserviceregulation;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MailingFragment extends Fragment {




    View view;
    LinearLayout linearLayout;
    TextView textView;
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

        Dialog dialog;
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
}
