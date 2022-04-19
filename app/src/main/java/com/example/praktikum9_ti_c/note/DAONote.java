package com.example.praktikum9_ti_c.note;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import java.util.*;

@Dao
public interface DAONote {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Note note);

    @Update()
    void update(Note note);

    @Delete()
    void delete(Note note);

    @Query("SELECT * from note ORDER BY id ASC")
    LiveData<List<Note>> getAllNotes();
}