// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class VerificationCodeActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.VerificationCodeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231048, "field 'mTopText'");
    target.mTopText = finder.castView(view, 2131231048, "field 'mTopText'");
    view = finder.findRequiredView(source, 2131230783, "field 'mCodeNums' and method 'onViewClicked'");
    target.mCodeNums = finder.castView(view, 2131230783, "field 'mCodeNums'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230782, "field 'mCodeGetnums'");
    target.mCodeGetnums = finder.castView(view, 2131230782, "field 'mCodeGetnums'");
    view = finder.findRequiredView(source, 2131231047, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230781, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230979, "method 'onViewClicked'");
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
    target.mCodeNums = null;
    target.mCodeGetnums = null;
  }
}
