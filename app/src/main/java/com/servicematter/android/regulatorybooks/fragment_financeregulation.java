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


public class fragment_financeregulation extends Fragment {


    View view;
    LinearLayout linearLayout;
    TextView textView;
    public fragment_financeregulation() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fragment_financeregulation, container, false);
        linearLayout = view.findViewById(R.id.finance_reg_back);
        textView = view.findViewById(R.id.finance_reg_text);
        Typeface customfont= Typeface.createFromAsset(getActivity().getAssets(), "Kylo-Light.otf");
        textView.setTypeface(customfont);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),Financial_Regulations_Coat_of_Arm.class));

            }
        });
        return view;
    }


    @Override
    public void setUserVisibleHint(boolean isvisibletouser) {
        super.setUserVisibleHint(isvisibletouser);

        if (isvisibletouser) {

            DashBoard.AuthPage(3,R.drawable.portraitfinance);
        }
    }
}
