package com.servicematter.android.civilserviceregulation;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface RulesDao {

    @Query("SELECT * FROM Rules_Section")
    List<Rules_Section> getAll();

    @Query("SELECT * FROM Rules_Section WHERE category  = :mycategory")
    List<Rules_Section> FindSectionByCategory(String mycategory);

    @Insert
    void InsertAll(Rules_Section... sections);

    @Query("SELECT * FROM Rules_Section WHERE rules LIKE '%' || :search || '%'")
    List<Rules_Section> SearchSections(String search);
}
