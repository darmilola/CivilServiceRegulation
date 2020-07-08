package com.servicematter.android.civilserviceregulation;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Procurement_Section.class},version = 1,exportSchema = false)
public abstract class Procurement_Database extends RoomDatabase {
    public abstract Procurement_Dao procurement_dao();
}