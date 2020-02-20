package com.damilolaakinterinwa.android.civilserviceregulation;
import java.util.List;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface BookmarksDao {

    @Query("SELECT * FROM Bookmarks")
    List<Bookmarks> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertentry(Bookmarks bookmarks);
}
