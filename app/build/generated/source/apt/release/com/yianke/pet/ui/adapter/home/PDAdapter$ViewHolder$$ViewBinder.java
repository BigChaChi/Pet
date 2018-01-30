// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PDAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.home.PDAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230873, "field 'mItemImg'");
    target.mItemImg = finder.castView(view, 2131230873, "field 'mItemImg'");
    view = finder.findRequiredView(source, 2131231071, "field 'mItemUserName'");
    target.mItemUserName = finder.castView(view, 2131231071, "field 'mItemUserName'");
    view = finder.findRequiredView(source, 2131230870, "field 'mItemDescript'");
    target.mItemDescript = finder.castView(view, 2131230870, "field 'mItemDescript'");
    view = finder.findRequiredView(source, 2131231070, "field 'mItemHeader'");
    target.mItemHeader = finder.castView(view, 2131231070, "field 'mItemHeader'");
  }

  @Override public void unbind(T target) {
    target.mItemImg = null;
    target.mItemUserName = null;
    target.mItemDescript = null;
    target.mItemHeader = null;
  }
}
