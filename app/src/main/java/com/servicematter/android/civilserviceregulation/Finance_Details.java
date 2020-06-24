package com.servicematter.android.civilserviceregulation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class Finance_Details extends AppCompatActivity {

    RecyclerView recyclerView;
    Finance_Detail_Adapter finance_detail_adapter;
    TextView toolbartitle;
    Toolbar toolbar;
    List<Finance_Section> sectionList;
    String category,categorytitle;
    int index;
    Finance_Database appDatabase;
    finance_bookmark_database bookmarksDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance__details);


        getValueFromIntent();
        initView();
        initDatabase();
        finance_detail_adapter  =  new Finance_Detail_Adapter(sectionList, new Finance_Detail_Adapter.ListItemClickListener() {
            @Override
            public void onListItemClick(int clickedItemIndex) {
                Finance_Section section = sectionList.get(clickedItemIndex);

                displayBookmarkDialog(section.getTitle(),section.getRules());

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(finance_detail_adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.scrollToPosition(index);
    }

    private void initView(){
        recyclerView = findViewById(R.id.article_detail_recyclerview);
        toolbar = findViewById(R.id.article_detail_toolbar);
        toolbartitle = findViewById(R.id.article_detail_toolbar_title);
        toolbartitle.setText(categorytitle);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        toolbartitle.setTypeface(customfont);
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

    private void initDatabase(){
        appDatabase = Room.databaseBuilder(this, Finance_Database.class,"finance_db").allowMainThreadQueries().build();
        sectionList = appDatabase.finance_dao().FindSectionByCategory(category);

    }

    private void getValueFromIntent(){
        category = getIntent().getStringExtra("category");
        index = getIntent().getIntExtra("position",0);
        categorytitle = getIntent().getStringExtra("categorytitle");
    }

    private void displayBookmarkDialog(final String title, final String regulation){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(Finance_Details.this);

        builder.setMessage("Add to Bookmark")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bookmarksDatabase = Room.databaseBuilder(Finance_Details.this, finance_bookmark_database.class,"finance_bookmark_db").allowMainThreadQueries().build();
                        Finance_Bookmark_Model bookmarks = new Finance_Bookmark_Model(title,regulation);

                        //Toast.makeText(ruledetail.this, regulation, Toast.LENGTH_SHORT).show();
                        bookmarksDatabase.finance_bookmark_dao().insertentry(bookmarks);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });
        builder.setCancelable(true);

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
