// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LeaderActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.LeaderActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230899, "field 'mMains'");
    target.mMains = finder.castView(view, 2131230899, "field 'mMains'");
    view = finder.findRequiredView(source, 2131230864, "field 'mIndicator'");
    target.mIndicator = finder.castView(view, 2131230864, "field 'mIndicator'");
    view = finder.findRequiredView(source, 2131230889, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230888, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mMains = null;
    target.mIndicator = null;
  }
}
