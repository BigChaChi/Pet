// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DongmanFragment$$ViewBinder<T extends com.yianke.pet.ui.child.DongmanFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230801, "field 'mDongmanLists'");
    target.mDongmanLists = finder.castView(view, 2131230801, "field 'mDongmanLists'");
  }

  @Override public void unbind(T target) {
    target.mDongmanLists = null;
  }
}
