package com.servicematter.android.civilserviceregulation;


import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

public class Procurement_Details extends AppCompatActivity {


    RecyclerView recyclerView;
    Procurement_Details_Adapter procurement_details_adapter;
    TextView toolbartitle;
    Toolbar toolbar;
    List<Procurement_Section> sectionList;
    String category,categorytitle;
    int index;
    Procurement_Database appDatabase;
    Procurement_Bookmark_Database bookmarksDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procurement__details);


        getValueFromIntent();
        initView();
        initDatabase();
        procurement_details_adapter  =  new Procurement_Details_Adapter(sectionList, new Procurement_Details_Adapter.ListItemClickListener() {
            @Override
            public void onListItemClick(int clickedItemIndex) {
                    Procurement_Section section = sectionList.get(clickedItemIndex);

                displayBookmarkDialog(section.getTitle(),section.getRules());

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(procurement_details_adapter);
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
        appDatabase = Room.databaseBuilder(this,Procurement_Database.class,"Procurement_Section").allowMainThreadQueries().build();
        sectionList = appDatabase.procurement_dao().FindSectionByCategory(category);

    }

    private void getValueFromIntent(){
        category = getIntent().getStringExtra("category");
        index = getIntent().getIntExtra("position",0);
        categorytitle = getIntent().getStringExtra("categorytitle");
    }

    private void displayBookmarkDialog(final String title, final String regulation){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(Procurement_Details.this);

        builder.setMessage("Add to Bookmark")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bookmarksDatabase = Room.databaseBuilder(Procurement_Details.this, Procurement_Bookmark_Database.class,"Procurement_Bookmark_Model").allowMainThreadQueries().build();
                        Procurement_Bookmark_Model bookmarks = new Procurement_Bookmark_Model(title,regulation);
                        bookmarksDatabase.procurement_bookmark_dao().insertentry(bookmarks);


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
