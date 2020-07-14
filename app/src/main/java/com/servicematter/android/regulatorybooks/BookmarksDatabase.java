package com.servicematter.android.regulatorybooks;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Bookmarks.class},version = 1,exportSchema = false)
public abstract class BookmarksDatabase extends RoomDatabase {
   public abstract BookmarksDao bookmarksDao();
}
