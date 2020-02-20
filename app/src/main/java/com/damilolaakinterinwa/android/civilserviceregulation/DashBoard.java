package com.damilolaakinterinwa.android.civilserviceregulation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eftimoff.viewpagertransformers.BackgroundToForegroundTransformer;
import com.zhpan.bannerview.transform.AccordionTransformer;

public class DashBoard extends AppCompatActivity {


    FragmentPagerAdapter adapter;
    ViewPager pager;
    static LinearLayout dasboard_background;
    static TextView pagecount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        pager = findViewById(R.id.dashboard_pager);
        dasboard_background = findViewById(R.id.dashboard_background);
        pagecount = findViewById(R.id.pagecount);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        pagecount.setTypeface(customfont);
        pager.setPageMargin(30);
        adapter = new MypagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new BackgroundToForegroundTransformer());


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("firsttime",false);
        editor.commit();

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

                    return new thirdpage();



            }
            return null;
        }
            @Override
            public int getCount () {
                return 3;
            }

    }

    public static void AuthPage(int mpagecount,int Background){
        pagecount.setText(Integer.toString(mpagecount));
        dasboard_background.setBackgroundResource(Background);

    }
}
