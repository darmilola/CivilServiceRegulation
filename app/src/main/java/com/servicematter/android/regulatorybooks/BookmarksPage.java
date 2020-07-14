package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class BookmarksPage extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;
    TextView title;
    BookmarksDatabase bookmarksDatabase;
    List<Bookmarks> sectionList;
    TextView nobookmark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmarks_page);
        initView();
        initDatabase();

       BookmarkAdapter adapter = new BookmarkAdapter(sectionList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        if(sectionList.size() == 0){
            recyclerView.setVisibility(View.GONE);
            nobookmark.setVisibility(View.VISIBLE);
        }
        else{
            recyclerView.setVisibility(View.VISIBLE);
            nobookmark.setVisibility(View.GONE);
        }

    }

    private void initDatabase(){
        bookmarksDatabase = Room.databaseBuilder(this, BookmarksDatabase.class,"bookmarksdb").allowMainThreadQueries().build();
        sectionList = bookmarksDatabase.bookmarksDao().getAll();

    }

    private void initView(){
        recyclerView = findViewById(R.id.bookmark_recyclerview);
        title = findViewById(R.id.bookmark_toolbar_title);
        toolbar = findViewById(R.id.bookmark_toolbar);
        nobookmark = findViewById(R.id.bookmark_no_bookmarks);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        title.setTypeface(customfont);
        nobookmark.setTypeface(customfont);
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
