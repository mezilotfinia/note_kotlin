package com.besenior.kotlinadvancedcourse.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.*;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.besenior.kotlinadvancedcourse.MainActivity;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.databinding.FragmentSingleNoteBinding;
import com.besenior.kotlinadvancedcourse.models.NotesModel;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import com.besenior.kotlinadvancedcourse.viewmodel.AppViewModel;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.GlobalScope;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010\'\u001a\u00020$H\u0002J\u000e\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-H\u0016J\u000e\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020*J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J&\u00108\u001a\u0004\u0018\u00010*2\u0006\u00106\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0016J\u001a\u0010@\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010A\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006B"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/ui/SingleNoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/besenior/kotlinadvancedcourse/databinding/FragmentSingleNoteBinding;", "isUpdating", "", "()Z", "setUpdating", "(Z)V", "mainActivity", "Lcom/besenior/kotlinadvancedcourse/MainActivity;", "getMainActivity", "()Lcom/besenior/kotlinadvancedcourse/MainActivity;", "setMainActivity", "(Lcom/besenior/kotlinadvancedcourse/MainActivity;)V", "navController", "Landroidx/navigation/NavController;", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "getNoteEntity", "()Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "setNoteEntity", "(Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;)V", "pinned", "getPinned", "setPinned", "savedColor", "", "viewModel", "Lcom/besenior/kotlinadvancedcourse/viewmodel/AppViewModel;", "getViewModel", "()Lcom/besenior/kotlinadvancedcourse/viewmodel/AppViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "colorCheckToVisible", "", "color", "getData", "hideAllCheck", "onAddNoteClick", "view", "Landroid/view/View;", "onAttach", "context", "Landroid/content/Context;", "onColorViewClick", "check", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onViewCreated", "setupToolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class SingleNoteFragment extends androidx.fragment.app.Fragment {
    private com.besenior.kotlinadvancedcourse.databinding.FragmentSingleNoteBinding binding;
    public com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity;
    private java.lang.String savedColor = "#64C8FD";
    private final kotlin.Lazy viewModel$delegate = null;
    public com.besenior.kotlinadvancedcourse.MainActivity mainActivity;
    private androidx.navigation.NavController navController;
    private boolean pinned = false;
    private boolean isUpdating = false;
    
    public SingleNoteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.besenior.kotlinadvancedcourse.room.entities.NoteEntity getNoteEntity() {
        return null;
    }
    
    public final void setNoteEntity(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity p0) {
    }
    
    private final com.besenior.kotlinadvancedcourse.viewmodel.AppViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.besenior.kotlinadvancedcourse.MainActivity getMainActivity() {
        return null;
    }
    
    public final void setMainActivity(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.MainActivity p0) {
    }
    
    public final boolean getPinned() {
        return false;
    }
    
    public final void setPinned(boolean p0) {
    }
    
    public final boolean isUpdating() {
        return false;
    }
    
    public final void setUpdating(boolean p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getData() {
    }
    
    private final void colorCheckToVisible(java.lang.String color) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupToolbar(android.view.View view) {
    }
    
    public final void onAddNoteClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void onColorViewClick(@org.jetbrains.annotations.NotNull
    android.view.View check) {
    }
    
    private final void hideAllCheck() {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
}