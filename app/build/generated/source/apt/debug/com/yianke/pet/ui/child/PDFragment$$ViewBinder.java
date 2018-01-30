// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PDFragment$$ViewBinder<T extends com.yianke.pet.ui.child.PDFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230974, "field 'mPdMain'");
    target.mPdMain = finder.castView(view, 2131230974, "field 'mPdMain'");
  }

  @Override public void unbind(T target) {
    target.mPdMain = null;
  }
}
