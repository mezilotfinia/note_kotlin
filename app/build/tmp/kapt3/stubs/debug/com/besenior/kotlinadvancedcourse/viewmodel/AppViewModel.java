package com.besenior.kotlinadvancedcourse.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.besenior.kotlinadvancedcourse.models.NotesModel;
import com.besenior.kotlinadvancedcourse.repository.AppRepository;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/viewmodel/AppViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/besenior/kotlinadvancedcourse/repository/AppRepository;", "(Lcom/besenior/kotlinadvancedcourse/repository/AppRepository;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V", "UpdateNoteDatabase", "", "noteEntity", "deleteNote", "getAllDataFromDb", "insertNoteToDatabase", "noteModel", "Lcom/besenior/kotlinadvancedcourse/models/NotesModel;", "app_debug"})
public final class AppViewModel extends androidx.lifecycle.ViewModel {
    private final com.besenior.kotlinadvancedcourse.repository.AppRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> data;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> liveData;
    
    @javax.inject.Inject
    public AppViewModel(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.repository.AppRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> getLiveData() {
        return null;
    }
    
    public final void setLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> p0) {
    }
    
    public final void insertNoteToDatabase(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.models.NotesModel noteModel) {
    }
    
    public final void UpdateNoteDatabase(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    public final void getAllDataFromDb() {
    }
}