package com.servicematter.android.civilserviceregulation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Finance_Chapter extends AppCompatActivity {


    RecyclerView recyclerView;
    Finance_Adapter adapter;
    Toolbar toolbar;
    TextView title;
    finance_dao sectionDao;
    Finance_Database appdatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance__chapter);
        initView();
    }



    private void initView(){


        appdatabase = Room.databaseBuilder(this, Finance_Database.class,"finance_db").allowMainThreadQueries().build();
        toolbar = findViewById(R.id.chapters_toolbar);
        recyclerView = findViewById(R.id.chapters_recyclerview);
        title = findViewById(R.id.chapter_title);
        Typeface customfont2= Typeface.createFromAsset(getAssets(), "Kylo-Thin.otf");
        title.setTypeface(customfont2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if(animator instanceof DefaultItemAnimator){
            ((DefaultItemAnimator)animator).setSupportsChangeAnimations(false);
        }

        adapter = new Finance_Adapter(GetChapters(),this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setTitle("");
        toolbar.getNavigationIcon().setColorFilter(getResources().getColor(R.color.White), PorterDuff.Mode.SRC_ATOP);


        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }



    public ArrayList<Finance_Articles> GetChapters() {
        List<Finance_Section> section1 = appdatabase.finance_dao().FindSectionByCategory("cat1");
        Finance_Articles article1 = new Finance_Articles("Article 1","INTRODUCTION",section1);

        ArrayList<Finance_Articles> makeArticle = new ArrayList<>();


        makeArticle.add(article1);


        return  makeArticle;
    }

}
