package com.servicematter.android.civilserviceregulation;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Bookmarks")
public class Bookmarks {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "regulation")
    private String regulation;

    public Bookmarks(String title,String regulation){
        this.title = title;
        this.regulation = regulation;
    }

    public String getRegulation() {
        return regulation;
    }

    public String getTitle() {
        return title;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
