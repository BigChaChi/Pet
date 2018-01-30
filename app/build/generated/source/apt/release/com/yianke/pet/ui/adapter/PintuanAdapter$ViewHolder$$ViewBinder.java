// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PintuanAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.PintuanAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230873, "field 'mItemImg'");
    target.mItemImg = finder.castView(view, 2131230873, "field 'mItemImg'");
    view = finder.findRequiredView(source, 2131230870, "field 'mItemDescript'");
    target.mItemDescript = finder.castView(view, 2131230870, "field 'mItemDescript'");
    view = finder.findRequiredView(source, 2131230875, "field 'mItemMutchOne'");
    target.mItemMutchOne = finder.castView(view, 2131230875, "field 'mItemMutchOne'");
    view = finder.findRequiredView(source, 2131230876, "field 'mItemMutchTwo'");
    target.mItemMutchTwo = finder.castView(view, 2131230876, "field 'mItemMutchTwo'");
  }

  @Override public void unbind(T target) {
    target.mItemImg = null;
    target.mItemDescript = null;
    target.mItemMutchOne = null;
    target.mItemMutchTwo = null;
  }
}
