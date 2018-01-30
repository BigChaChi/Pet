// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisterActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.RegisterActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231048, "field 'mTopText'");
    target.mTopText = finder.castView(view, 2131231048, "field 'mTopText'");
    view = finder.findRequiredView(source, 2131230982, "field 'mRegisterPhone'");
    target.mRegisterPhone = finder.castView(view, 2131230982, "field 'mRegisterPhone'");
    view = finder.findRequiredView(source, 2131230981, "field 'mRegisterPass'");
    target.mRegisterPass = finder.castView(view, 2131230981, "field 'mRegisterPass'");
    view = finder.findRequiredView(source, 2131230980, "field 'mRegisterBtn' and method 'onViewClicked'");
    target.mRegisterBtn = finder.castView(view, 2131230980, "field 'mRegisterBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131231047, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230971, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230970, "method 'onViewClicked'");
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
    target.mRegisterPhone = null;
    target.mRegisterPass = null;
    target.mRegisterBtn = null;
  }
}
