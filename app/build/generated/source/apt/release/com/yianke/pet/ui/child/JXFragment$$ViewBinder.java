// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class JXFragment$$ViewBinder<T extends com.yianke.pet.ui.child.JXFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230886, "field 'mJxMain'");
    target.mJxMain = finder.castView(view, 2131230886, "field 'mJxMain'");
  }

  @Override public void unbind(T target) {
    target.mJxMain = null;
  }
}
