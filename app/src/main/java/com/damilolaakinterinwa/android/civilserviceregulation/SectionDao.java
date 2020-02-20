package com.damilolaakinterinwa.android.civilserviceregulation;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface SectionDao {

    @Query("SELECT * FROM Section")
    List<Section> getAll();

    @Query("SELECT * FROM Section WHERE category  = :mycategory")
    List<Section> FindSectionByCategory(String mycategory);

    @Insert
    void InsertAll(Section... sections);

    @Query("SELECT * FROM Section WHERE regulation LIKE '%' || :search || '%'")
    List<Section> SearchSections(String search);
}
