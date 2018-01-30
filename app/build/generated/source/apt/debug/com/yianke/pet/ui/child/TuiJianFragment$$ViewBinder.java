// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TuiJianFragment$$ViewBinder<T extends com.yianke.pet.ui.child.TuiJianFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231055, "field 'mTuijianLists'");
    target.mTuijianLists = finder.castView(view, 2131231055, "field 'mTuijianLists'");
  }

  @Override public void unbind(T target) {
    target.mTuijianLists = null;
  }
}
