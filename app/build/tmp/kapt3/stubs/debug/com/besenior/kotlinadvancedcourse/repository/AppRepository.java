package com.besenior.kotlinadvancedcourse.repository;

import com.besenior.kotlinadvancedcourse.models.NotesModel;
import com.besenior.kotlinadvancedcourse.room.AppDatabase;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/repository/AppRepository;", "", "appDatabase", "Lcom/besenior/kotlinadvancedcourse/room/AppDatabase;", "(Lcom/besenior/kotlinadvancedcourse/room/AppDatabase;)V", "roomDao", "Lcom/besenior/kotlinadvancedcourse/room/RoomDao;", "UpdateNote", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "deleteNote", "getAllData", "Lkotlinx/coroutines/flow/Flow;", "", "insertNote", "noteModel", "Lcom/besenior/kotlinadvancedcourse/models/NotesModel;", "app_debug"})
public final class AppRepository {
    private final com.besenior.kotlinadvancedcourse.room.RoomDao roomDao = null;
    
    @javax.inject.Inject
    public AppRepository(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.AppDatabase appDatabase) {
        super();
    }
    
    public final void insertNote(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.models.NotesModel noteModel) {
    }
    
    public final void UpdateNote(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> getAllData() {
        return null;
    }
}