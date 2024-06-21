package com.besenior.kotlinadvancedcourse;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.besenior.kotlinadvancedcourse.databinding.ActivityMainBindingImpl;
import com.besenior.kotlinadvancedcourse.databinding.FragmentHomeBindingImpl;
import com.besenior.kotlinadvancedcourse.databinding.FragmentSingleNoteBindingImpl;
import com.besenior.kotlinadvancedcourse.databinding.PinnedRvItemsBindingImpl;
import com.besenior.kotlinadvancedcourse.databinding.SinglenoteAppbarBindingImpl;
import com.besenior.kotlinadvancedcourse.databinding.UpcomingRvItemsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTSINGLENOTE = 3;

  private static final int LAYOUT_PINNEDRVITEMS = 4;

  private static final int LAYOUT_SINGLENOTEAPPBAR = 5;

  private static final int LAYOUT_UPCOMINGRVITEMS = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.fragment_single_note, LAYOUT_FRAGMENTSINGLENOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.pinned_rv_items, LAYOUT_PINNEDRVITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.singlenote_appbar, LAYOUT_SINGLENOTEAPPBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.besenior.kotlinadvancedcourse.R.layout.upcoming_rv_items, LAYOUT_UPCOMINGRVITEMS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSINGLENOTE: {
          if ("layout/fragment_single_note_0".equals(tag)) {
            return new FragmentSingleNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_single_note is invalid. Received: " + tag);
        }
        case  LAYOUT_PINNEDRVITEMS: {
          if ("layout/pinned_rv_items_0".equals(tag)) {
            return new PinnedRvItemsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for pinned_rv_items is invalid. Received: " + tag);
        }
        case  LAYOUT_SINGLENOTEAPPBAR: {
          if ("layout/singlenote_appbar_0".equals(tag)) {
            return new SinglenoteAppbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for singlenote_appbar is invalid. Received: " + tag);
        }
        case  LAYOUT_UPCOMINGRVITEMS: {
          if ("layout/upcoming_rv_items_0".equals(tag)) {
            return new UpcomingRvItemsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for upcoming_rv_items is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(1, "SingleNote");
      sKeys.put(0, "_all");
      sKeys.put(2, "fragmentHome");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.besenior.kotlinadvancedcourse.R.layout.activity_main);
      sKeys.put("layout/fragment_home_0", com.besenior.kotlinadvancedcourse.R.layout.fragment_home);
      sKeys.put("layout/fragment_single_note_0", com.besenior.kotlinadvancedcourse.R.layout.fragment_single_note);
      sKeys.put("layout/pinned_rv_items_0", com.besenior.kotlinadvancedcourse.R.layout.pinned_rv_items);
      sKeys.put("layout/singlenote_appbar_0", com.besenior.kotlinadvancedcourse.R.layout.singlenote_appbar);
      sKeys.put("layout/upcoming_rv_items_0", com.besenior.kotlinadvancedcourse.R.layout.upcoming_rv_items);
    }
  }
}
