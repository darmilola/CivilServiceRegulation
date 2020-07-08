package com.servicematter.android.civilserviceregulation;


import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class Procurement_Chapter extends AppCompatActivity {


    RecyclerView recyclerView;
    Procurement_Adapter adapter;
    Toolbar toolbar;
    TextView title;
    Procurement_Dao procurement_dao;
    Procurement_Database appdatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procurement__chapter);
        initView();

    }

    private void initView() {


        appdatabase = Room.databaseBuilder(this, Procurement_Database.class, "Procurement_Section").allowMainThreadQueries().build();
        toolbar = findViewById(R.id.chapters_toolbar);
        recyclerView = findViewById(R.id.chapters_recyclerview);
        title = findViewById(R.id.chapter_title);
        Typeface customfont2 = Typeface.createFromAsset(getAssets(), "Kylo-Thin.otf");
        title.setTypeface(customfont2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }

        adapter = new Procurement_Adapter(GetChapters(), this);
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




    public ArrayList<Procurement_Article> GetChapters(){
        List<Procurement_Section> section1 = appdatabase.procurement_dao().FindSectionByCategory("cat1");
        List<Procurement_Section> section2 = appdatabase.procurement_dao().FindSectionByCategory("cat2");
        List<Procurement_Section> section3 = appdatabase.procurement_dao().FindSectionByCategory("cat3");
        List<Procurement_Section> section4 = appdatabase.procurement_dao().FindSectionByCategory("cat4");
        List<Procurement_Section> section5 = appdatabase.procurement_dao().FindSectionByCategory("cat5");
        List<Procurement_Section> section6 = appdatabase.procurement_dao().FindSectionByCategory("cat6");
        List<Procurement_Section> section7 = appdatabase.procurement_dao().FindSectionByCategory("cat7");
        List<Procurement_Section> section8 = appdatabase.procurement_dao().FindSectionByCategory("cat8");
        List<Procurement_Section> section9 = appdatabase.procurement_dao().FindSectionByCategory("cat9");
        List<Procurement_Section> section10 = appdatabase.procurement_dao().FindSectionByCategory("cat10");
        List<Procurement_Section> section11 = appdatabase.procurement_dao().FindSectionByCategory("cat11");
        List<Procurement_Section> section12= appdatabase.procurement_dao().FindSectionByCategory("cat12");
        List<Procurement_Section> section13 = appdatabase.procurement_dao().FindSectionByCategory("cat13");



        Procurement_Article article1 = new Procurement_Article("Article 1","ESTABLISHMENT OF STATE BOARD ON PUBLIC PROCUREMENT  ",section1);
        Procurement_Article article2 = new Procurement_Article("Article 2","ESTABLISHMENT TO THE STATE BUREAU OF PUBLIC PROCUREMENT   ",section2);
        Procurement_Article article3 = new Procurement_Article("Article 3","SCOPE OF APPLICATION   ",section3);
        Procurement_Article article4 = new Procurement_Article("Article 4","FUNDAMENTAL PRINCIPLES FOR PROCUREMENTS   ",section4);
        Procurement_Article article5 = new Procurement_Article("Article 5","ORGANISATION OF PROCUREMENTS    ",section5);
        Procurement_Article article6 = new Procurement_Article("Article 6","PROCUREMENT METHODS (GOODS AND SERVICES)    ",section6);
        Procurement_Article article7 = new Procurement_Article("Article 7","SPECIAL AND RESTRICTED METHODS OF PROCUREMENT    ",section7);
        Procurement_Article article8 = new Procurement_Article("Article 8","PROCUREMENT CONSULTANT (SERVICES)    ",section8);
        Procurement_Article article9 = new Procurement_Article("Article 9"," PROCUREMENT SURVEILIANCE AND REVIEW     ",section9);
        Procurement_Article article10 = new Procurement_Article("Article 10","DISPOSAL OF PUBLIC PROPERTY      ",section10);
        Procurement_Article article11 = new Procurement_Article("Article 11","CODE OF CONDUCT    ",section11);
        Procurement_Article article12 = new Procurement_Article("Article 12","OFFENCES    ",section12);
        Procurement_Article article13 = new Procurement_Article("Article 13","MISCELLANEOUS     ",section13);


        ArrayList<Procurement_Article> makeArticle = new ArrayList<>();
        makeArticle.add(article1);
        makeArticle.add(article2);
        makeArticle.add(article3);
        makeArticle.add(article4);
        makeArticle.add(article5);
        makeArticle.add(article6);
        makeArticle.add(article7);
        makeArticle.add(article8);
        makeArticle.add(article9);
        makeArticle.add(article10);
        makeArticle.add(article11);
        makeArticle.add(article12);
        makeArticle.add(article13);

        return makeArticle;
    }

}
