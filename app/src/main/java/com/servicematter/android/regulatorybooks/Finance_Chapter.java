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

        List<Finance_Section> section7 = appdatabase.finance_dao().FindSectionByCategory("cat7");


        List<Finance_Section> section8 = appdatabase.finance_dao().FindSectionByCategory("cat8");

        List<Finance_Section> section9 = appdatabase.finance_dao().FindSectionByCategory("cat9");
        List<Finance_Section> section10 = appdatabase.finance_dao().FindSectionByCategory("cat10");

        List<Finance_Section> section11 = appdatabase.finance_dao().FindSectionByCategory("cat11");


        List<Finance_Section> section12 = appdatabase.finance_dao().FindSectionByCategory("cat12");
        List<Finance_Section> section13 = appdatabase.finance_dao().FindSectionByCategory("cat13");

        List<Finance_Section> section14 = appdatabase.finance_dao().FindSectionByCategory("cat14");
        List<Finance_Section> section15 = appdatabase.finance_dao().FindSectionByCategory("cat15");

        List<Finance_Section> section16 = appdatabase.finance_dao().FindSectionByCategory("cat16");
        List<Finance_Section> section17 = appdatabase.finance_dao().FindSectionByCategory("cat17");



        List<Finance_Section> section18 = appdatabase.finance_dao().FindSectionByCategory("cat18");

        List<Finance_Section> section19 = appdatabase.finance_dao().FindSectionByCategory("cat19");
        List<Finance_Section> section20 = appdatabase.finance_dao().FindSectionByCategory("cat20");



        List<Finance_Section> section21 = appdatabase.finance_dao().FindSectionByCategory("cat21");
        List<Finance_Section> section22 = appdatabase.finance_dao().FindSectionByCategory("cat22");

        List<Finance_Section> section23 = appdatabase.finance_dao().FindSectionByCategory("cat23");
        List<Finance_Section> section24 = appdatabase.finance_dao().FindSectionByCategory("cat24");



        List<Finance_Section> section25 = appdatabase.finance_dao().FindSectionByCategory("cat25");

        List<Finance_Section> section26 = appdatabase.finance_dao().FindSectionByCategory("cat26");
        List<Finance_Section> section27 = appdatabase.finance_dao().FindSectionByCategory("cat27");












        List<Finance_Section> section28 = appdatabase.finance_dao().FindSectionByCategory("cat28");

        List<Finance_Section> section29 = appdatabase.finance_dao().FindSectionByCategory("cat29");
        List<Finance_Section> section30 = appdatabase.finance_dao().FindSectionByCategory("cat30");

        List<Finance_Section> section31 = appdatabase.finance_dao().FindSectionByCategory("cat31");


        List<Finance_Section> section32 = appdatabase.finance_dao().FindSectionByCategory("cat32");
        List<Finance_Section> section33 = appdatabase.finance_dao().FindSectionByCategory("cat33");

        List<Finance_Section> section34 = appdatabase.finance_dao().FindSectionByCategory("cat34");
        List<Finance_Section> section35 = appdatabase.finance_dao().FindSectionByCategory("cat35");

        List<Finance_Section> section36 = appdatabase.finance_dao().FindSectionByCategory("cat36");
        List<Finance_Section> section37 = appdatabase.finance_dao().FindSectionByCategory("cat37");



        List<Finance_Section> section38 = appdatabase.finance_dao().FindSectionByCategory("cat38");

        List<Finance_Section> section39 = appdatabase.finance_dao().FindSectionByCategory("cat39");
        List<Finance_Section> section40 = appdatabase.finance_dao().FindSectionByCategory("cat40");



        List<Finance_Section> section41 = appdatabase.finance_dao().FindSectionByCategory("cat41");
        List<Finance_Section> section42 = appdatabase.finance_dao().FindSectionByCategory("cat42");

        List<Finance_Section> section43 = appdatabase.finance_dao().FindSectionByCategory("cat43");
        List<Finance_Section> section44 = appdatabase.finance_dao().FindSectionByCategory("cat44");



        List<Finance_Section> section45 = appdatabase.finance_dao().FindSectionByCategory("cat45");

        List<Finance_Section> section46 = appdatabase.finance_dao().FindSectionByCategory("cat46");
        List<Finance_Section> section47 = appdatabase.finance_dao().FindSectionByCategory("cat47");



        Finance_Articles article1 = new Finance_Articles("Article 1","INTRODUCTION",section1);
        Finance_Articles article2 = new Finance_Articles("Article 2","FINANCIAL RESPONSIBLITIES OF PUBLIC OFFICERS",section2);

        Finance_Articles article3 = new Finance_Articles("Article 3","SELF-ACCOUNTING MINSITRIES, DEPARTMENTS AND AGENCY",section3);
        Finance_Articles article4 = new Finance_Articles("Article 4","ACCOUNTING PROCEDURES",section4);

        Finance_Articles article5 = new Finance_Articles("Article 5","TREASURY DEPARTMENT OF THE MINISTRY OF FINANCE AND TREASURY CASH OFFICES",section5);
        Finance_Articles article6 = new Finance_Articles("Article 6","REVENUE COLLECTION AND ACCOUNTING ",section6);

        Finance_Articles article7 = new Finance_Articles("Article 7","AUTHORIZATION OF EXPENDITURE",section7);


        Finance_Articles article8 = new Finance_Articles("Article 8","EXPENDITURE CLASSIFICATION AND CONTROL",section8);
        Finance_Articles article9 = new Finance_Articles("Article 9","PAYMENT PROCEDURE AND STANDARDIZATION",section9);

        Finance_Articles article10 = new Finance_Articles("Article 10","TRANSFERS AND ADJUSTMENTS",section10);
        Finance_Articles article11 = new Finance_Articles("Article 11","BANK ACCOUNTS AND CHEQUES, ETC",section11);




        Finance_Articles article12 = new Finance_Articles("Article 12","CUSTODY OF PUBLIC MONEY, REVENUE RECEIPT, COUNTERFOILS, SECURITY BOOKS AND DOCUMENTS, ETC\n",section12);

        Finance_Articles article13 = new Finance_Articles("Article 13","RECEIPT AND LICENCE BOOKS",section13);
        Finance_Articles article14 = new Finance_Articles("Article 14","IMPRESTS",section14);

        Finance_Articles article15 = new Finance_Articles("Article 15","BOARD OF SURVEY:  CASH ",section15);
        Finance_Articles article16 = new Finance_Articles("Article 16","LOSSES AND SHORTAGES IN PUBLIC FUNDS",section16);

        Finance_Articles article17 = new Finance_Articles("Article 17","DEPOSITS",section17);


        Finance_Articles article18 = new Finance_Articles("Article 18","ADVANCES",section18);
        Finance_Articles article19 = new Finance_Articles("Article 19","SALARIES, PAYROLL: PREPARATION AND CONTROL",section19);

        Finance_Articles article20 = new Finance_Articles("Article 20","LAST PAY CERTIFICATE AND PAY ADVICE",section20);




        Finance_Articles article21 = new Finance_Articles("Article 21","ESTATES OF DECEASED OFFICERS",section21);

        Finance_Articles article22 = new Finance_Articles("Article 22","SECONDED OFFICERS",section22);
        Finance_Articles article23 = new Finance_Articles("Article 23","REVENUE REFUNDS, OVERPAYMENTS AND RECOVERIES",section23);

        Finance_Articles article24 = new Finance_Articles("Article 24","INSURANCE",section24);


        Finance_Articles article25 = new Finance_Articles("Article 25","PROCEDURE FOR THE PREPARATION OF ANNUAL ESTIMATES",section25);
        Finance_Articles article26 = new Finance_Articles("Article 26","COURT ACCOUNTS AND SHERIFF ACCOUNTS",section26);

        Finance_Articles article27 = new Finance_Articles("Article 27","TRANSPORT, FREIGHT CHARGES AND PASSAGES",section27);









        Finance_Articles article28 = new Finance_Articles("Article 28","Government Vehicles: Uses and Proper Control",section28);
        Finance_Articles article29 = new Finance_Articles("Article 29","Internal Audit",section29);

        Finance_Articles article30 = new Finance_Articles("Article 30","Losses:  Power of Write-Off",section30);
        Finance_Articles article31 = new Finance_Articles("Article 31","Miscellaneous",section31);




        Finance_Articles article32 = new Finance_Articles("Article 32","Pension Procedure",section32);

        Finance_Articles article33 = new Finance_Articles("Article 33","Stores: Classification and General",section33);
        Finance_Articles article34 = new Finance_Articles("Article 34","General Instructions:  Books and Forms of Account",section34);

        Finance_Articles article35 = new Finance_Articles("Article 35","Supervision and Custody of Stores",section35);
        Finance_Articles article36 = new Finance_Articles("Article 36","Acquisition of Stores: Local Purchase and Indents",section36);

        Finance_Articles article37 = new Finance_Articles("Article 37","Receipt of Stores",section37);


        Finance_Articles article38 = new Finance_Articles("Article 38","Issue of Stores",section38);
        Finance_Articles article39 = new Finance_Articles("Article 39","Returned Stores",section39);

        Finance_Articles article40 = new Finance_Articles("Article 40","Stores:  Miscellaneous",section40);




        Finance_Articles article41 = new Finance_Articles("Article 41","Handing-Over : Stores",section41);

        Finance_Articles article42 = new Finance_Articles("Article 42","Tenders Boards and Tenders Procedure",section42);
        Finance_Articles article43 = new Finance_Articles("Article 43","Loss of Stores and Unserviceable Stores",section43);

        Finance_Articles article44 = new Finance_Articles("Article 44","Stores Inspection by Board of Survey and Stock Verifiers",section44);


        Finance_Articles article45 = new Finance_Articles("Article 45","Allocated Stores:  Tools, Plants and Furniture",section45);
        Finance_Articles article46 = new Finance_Articles("Article 46","Unallocated Stores",section46);

        Finance_Articles article47 = new Finance_Articles("Article 47","Public Procurement Contracts",section47);


        ArrayList<Finance_Articles> makeArticle = new ArrayList<>();


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
        makeArticle.add(article25);
        makeArticle.add(article26);
        makeArticle.add(article27);
        makeArticle.add(article28);
        makeArticle.add(article29);
        makeArticle.add(article30);
        makeArticle.add(article31);
        makeArticle.add(article32);
        makeArticle.add(article33);
        makeArticle.add(article34);
        makeArticle.add(article35);
        makeArticle.add(article36);
        makeArticle.add(article37);
        makeArticle.add(article38);
        makeArticle.add(article39);
        makeArticle.add(article40);
        makeArticle.add(article41);
        makeArticle.add(article42);
        makeArticle.add(article43);
        makeArticle.add(article44);
        makeArticle.add(article45);
        makeArticle.add(article46);
        makeArticle.add(article47);

        return  makeArticle;
    }

}
