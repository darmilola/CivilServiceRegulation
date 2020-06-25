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

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }



    public ArrayList<Finance_Articles> GetChapters() {
        List<Finance_Section> section1 = appdatabase.finance_dao().FindSectionByCategory("cat1");
        List<Finance_Section> section2 = appdatabase.finance_dao().FindSectionByCategory("cat2");

        List<Finance_Section> section3 = appdatabase.finance_dao().FindSectionByCategory("cat3");
        List<Finance_Section> section4 = appdatabase.finance_dao().FindSectionByCategory("cat4");

        List<Finance_Section> section5 = appdatabase.finance_dao().FindSectionByCategory("cat5");
        List<Finance_Section> section6 = appdatabase.finance_dao().FindSectionByCategory("cat6");

        //List<Finance_Section> section6 = appdatabase.finance_dao().FindSectionByCategory("cat6");


        Finance_Articles article1 = new Finance_Articles("Article 1","INTRODUCTION",section1);
        Finance_Articles article2 = new Finance_Articles("Article 2","FINANCIAL RESPONSIBLITIES OF PUBLIC OFFICERS",section2);

        Finance_Articles article3 = new Finance_Articles("Article 3","SELF-ACCOUNTING MINSITRIES, DEPARTMENTS AND AGENCY",section3);
        Finance_Articles article4 = new Finance_Articles("Article 4","ACCOUNTING PROCEDURES",section4);

        Finance_Articles article5 = new Finance_Articles("Article 5","TREASURY DEPARTMENT OF THE MINSITRY OF FINANCE AND TREASURY CASH OFFICES",section5);
        Finance_Articles article6 = new Finance_Articles("Article 6","REVENUE COLLECTION AND ACCOUNTING ",section6);

        ArrayList<Finance_Articles> makeArticle = new ArrayList<>();


        makeArticle.add(article1);
        makeArticle.add(article2);
        makeArticle.add(article3);
        makeArticle.add(article4);
        makeArticle.add(article5);
        makeArticle.add(article6);

        return  makeArticle;
    }

}
