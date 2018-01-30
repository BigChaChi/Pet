// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PetMsgActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.PetMsgActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231048, "field 'mTopText'");
    target.mTopText = finder.castView(view, 2131231048, "field 'mTopText'");
    view = finder.findRequiredView(source, 2131231047, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230926, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230928, "method 'onViewClicked'");
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
    target.mTopText = null;
  }
}
