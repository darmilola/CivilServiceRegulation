package com.servicematter.android.regulatorybooks;

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


public class Chapters extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticleAdapter adapter;
    Toolbar toolbar;
    TextView title;
    SectionDao sectionDao;
    AppDatabase appdatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters);
        initView();

    }

    private void initView(){


        appdatabase = Room.databaseBuilder(this, AppDatabase.class,"mydb").allowMainThreadQueries().build();
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

        adapter = new ArticleAdapter(GetChapters(),this);
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


    public   ArrayList<Article> GetChapters(){
        List<Section> section1 = appdatabase.sectionDao().FindSectionByCategory("cat1");
        List<Section> section2 = appdatabase.sectionDao().FindSectionByCategory("cat2");

        List<Section> section3 = appdatabase.sectionDao().FindSectionByCategory("cat3");
        List<Section> section4 = appdatabase.sectionDao().FindSectionByCategory("cat4");


        List<Section> section5 = appdatabase.sectionDao().FindSectionByCategory("cat5");
        List<Section> section6 = appdatabase.sectionDao().FindSectionByCategory("cat6");


        List<Section> section7 = appdatabase.sectionDao().FindSectionByCategory("cat7");
        List<Section> section8 = appdatabase.sectionDao().FindSectionByCategory("cat8");

        List<Section> section9 = appdatabase.sectionDao().FindSectionByCategory("cat9");
        List<Section> section10 = appdatabase.sectionDao().FindSectionByCategory("cat10");






        Article article1 = new Article("Article 1","PRELIMINARY",section1);
        Article article2 = new Article("Article 2","SECRETARY AND PROCEEDINGS OF THE COMMISSION",section2);


        Article article3 = new Article("Article 3","DUTIES OF PUBLIC OFFICERS",section3);
        Article article4 = new Article("Article 4","DELEGATION OF POWERS",section4);


        Article article5 = new Article("Article 5","APPOINTMENTS",section5);
        Article article6 = new Article("Article 6","COMPULSORY RETIREMENT, TERMINATION OF APPOINTMENT, CONCLUSION OF PROBATIONARY SERVICE AND\n" +
                "ACTING APPOINTMENTS WITH A VIEW TO PROMOTION\n",section6);

        Article article7 = new Article("Article 7","DISCIPLINARY PROCEDURE",section7);
        Article article8 = new Article("Article 8","PETITIONS",section8);

        Article article9 = new Article("Article 9","ANNUAL PERFORMANCE EVALUATION REPORT, TESTIMONIALS AND CERTIFICATE OF SERVICE",section9);
        Article article10 = new Article("Article 10","MISCELLANEOUS",section10);



        ArrayList<Article> makeArticle = new ArrayList<>();
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

      return makeArticle;
    }

}
