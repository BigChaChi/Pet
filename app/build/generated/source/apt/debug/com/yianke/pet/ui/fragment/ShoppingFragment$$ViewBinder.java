// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ShoppingFragment$$ViewBinder<T extends com.yianke.pet.ui.fragment.ShoppingFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231006, "field 'mShopMain'");
    target.mShopMain = finder.castView(view, 2131231006, "field 'mShopMain'");
  }

  @Override public void unbind(T target) {
    target.mShopMain = null;
  }
}
