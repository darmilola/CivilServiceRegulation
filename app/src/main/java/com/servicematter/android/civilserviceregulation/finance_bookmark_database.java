package com.servicematter.android.civilserviceregulation;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Finance_Bookmark_Model.class},version = 1,exportSchema = false)
public abstract class finance_bookmark_database extends RoomDatabase {
    public abstract Finance_Bookmark_Dao finance_bookmark_dao();
}

