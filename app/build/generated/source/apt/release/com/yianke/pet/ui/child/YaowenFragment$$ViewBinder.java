// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class YaowenFragment$$ViewBinder<T extends com.yianke.pet.ui.child.YaowenFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231084, "field 'mYaowenList'");
    target.mYaowenList = finder.castView(view, 2131231084, "field 'mYaowenList'");
  }

  @Override public void unbind(T target) {
    target.mYaowenList = null;
  }
}
