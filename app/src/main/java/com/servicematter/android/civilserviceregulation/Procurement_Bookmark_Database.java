package com.servicematter.android.civilserviceregulation;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Finance_Bookmark_Model.class},version = 1,exportSchema = false)
public abstract class Procurement_Bookmark_Database extends RoomDatabase {
    public abstract Procurement_Bookmark_Dao procurement_bookmark_dao();
}
