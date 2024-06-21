package com.besenior.kotlinadvancedcourse.room;

import androidx.room.TypeConverter;
import com.besenior.kotlinadvancedcourse.models.NotesModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/room/NoteTypeConverter;", "", "()V", "toDataClass", "Lcom/besenior/kotlinadvancedcourse/models/NotesModel;", "note", "", "tojson", "notesModel", "app_debug"})
public final class NoteTypeConverter {
    
    public NoteTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String tojson(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.models.NotesModel notesModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final com.besenior.kotlinadvancedcourse.models.NotesModel toDataClass(@org.jetbrains.annotations.Nullable
    java.lang.String note) {
        return null;
    }
}