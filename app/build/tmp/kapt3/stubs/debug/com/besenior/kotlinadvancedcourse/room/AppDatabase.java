package com.besenior.kotlinadvancedcourse.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;

@androidx.room.Database(entities = {com.besenior.kotlinadvancedcourse.room.entities.NoteEntity.class}, version = 1)
@androidx.room.TypeConverters(value = {com.besenior.kotlinadvancedcourse.room.NoteTypeConverter.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "roomDao", "Lcom/besenior/kotlinadvancedcourse/room/RoomDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.besenior.kotlinadvancedcourse.room.RoomDao roomDao();
}