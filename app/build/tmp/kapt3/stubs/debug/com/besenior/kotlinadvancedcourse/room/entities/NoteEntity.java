package com.besenior.kotlinadvancedcourse.room.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.besenior.kotlinadvancedcourse.models.NotesModel;

@androidx.room.Entity(tableName = "notetable")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\bH\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "uid", "", "notesModel", "Lcom/besenior/kotlinadvancedcourse/models/NotesModel;", "(ILcom/besenior/kotlinadvancedcourse/models/NotesModel;)V", "getNotesModel", "()Lcom/besenior/kotlinadvancedcourse/models/NotesModel;", "getUid", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class NoteEntity implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int uid = 0;
    @org.jetbrains.annotations.NotNull
    private final com.besenior.kotlinadvancedcourse.models.NotesModel notesModel = null;
    @org.jetbrains.annotations.NotNull
    public static final com.besenior.kotlinadvancedcourse.room.entities.NoteEntity.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.besenior.kotlinadvancedcourse.room.entities.NoteEntity copy(int uid, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.models.NotesModel notesModel) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public NoteEntity(int uid, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.models.NotesModel notesModel) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.besenior.kotlinadvancedcourse.models.NotesModel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.besenior.kotlinadvancedcourse.models.NotesModel getNotesModel() {
        return null;
    }
    
    public NoteEntity(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.besenior.kotlinadvancedcourse.room.entities.NoteEntity createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.besenior.kotlinadvancedcourse.room.entities.NoteEntity[] newArray(int size) {
            return null;
        }
    }
}