package com.servicematter.android.civilserviceregulation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eftimoff.viewpagertransformers.BackgroundToForegroundTransformer;


public class DashBoard extends AppCompatActivity {


    FragmentPagerAdapter adapter;
    ViewPager pager;
    Button upgrade;
    static LinearLayout dasboard_background;
    static TextView pagecount,pagenumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        pager = findViewById(R.id.dashboard_pager);
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

        Dialog dialog;
        dialog = new Dialog(DashBoard.this,android.R.style.Theme_Light);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = LayoutInflater.from(DashBoard.this).inflate(R.layout.payment_dialog,null);
        dialog.setContentView(view);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.rectanglemailing);
        Bitmap blurredBit =  BlurBuilder.blur(this,bitmap);
        BitmapDrawable background = new BitmapDrawable(getResources(),blurredBit);
        LinearLayout root = view.findViewById(R.id.payment_dialog_root);
        root.setBackground(background);

        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
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
}
