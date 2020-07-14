package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Preamble extends AppCompatActivity {

    Toolbar toolbar;
    TextView preamble_title,preamble_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preamble);
        toolbar = findViewById(R.id.preamble_toolbar);
        preamble_title = findViewById(R.id.preamble_title);
        preamble_text = findViewById(R.id.preamble_text);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Thin.otf");

        preamble_text.setTypeface(customfont2);
        preamble_title.setTypeface(customfont);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.White), PorterDuff.Mode.SRC_ATOP);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

    }
}
