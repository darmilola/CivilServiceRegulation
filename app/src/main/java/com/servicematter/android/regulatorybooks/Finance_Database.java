package com.servicematter.android.regulatorybooks;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Finance_Section.class},version = 1,exportSchema = false)
public abstract class Finance_Database extends RoomDatabase {
    public abstract finance_dao finance_dao();
}
