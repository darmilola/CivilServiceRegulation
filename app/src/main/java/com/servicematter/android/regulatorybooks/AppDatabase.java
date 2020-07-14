package com.servicematter.android.regulatorybooks;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Section.class,Rules_Section.class},version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SectionDao sectionDao();
    public abstract RulesDao rulesDao();

    }

