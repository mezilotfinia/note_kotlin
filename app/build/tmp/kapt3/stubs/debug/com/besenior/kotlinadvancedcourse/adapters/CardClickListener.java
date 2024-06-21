package com.besenior.kotlinadvancedcourse.adapters;

import android.view.View;
import androidx.constraintlayout.utils.widget.ImageFilterButton;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "", "onItemClickListener", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "onMenuItemClickListener", "imageFilterButton", "Landroid/view/View;", "app_debug"})
public abstract interface CardClickListener {
    
    public abstract void onItemClickListener(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity);
    
    public abstract void onMenuItemClickListener(@org.jetbrains.annotations.NotNull
    android.view.View imageFilterButton, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity);
}