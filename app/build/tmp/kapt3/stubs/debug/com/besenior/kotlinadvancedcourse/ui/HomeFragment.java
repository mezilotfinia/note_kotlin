package com.besenior.kotlinadvancedcourse.ui;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.Navigation;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.adapters.CardClickListener;
import com.besenior.kotlinadvancedcourse.adapters.PinnedRVAdapter;
import com.besenior.kotlinadvancedcourse.adapters.UpcomingRvAdapter;
import com.besenior.kotlinadvancedcourse.databinding.FragmentHomeBinding;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import com.besenior.kotlinadvancedcourse.viewmodel.AppViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "()V", "binding", "Lcom/besenior/kotlinadvancedcourse/databinding/FragmentHomeBinding;", "viewModel", "Lcom/besenior/kotlinadvancedcourse/viewmodel/AppViewModel;", "getViewModel", "()Lcom/besenior/kotlinadvancedcourse/viewmodel/AppViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "deleteNoteFromDb", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "fabOnClick", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClickListener", "onMenuItemClickListener", "imageFilterButton", "setupPinnedRecyclerview", "setupUpcomingRecyclerview", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.besenior.kotlinadvancedcourse.adapters.CardClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.besenior.kotlinadvancedcourse.databinding.FragmentHomeBinding binding;
    
    public HomeFragment() {
        super();
    }
    
    private final com.besenior.kotlinadvancedcourse.viewmodel.AppViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupPinnedRecyclerview() {
    }
    
    private final void setupUpcomingRecyclerview() {
    }
    
    public final void fabOnClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onItemClickListener(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    @java.lang.Override
    public void onMenuItemClickListener(@org.jetbrains.annotations.NotNull
    android.view.View imageFilterButton, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
    
    private final void deleteNoteFromDb(com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity) {
    }
}