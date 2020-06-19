package com.servicematter.android.civilserviceregulation;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;


public class aboutus extends Fragment {

    View view;
    LinearLayout linearLayout;
    TextView textView;
    public aboutus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_aboutus, container, false);

        linearLayout = view.findViewById(R.id.aboutpageback);
        textView = view.findViewById(R.id.aboutpagetext);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
        textView.setTypeface(customfont);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog();

            }
        });

        return view;
    }
    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(3,R.drawable.about);
        }
    }


    private void displayDialog(){

        Dialog dialog;
        dialog = new Dialog(getContext(),android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.about_dialog_text,null);
        TextView textView = view.findViewById(R.id.about_dialog_text);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
        textView.setTypeface(customfont);
        dialog.setContentView(view);
        dialog.show();
    }
}
