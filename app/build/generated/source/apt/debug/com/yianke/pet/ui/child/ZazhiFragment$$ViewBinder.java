// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.child;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ZazhiFragment$$ViewBinder<T extends com.yianke.pet.ui.child.ZazhiFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231086, "field 'mZhaziRecycler'");
    target.mZhaziRecycler = finder.castView(view, 2131231086, "field 'mZhaziRecycler'");
    view = finder.findRequiredView(source, 2131230754, "field 'mBanner'");
    target.mBanner = finder.castView(view, 2131230754, "field 'mBanner'");
  }

  @Override public void unbind(T target) {
    target.mZhaziRecycler = null;
    target.mBanner = null;
  }
}
