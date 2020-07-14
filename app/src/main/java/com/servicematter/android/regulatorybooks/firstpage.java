package com.servicematter.android.regulatorybooks;


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
public class firstpage extends Fragment {

    View view;
    LinearLayout linearLayout;
    TextView textView;

    public firstpage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_firstpage, container, false);
         linearLayout = view.findViewById(R.id.firstpageback);
         textView = view.findViewById(R.id.firstpagetext);
         Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
         textView.setTypeface(customfont);

         linearLayout.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(getContext(),Civil_Service_Rules_Coat_Of_Arm.class));

             }
         });
         return view;
    }


    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(1,R.drawable.rules);
        }
    }
}
