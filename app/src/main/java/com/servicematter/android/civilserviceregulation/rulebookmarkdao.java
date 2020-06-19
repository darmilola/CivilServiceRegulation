package com.servicematter.android.civilserviceregulation;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface rulebookmarkdao {

    @Query("SELECT * FROM rulebookmarks")
    List<rulebookmarks> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertentry(rulebookmarks rulebookmarks);
}
