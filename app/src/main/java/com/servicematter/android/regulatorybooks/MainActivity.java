package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title,preamble,chapters,search,keyword,bookmarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

      title = findViewById(R.id.main_title);

      preamble = findViewById(R.id.preamble);
      chapters = findViewById(R.id.chapters);
      search = findViewById(R.id.search);
      keyword = findViewById(R.id.search_key_word);

      bookmarks = findViewById(R.id.bookmarks);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Thin.otf");
        title.setTypeface(customfont);

        preamble.setTypeface(customfont);
        chapters.setTypeface(customfont);
        search.setTypeface(customfont);
        keyword.setTypeface(customfont);
        bookmarks.setTypeface(customfont);


        chapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Chapters.class));
            }
        });

        preamble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Preamble.class));
            }
        });


        bookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BookmarksPage.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Search.class));
            }
        });



    }
}
