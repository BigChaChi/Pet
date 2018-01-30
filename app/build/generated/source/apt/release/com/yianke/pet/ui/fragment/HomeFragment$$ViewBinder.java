// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomeFragment$$ViewBinder<T extends com.yianke.pet.ui.fragment.HomeFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230766, "field 'mCamera'");
    target.mCamera = finder.castView(view, 2131230766, "field 'mCamera'");
    view = finder.findRequiredView(source, 2131230797, "field 'mDicOne'");
    target.mDicOne = finder.castView(view, 2131230797, "field 'mDicOne'");
    view = finder.findRequiredView(source, 2131230799, "field 'mDicTwo'");
    target.mDicTwo = finder.castView(view, 2131230799, "field 'mDicTwo'");
    view = finder.findRequiredView(source, 2131230798, "field 'mDicThree'");
    target.mDicThree = finder.castView(view, 2131230798, "field 'mDicThree'");
    view = finder.findRequiredView(source, 2131230831, "field 'mHomeMain'");
    target.mHomeMain = finder.castView(view, 2131230831, "field 'mHomeMain'");
    view = finder.findRequiredView(source, 2131230832, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230834, "method 'onViewClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230833, "method 'onViewClicked'");
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
    target.mCamera = null;
    target.mDicOne = null;
    target.mDicTwo = null;
    target.mDicThree = null;
    target.mHomeMain = null;
  }
}
