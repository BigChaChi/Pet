// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter.leader;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LeaderAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.leader.LeaderAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230880, "field 'mItemTitle'");
    target.mItemTitle = finder.castView(view, 2131230880, "field 'mItemTitle'");
    view = finder.findRequiredView(source, 2131230870, "field 'mItemDescript'");
    target.mItemDescript = finder.castView(view, 2131230870, "field 'mItemDescript'");
    view = finder.findRequiredView(source, 2131230871, "field 'mItemImage'");
    target.mItemImage = finder.castView(view, 2131230871, "field 'mItemImage'");
    view = finder.findRequiredView(source, 2131230883, "field 'mItemView'");
    target.mItemView = finder.castView(view, 2131230883, "field 'mItemView'");
  }

  @Override public void unbind(T target) {
    target.mItemTitle = null;
    target.mItemDescript = null;
    target.mItemImage = null;
    target.mItemView = null;
  }
}
