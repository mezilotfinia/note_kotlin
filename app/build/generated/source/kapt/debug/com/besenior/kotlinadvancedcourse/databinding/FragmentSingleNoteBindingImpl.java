package com.besenior.kotlinadvancedcourse.databinding;
import com.besenior.kotlinadvancedcourse.R;
import com.besenior.kotlinadvancedcourse.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSingleNoteBindingImpl extends FragmentSingleNoteBinding implements com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"singlenote_appbar"},
            new int[] {9},
            new int[] {com.besenior.kotlinadvancedcourse.R.layout.singlenote_appbar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topmain_guidline, 10);
        sViewsWithIds.put(R.id.guideline1, 11);
        sViewsWithIds.put(R.id.guideline2, 12);
        sViewsWithIds.put(R.id.title_edtx, 13);
        sViewsWithIds.put(R.id.note_edtx, 14);
        sViewsWithIds.put(R.id.ColorChoosebottomappbar, 15);
        sViewsWithIds.put(R.id.guideline10, 16);
        sViewsWithIds.put(R.id.guideline11, 17);
        sViewsWithIds.put(R.id.check1, 18);
        sViewsWithIds.put(R.id.check2, 19);
        sViewsWithIds.put(R.id.check3, 20);
        sViewsWithIds.put(R.id.check4, 21);
        sViewsWithIds.put(R.id.check5, 22);
        sViewsWithIds.put(R.id.check6, 23);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSingleNoteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentSingleNoteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[23]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[17]
            , (androidx.constraintlayout.widget.Guideline) bindings[12]
            , (com.besenior.kotlinadvancedcourse.databinding.SinglenoteAppbarBinding) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.EditText) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.EditText) bindings[13]
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            );
        this.color1.setTag(null);
        this.color2.setTag(null);
        this.color3.setTag(null);
        this.color4.setTag(null);
        this.color5.setTag(null);
        this.color6.setTag(null);
        this.fabcheckBtn.setTag(null);
        setContainedBinding(this.include);
        this.mainCoord.setTag(null);
        this.singlenoteCon.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 2);
        mCallback7 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.besenior.kotlinadvancedcourse.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.SingleNote == variableId) {
            setSingleNote((com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSingleNote(@Nullable com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment SingleNote) {
        this.mSingleNote = SingleNote;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.SingleNote);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude((com.besenior.kotlinadvancedcourse.databinding.SinglenoteAppbarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude(com.besenior.kotlinadvancedcourse.databinding.SinglenoteAppbarBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.color1.setOnClickListener(mCallback6);
            this.color2.setOnClickListener(mCallback7);
            this.color3.setOnClickListener(mCallback5);
            this.color4.setOnClickListener(mCallback4);
            this.color5.setOnClickListener(mCallback3);
            this.color6.setOnClickListener(mCallback2);
            this.fabcheckBtn.setOnClickListener(mCallback1);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check1);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check4);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check6);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check2);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check3);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onColorViewClick(check5);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // SingleNote
                com.besenior.kotlinadvancedcourse.ui.SingleNoteFragment singleNote = mSingleNote;
                // SingleNote != null
                boolean singleNoteJavaLangObjectNull = false;



                singleNoteJavaLangObjectNull = (singleNote) != (null);
                if (singleNoteJavaLangObjectNull) {



                    singleNote.onAddNoteClick(callbackArg_0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include
        flag 1 (0x2L): SingleNote
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}