package com.servicematter.android.civilserviceregulation;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface Procurement_Dao {


    @Query("SELECT * FROM Procurement_Section")
    List<Procurement_Section> getAll();

    @Query("SELECT * FROM Procurement_Section WHERE category  = :mycategory")
    List<Procurement_Section> FindSectionByCategory(String mycategory);

    @Insert
    void InsertAll(Procurement_Section... sections);

    @Query("SELECT * FROM Procurement_Section WHERE rules LIKE '%' || :search || '%'")
    List<Procurement_Section> SearchSections(String search);
}
