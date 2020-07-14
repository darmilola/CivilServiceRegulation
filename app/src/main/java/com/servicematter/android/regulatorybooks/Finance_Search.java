package com.servicematter.android.regulatorybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class Finance_Search extends AppCompatActivity {

    Toolbar toolbar;
    SearchView searchView;
    TextView title;
    RecyclerView recyclerView;
    Finance_Database appDatabase;
    List<Finance_Section> sectionList;
    LinearLayout progresslayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance__search);
        initView();
    }

    private void initView(){
        toolbar = findViewById(R.id.search_toolbar);
        searchView = findViewById(R.id.search_widget);
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(true);
        searchView.setIconified(false);
        searchView.clearFocus();
        searchView.requestFocusFromTouch();
        searchView.requestFocus();
        title = findViewById(R.id.search_title);
        recyclerView = findViewById(R.id.search_recycler);
        progresslayout = findViewById(R.id.progresslayout);
        progresslayout.setVisibility(View.GONE);
        recyclerView.setVisibility(View.GONE);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        Typeface customfont= Typeface.createFromAsset(getAssets(), "Kylo-Light.otf");
        title.setTypeface(customfont);

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

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                searchTask task = new searchTask(s);
                task.execute();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                searchTask task = new searchTask(s);
                task.execute();
                return true;
            }
        });
    }

    public class searchTask extends AsyncTask {
        String searchString;


        public searchTask(String msearchString){
            this.searchString = msearchString;
        }
        @Override
        protected void onPreExecute() {
            progresslayout.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        }
        @Override
        protected Object doInBackground(Object[] objects) {
            appDatabase = Room.databaseBuilder(Finance_Search.this, Finance_Database.class,"finance_db").build();
            sectionList = appDatabase.finance_dao().SearchSections(searchString);
            return sectionList;
        }

        @Override
        protected void onPostExecute(Object result){

            progresslayout.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            Finance_Search_Adapter adapter = new Finance_Search_Adapter((List<Finance_Section>) result,searchString);
            recyclerView.setAdapter(adapter);
        }
    }
}
