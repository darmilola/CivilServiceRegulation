package com.servicematter.android.regulatorybooks;

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

public class ArticleDetails extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticleDetailAdapter articleDetailAdapter;
    TextView toolbartitle;
    Toolbar toolbar;
    List<Section> sectionList;
    String category,categorytitle;
    int index;
    AppDatabase appDatabase;
    BookmarksDatabase bookmarksDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);
        getValueFromIntent();
        initView();
        initDatabase();
        articleDetailAdapter  =  new ArticleDetailAdapter(sectionList, new ArticleDetailAdapter.ListItemClickListener() {
            @Override
            public void onListItemClick(int clickedItemIndex) {
                Section section = sectionList.get(clickedItemIndex);

                displayBookmarkDialog(section.getTitle(),section.getRegulation());

            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(articleDetailAdapter);
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
        appDatabase = Room.databaseBuilder(this, AppDatabase.class,"mydb").allowMainThreadQueries().build();
        sectionList = appDatabase.sectionDao().FindSectionByCategory(category);

    }
    private void getValueFromIntent(){
        category = getIntent().getStringExtra("category");
        index = getIntent().getIntExtra("position",0);
        categorytitle = getIntent().getStringExtra("categorytitle");
    }

    private void displayBookmarkDialog(final String title, final String regulation){
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(ArticleDetails.this);

        builder.setMessage("Add to Bookmark")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        bookmarksDatabase = Room.databaseBuilder(ArticleDetails.this, BookmarksDatabase.class,"bookmarksdb").allowMainThreadQueries().build();
                        Bookmarks bookmarks = new Bookmarks(title,regulation);
                        bookmarksDatabase.bookmarksDao().insertentry(bookmarks);

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
