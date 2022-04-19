package com.example.praktikum9_ti_c.ui;

import android.app.Application;
import androidx.lifecycle.*;
import com.example.praktikum9_ti_c.note.*;
import com.example.praktikum9_ti_c.repository.*;

public class NoteInsertUpdateViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;
    public NoteInsertUpdateViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    public void insert(Note note) {
        mNoteRepository.insert(note);
    }

    public void update(Note note) {
        mNoteRepository.update(note);
    }

    public void delete(Note note) {
        mNoteRepository.delete(note);
    }
}
