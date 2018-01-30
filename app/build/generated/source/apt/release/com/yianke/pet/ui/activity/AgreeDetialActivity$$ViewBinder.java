// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AgreeDetialActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.AgreeDetialActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231048, "field 'mTopText'");
    target.mTopText = finder.castView(view, 2131231048, "field 'mTopText'");
    view = finder.findRequiredView(source, 2131230747, "field 'mAgreeWeb'");
    target.mAgreeWeb = finder.castView(view, 2131230747, "field 'mAgreeWeb'");
    view = finder.findRequiredView(source, 2131231047, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked();
        }
      });
  }

  @Override public void unbind(T target) {
    target.mTopText = null;
    target.mAgreeWeb = null;
  }
}
