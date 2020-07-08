package com.servicematter.android.civilserviceregulation;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class thirdpage extends Fragment {
    View view;
    LinearLayout linearLayout;
    TextView textView;

    public thirdpage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_thirdpage, container, false);
        linearLayout = view.findViewById(R.id.thirdpageback);
        textView = view.findViewById(R.id.thirdpagetext);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
        textView.setTypeface(customfont);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String text = "Download Civil Service Rule and Civil Service commission Regulation 1999 of the Ondo state of Nigeria from playstore  http://play.google.com/store/apps/details?id=com.servicematter.android.civilserviceregulation";
                share.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(share,"Share"));

            }
        });

                return view;
    }
    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(7,R.drawable.share);
        }
    }

}
