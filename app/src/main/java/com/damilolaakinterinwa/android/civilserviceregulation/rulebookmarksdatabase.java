package com.damilolaakinterinwa.android.civilserviceregulation;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {rulebookmarks.class},version = 1,exportSchema = false)
public abstract class rulebookmarksdatabase extends RoomDatabase {
    public abstract rulebookmarkdao rulebookmarkdao();
}
