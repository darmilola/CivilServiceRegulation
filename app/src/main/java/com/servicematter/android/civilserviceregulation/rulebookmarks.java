package com.servicematter.android.civilserviceregulation;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "rulebookmarks")
public class rulebookmarks {




        @NonNull
        @PrimaryKey(autoGenerate = true)
        private int id;

        @ColumnInfo(name = "title")
        private String title;

        @ColumnInfo(name = "rule")
        private String rule;

        public rulebookmarks(String title,String rule){
            this.title = title;
            this.rule = rule;
        }



        public String getTitle() {
            return title;
        }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
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


