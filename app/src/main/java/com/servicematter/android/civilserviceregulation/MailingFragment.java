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

            }
        });
        return view;
    }


    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(4,R.drawable.rectanglemailing);
        }
    }

    private void displayDialog(){

        Dialog dialog;
        dialog = new Dialog(getContext(),android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.mailusdialog,null);
        dialog.setContentView(view);

        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");




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
