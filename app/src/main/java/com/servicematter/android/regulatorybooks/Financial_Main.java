package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Financial_Main extends AppCompatActivity {

    TextView title,chapters,search,keyword,bookmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial__main);


        title = findViewById(R.id.finance_main_title);
        chapters = findViewById(R.id.finance_chapters);
        search = findViewById(R.id.search);
        keyword = findViewById(R.id.search_key_word);
        bookmarks = findViewById(R.id.bookmarks);


        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        title.setTypeface(customfont);
        chapters.setTypeface(customfont);
        search.setTypeface(customfont);
        keyword.setTypeface(customfont);
        bookmarks.setTypeface(customfont);




        chapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Financial_Main.this,Finance_Chapter.class));
            }
        });





        bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Financial_Main.this,Finance_Bookmark.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Financial_Main.this,Finance_Search.class));
            }
        });



    }
}
