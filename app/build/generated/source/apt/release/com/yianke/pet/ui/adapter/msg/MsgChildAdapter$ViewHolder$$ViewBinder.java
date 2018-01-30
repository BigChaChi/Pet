// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter.msg;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MsgChildAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.msg.MsgChildAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230871, "field 'mItemImage'");
    target.mItemImage = finder.castView(view, 2131230871, "field 'mItemImage'");
    view = finder.findRequiredView(source, 2131230880, "field 'mItemTitle'");
    target.mItemTitle = finder.castView(view, 2131230880, "field 'mItemTitle'");
    view = finder.findRequiredView(source, 2131230885, "field 'mItemZhiding'");
    target.mItemZhiding = finder.castView(view, 2131230885, "field 'mItemZhiding'");
    view = finder.findRequiredView(source, 2131230874, "field 'mItemJingxuan'");
    target.mItemJingxuan = finder.castView(view, 2131230874, "field 'mItemJingxuan'");
    view = finder.findRequiredView(source, 2131230868, "field 'mItemAuthor'");
    target.mItemAuthor = finder.castView(view, 2131230868, "field 'mItemAuthor'");
    view = finder.findRequiredView(source, 2131230884, "field 'mItemWatch'");
    target.mItemWatch = finder.castView(view, 2131230884, "field 'mItemWatch'");
  }

  @Override public void unbind(T target) {
    target.mItemImage = null;
    target.mItemTitle = null;
    target.mItemZhiding = null;
    target.mItemJingxuan = null;
    target.mItemAuthor = null;
    target.mItemWatch = null;
  }
}
