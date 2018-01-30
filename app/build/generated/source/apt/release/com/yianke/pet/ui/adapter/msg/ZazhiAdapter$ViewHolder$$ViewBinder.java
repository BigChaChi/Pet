// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter.msg;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ZazhiAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.msg.ZazhiAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230878, "field 'mItemParents'");
    target.mItemParents = finder.castView(view, 2131230878, "field 'mItemParents'");
    view = finder.findRequiredView(source, 2131230871, "field 'mItemView'");
    target.mItemView = finder.castView(view, 2131230871, "field 'mItemView'");
    view = finder.findRequiredView(source, 2131230877, "field 'mItemName'");
    target.mItemName = finder.castView(view, 2131230877, "field 'mItemName'");
    view = finder.findRequiredView(source, 2131230879, "field 'mItemTimes'");
    target.mItemTimes = finder.castView(view, 2131230879, "field 'mItemTimes'");
  }

  @Override public void unbind(T target) {
    target.mItemParents = null;
    target.mItemView = null;
    target.mItemName = null;
    target.mItemTimes = null;
  }
}
