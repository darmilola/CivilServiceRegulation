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


import java.util.*;
import java.util.List;

public class rules_chapter extends AppCompatActivity {

    RecyclerView recyclerView;
    RuleAdapter adapter;
    Toolbar toolbar;
    TextView title;
    SectionDao sectionDao;
    rulesDatabase appdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules_chapter);
        initView();
    }

    private void initView(){


        appdatabase = Room.databaseBuilder(this, rulesDatabase.class,"ruledb").allowMainThreadQueries().build();
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

        adapter = new RuleAdapter(GetChapters(),this);
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


    public ArrayList<rulesArticles> GetChapters() {
        List<Rules_Section> section1 = appdatabase.rulesDao().FindSectionByCategory("cat1");
        List<Rules_Section> section2 = appdatabase.rulesDao().FindSectionByCategory("cat2");
        List<Rules_Section> section3 = appdatabase.rulesDao().FindSectionByCategory("cat3");
        List<Rules_Section> section4 = appdatabase.rulesDao().FindSectionByCategory("cat4");

        List<Rules_Section> section5 = appdatabase.rulesDao().FindSectionByCategory("cat5");
         List<Rules_Section> section7 = appdatabase.rulesDao().FindSectionByCategory("cat7");

        List<Rules_Section> section10 = appdatabase.rulesDao().FindSectionByCategory("cat10");
        List<Rules_Section> section11 = appdatabase.rulesDao().FindSectionByCategory("cat11");

        List<Rules_Section> section12 = appdatabase.rulesDao().FindSectionByCategory("cat12");
        List<Rules_Section> section13 = appdatabase.rulesDao().FindSectionByCategory("cat13");

        List<Rules_Section> section14 = appdatabase.rulesDao().FindSectionByCategory("cat14");
        List<Rules_Section> section15 = appdatabase.rulesDao().FindSectionByCategory("cat15");
        List<Rules_Section> section16 = appdatabase.rulesDao().FindSectionByCategory("cat16");
        List<Rules_Section> section17 = appdatabase.rulesDao().FindSectionByCategory("cat17");

        List<Rules_Section> section18 = appdatabase.rulesDao().FindSectionByCategory("cat18");
        List<Rules_Section> section19 = appdatabase.rulesDao().FindSectionByCategory("cat19");
        List<Rules_Section> section20 = appdatabase.rulesDao().FindSectionByCategory("cat20");
        List<Rules_Section> section21 = appdatabase.rulesDao().FindSectionByCategory("cat21");

        List<Rules_Section> section22 = appdatabase.rulesDao().FindSectionByCategory("cat22");
        List<Rules_Section> section23 = appdatabase.rulesDao().FindSectionByCategory("cat23");
        List<Rules_Section> section24 = appdatabase.rulesDao().FindSectionByCategory("cat24");


        rulesArticles article1 = new rulesArticles("Article 1","INTRODUCTION",section1);
        rulesArticles article2 = new rulesArticles("Article 2","APPOINTMENT, PROMOTIONS, TRANSFERS, LEAVING THE SERVICE, \n" +
                "AND FUNCTIONS OF THE STATE CIVIL SERVICE COMMISSION\n",section2);

        rulesArticles article3 = new rulesArticles("Article 3","Women Officers  ",section3);
        rulesArticles article4 = new rulesArticles("Article 4","Disciplinary Procedure",section4);


        rulesArticles article5 = new rulesArticles("Article 5","Salaries and Increments ",section5);
        rulesArticles article7 = new rulesArticles("Article 7","Prescribed Examinations and Tests  ",section7);

        rulesArticles article10 = new rulesArticles("Article 10","Medical and Dental Procedure",section10);
        rulesArticles article11 = new rulesArticles("Article 11","Residence in Nigeria of Wives and Children of Expatriate Officers",section11);

        rulesArticles article12 = new rulesArticles("Article 12","Equipment, Compensation, Insurance and Personal Effects",section12);
        rulesArticles article13 = new rulesArticles("Article 13","Petitions",section13);

        rulesArticles article14 = new rulesArticles("Article 14","Occupation of Government Quarters ",section14);
        rulesArticles article15 = new rulesArticles("Article 15","Leave",section15);

        rulesArticles article16 = new rulesArticles("Article 16","Passages ",section16);
        rulesArticles article17 = new rulesArticles("Article 17","Free Transport Facilities within Nigeria",section17);


        rulesArticles article18 = new rulesArticles("Article 18","Duties and Courses of Instructions Locally and outside Nigeria  ",section18);
        rulesArticles article19 = new rulesArticles("Article 19","Allowances (General)",section19);


        rulesArticles article20 = new rulesArticles("Article 20","Acting Appointments and Allowances ",section20);
        rulesArticles article21 = new rulesArticles("Article 21","Transport Allowances   ",section21);
        rulesArticles article22 = new rulesArticles("Article 22","Local Travelling Allowance",section22);
        rulesArticles article23 = new rulesArticles("Article 23","Inventions",section23);
        rulesArticles article24 = new rulesArticles("Article 24","Overtime",section24);









        ArrayList<rulesArticles> makeArticle = new ArrayList<>();

        makeArticle.add(article1);
        makeArticle.add(article2);
        makeArticle.add(article3);
        makeArticle.add(article4);

        makeArticle.add(article5);
        makeArticle.add(article7);
        makeArticle.add(article10);
        makeArticle.add(article11);

        makeArticle.add(article12);
        makeArticle.add(article13);
        makeArticle.add(article14);
        makeArticle.add(article15);

        makeArticle.add(article16);
        makeArticle.add(article17);
        makeArticle.add(article18);
        makeArticle.add(article19);

        makeArticle.add(article20);
        makeArticle.add(article21);
        makeArticle.add(article22);
        makeArticle.add(article23);
        makeArticle.add(article24);

        return  makeArticle;
    }

    }
