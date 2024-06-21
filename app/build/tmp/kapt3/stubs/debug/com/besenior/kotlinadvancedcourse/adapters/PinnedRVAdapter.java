package com.besenior.kotlinadvancedcourse.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.text.PrecomputedTextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.databinding.PinnedRvItemsBinding;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/adapters/PinnedRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/besenior/kotlinadvancedcourse/adapters/PinnedRVAdapter$PinnedRvViewHolder;", "data", "Ljava/util/ArrayList;", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "listener", "Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "(Ljava/util/ArrayList;Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PinnedRvViewHolder", "app_debug"})
public final class PinnedRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.besenior.kotlinadvancedcourse.adapters.PinnedRVAdapter.PinnedRvViewHolder> {
    private java.util.ArrayList<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity> data;
    private com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener;
    
    public PinnedRVAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity> data, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.besenior.kotlinadvancedcourse.adapters.PinnedRVAdapter.PinnedRvViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.adapters.PinnedRVAdapter.PinnedRvViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/adapters/PinnedRVAdapter$PinnedRvViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/besenior/kotlinadvancedcourse/databinding/PinnedRvItemsBinding;", "(Lcom/besenior/kotlinadvancedcourse/databinding/PinnedRvItemsBinding;)V", "bind", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "listener", "Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "app_debug"})
    public static final class PinnedRvViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.besenior.kotlinadvancedcourse.databinding.PinnedRvItemsBinding binding = null;
        
        public PinnedRvViewHolder(@org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.databinding.PinnedRvItemsBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity, @org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener) {
        }
    }
}