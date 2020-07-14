package com.servicematter.android.regulatorybooks;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


@Dao
public interface finance_dao {

    @Query("SELECT * FROM Finance_Section")
    List<Finance_Section> getAll();

    @Query("SELECT * FROM Finance_Section WHERE category  = :mycategory")
    List<Finance_Section> FindSectionByCategory(String mycategory);

    @Insert
    void InsertAll(Finance_Section... sections);

    @Query("SELECT * FROM Finance_Section WHERE rules LIKE '%' || :search || '%'")
    List<Finance_Section> SearchSections(String search);
}
