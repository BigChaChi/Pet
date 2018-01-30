// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.yianke.pet.ui.activity.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230898, "field 'mMainFragment'");
    target.mMainFragment = finder.castView(view, 2131230898, "field 'mMainFragment'");
    view = finder.findRequiredView(source, 2131230854, "field 'mImgHome'");
    target.mImgHome = finder.castView(view, 2131230854, "field 'mImgHome'");
    view = finder.findRequiredView(source, 2131231059, "field 'mTvHome'");
    target.mTvHome = finder.castView(view, 2131231059, "field 'mTvHome'");
    view = finder.findRequiredView(source, 2131230855, "field 'mImgHouse'");
    target.mImgHouse = finder.castView(view, 2131230855, "field 'mImgHouse'");
    view = finder.findRequiredView(source, 2131231060, "field 'mTvHouse'");
    target.mTvHouse = finder.castView(view, 2131231060, "field 'mTvHouse'");
    view = finder.findRequiredView(source, 2131230851, "field 'mImgBuy'");
    target.mImgBuy = finder.castView(view, 2131230851, "field 'mImgBuy'");
    view = finder.findRequiredView(source, 2131231057, "field 'mTvBuy'");
    target.mTvBuy = finder.castView(view, 2131231057, "field 'mTvBuy'");
    view = finder.findRequiredView(source, 2131230863, "field 'mImgService'");
    target.mImgService = finder.castView(view, 2131230863, "field 'mImgService'");
    view = finder.findRequiredView(source, 2131231062, "field 'mTvService'");
    target.mTvService = finder.castView(view, 2131231062, "field 'mTvService'");
    view = finder.findRequiredView(source, 2131230856, "field 'mImgMine'");
    target.mImgMine = finder.castView(view, 2131230856, "field 'mImgMine'");
    view = finder.findRequiredView(source, 2131231061, "field 'mTvMine'");
    target.mTvMine = finder.castView(view, 2131231061, "field 'mTvMine'");
    view = finder.findRequiredView(source, 2131230964, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230965, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230961, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230972, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230967, "method 'onViewClicked'");
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
    target.mMainFragment = null;
    target.mImgHome = null;
    target.mTvHome = null;
    target.mImgHouse = null;
    target.mTvHouse = null;
    target.mImgBuy = null;
    target.mTvBuy = null;
    target.mImgService = null;
    target.mTvService = null;
    target.mImgMine = null;
    target.mTvMine = null;
  }
}
