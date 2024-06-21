package com.besenior.kotlinadvancedcourse.databinding;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 2);
        sViewsWithIds.put(R.id.textView, 3);
        sViewsWithIds.put(R.id.imageView, 4);
        sViewsWithIds.put(R.id.pinnedCon, 5);
        sViewsWithIds.put(R.id.textView2, 6);
        sViewsWithIds.put(R.id.pinnedRv, 7);
        sViewsWithIds.put(R.id.upcomingCon, 8);
        sViewsWithIds.put(R.id.textView6, 9);
        sViewsWithIds.put(R.id.upcomingRv, 10);
        sViewsWithIds.put(R.id.textView3, 11);
        sViewsWithIds.put(R.id.guideline3, 12);
        sViewsWithIds.put(R.id.guideline4, 13);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (androidx.constraintlayout.widget.Guideline) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            );
        this.addnoteFab.setTag(null);
        this.homeCon.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragmentHome == variableId) {
            setFragmentHome((com.besenior.kotlinadvancedcourse.ui.HomeFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragmentHome(@Nullable com.besenior.kotlinadvancedcourse.ui.HomeFragment FragmentHome) {
        this.mFragmentHome = FragmentHome;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.fragmentHome);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.besenior.kotlinadvancedcourse.ui.HomeFragment fragmentHome = mFragmentHome;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.addnoteFab.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // fragmentHome
        com.besenior.kotlinadvancedcourse.ui.HomeFragment fragmentHome = mFragmentHome;
        // fragmentHome != null
        boolean fragmentHomeJavaLangObjectNull = false;



        fragmentHomeJavaLangObjectNull = (fragmentHome) != (null);
        if (fragmentHomeJavaLangObjectNull) {



            fragmentHome.fabOnClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fragmentHome
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}