package com.besenior.kotlinadvancedcourse.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.databinding.UpcomingRvItemsBinding;
import com.besenior.kotlinadvancedcourse.room.entities.NoteEntity;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/adapters/UpcomingRvAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/besenior/kotlinadvancedcourse/adapters/UpcomingRvAdapter$UpcomingRvViewHolder;", "model", "Ljava/util/ArrayList;", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "(Ljava/util/ArrayList;Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UpcomingRvViewHolder", "app_debug"})
public final class UpcomingRvAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.besenior.kotlinadvancedcourse.adapters.UpcomingRvAdapter.UpcomingRvViewHolder> {
    private final java.util.ArrayList<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity> model = null;
    private com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener;
    
    public UpcomingRvAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.besenior.kotlinadvancedcourse.room.entities.NoteEntity> model, @org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.besenior.kotlinadvancedcourse.adapters.UpcomingRvAdapter.UpcomingRvViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.besenior.kotlinadvancedcourse.adapters.UpcomingRvAdapter.UpcomingRvViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/besenior/kotlinadvancedcourse/adapters/UpcomingRvAdapter$UpcomingRvViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/besenior/kotlinadvancedcourse/databinding/UpcomingRvItemsBinding;", "(Lcom/besenior/kotlinadvancedcourse/databinding/UpcomingRvItemsBinding;)V", "bind", "", "noteEntity", "Lcom/besenior/kotlinadvancedcourse/room/entities/NoteEntity;", "listener", "Lcom/besenior/kotlinadvancedcourse/adapters/CardClickListener;", "app_debug"})
    public static final class UpcomingRvViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.besenior.kotlinadvancedcourse.databinding.UpcomingRvItemsBinding binding = null;
        
        public UpcomingRvViewHolder(@org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.databinding.UpcomingRvItemsBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.room.entities.NoteEntity noteEntity, @org.jetbrains.annotations.NotNull
        com.besenior.kotlinadvancedcourse.adapters.CardClickListener listener) {
        }
    }
}