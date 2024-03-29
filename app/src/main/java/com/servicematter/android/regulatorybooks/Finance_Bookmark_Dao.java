package com.servicematter.android.regulatorybooks;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface Finance_Bookmark_Dao {

    @Query("SELECT * FROM Finance_Bookmark_Model")
    List<Finance_Bookmark_Model> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertentry(Finance_Bookmark_Model finance_bookmark_model);

}
