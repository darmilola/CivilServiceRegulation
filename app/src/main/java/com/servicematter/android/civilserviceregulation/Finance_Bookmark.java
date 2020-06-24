package com.servicematter.android.civilserviceregulation;

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

public class Finance_Bookmark extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;
    TextView title;
    finance_bookmark_database bookmarksDatabase;
    List<Finance_Bookmark_Model> sectionList;
    TextView nobookmark;
    Finance_Bookmark_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance__bookmark);


        initView();
        initDatabase();

        adapter = new Finance_Bookmark_Adapter(sectionList);
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
        bookmarksDatabase = Room.databaseBuilder(this,finance_bookmark_database.class,"finance_bookmark_db").allowMainThreadQueries().build();
        sectionList = bookmarksDatabase.finance_bookmark_dao().getAll();

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
