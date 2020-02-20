package com.damilolaakinterinwa.android.civilserviceregulation;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Rules_Section.class},version = 1,exportSchema = false)
public abstract class rulesDatabase extends RoomDatabase {
    public abstract RulesDao rulesDao();
}
