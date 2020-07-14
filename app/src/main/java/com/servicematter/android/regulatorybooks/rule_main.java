package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class rule_main extends AppCompatActivity {

    TextView title,preface,chapters,search,keyword,bookmarks,appendix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rule_main);
        initView();

    }

    private void initView() {

        title = findViewById(R.id.main_title);

        preface = findViewById(R.id.preface);
        chapters = findViewById(R.id.chapters);
        search = findViewById(R.id.search);
        keyword = findViewById(R.id.search_key_word);
        appendix = findViewById(R.id.appendix);

        bookmarks = findViewById(R.id.bookmarks);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Thin.otf");
        title.setTypeface(customfont);

        appendix.setTypeface(customfont);
        preface.setTypeface(customfont);
        chapters.setTypeface(customfont);
        search.setTypeface(customfont);
        keyword.setTypeface(customfont);
        bookmarks.setTypeface(customfont);


        chapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rule_main.this,rules_chapter.class));
            }
        });

        preface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rule_main.this,Preface.class));
            }
        });

      /*  share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String text = "Download Civil Service Regulation 1999 of the Ondo state of Nigeria from playstore";
                share.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(share,"Civil Service Commission Regulation 1999"));
            }
        });*/

        bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rule_main.this,ruleBookmark.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rule_main.this,ruleSearch.class));
            }
        });

        appendix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(rule_main.this, com.servicematter.android.regulatorybooks.appendix.class));
            }
        });



    }

}
