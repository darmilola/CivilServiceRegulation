package com.servicematter.android.civilserviceregulation;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Procurement_Main extends AppCompatActivity {

    TextView title,chapters,search,keyword,bookmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procurement__main);


        title = findViewById(R.id.procurement_main_title);
        chapters = findViewById(R.id.procurement_chapters);
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
                startActivity(new Intent(Procurement_Main.this,Procurement_Chapter.class));
            }
        });





        bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Procurement_Main.this,Procurement_Bookmark.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Procurement_Main.this,Procurement_Search.class));
            }
        });



    }

}




