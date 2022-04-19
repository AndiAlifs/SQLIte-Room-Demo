package com.example.praktikum9_ti_c.ui;

import android.app.Application;
import androidx.lifecycle.*;
import com.example.praktikum9_ti_c.note.*;
import com.example.praktikum9_ti_c.repository.*;
import java.util.List;

public class NoteMainViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;
    public NoteMainViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    LiveData<List<Note>> getAllNotes() {
        return mNoteRepository.getAllNotes();
    }
}
