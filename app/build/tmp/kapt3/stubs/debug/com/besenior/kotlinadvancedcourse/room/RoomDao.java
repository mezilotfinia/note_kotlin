package com.besenior.kotlinadvancedcourse.room;

import androidx.room.*;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/room/RoomDao;", "", "delete", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "getAll", "Lkotlinx/coroutines/flow/Flow;", "", "insert", "update", "app_debug"})
public abstract interface RoomDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM notetable")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity>> getAll();
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity);
}