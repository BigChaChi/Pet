// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.ui.adapter.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class JXAdapter$ViewHolder$$ViewBinder<T extends com.yianke.pet.ui.adapter.home.JXAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131231070, "field 'mUserHeaderImg'");
    target.mUserHeaderImg = finder.castView(view, 2131231070, "field 'mUserHeaderImg'");
    view = finder.findRequiredView(source, 2131231071, "field 'mUserName'");
    target.mUserName = finder.castView(view, 2131231071, "field 'mUserName'");
    view = finder.findRequiredView(source, 2131231068, "field 'mUserAir'");
    target.mUserAir = finder.castView(view, 2131231068, "field 'mUserAir'");
    view = finder.findRequiredView(source, 2131231074, "field 'mUserPetImg'");
    target.mUserPetImg = finder.castView(view, 2131231074, "field 'mUserPetImg'");
    view = finder.findRequiredView(source, 2131231075, "field 'mUserPetName'");
    target.mUserPetName = finder.castView(view, 2131231075, "field 'mUserPetName'");
    view = finder.findRequiredView(source, 2131231076, "field 'mUserPetType'");
    target.mUserPetType = finder.castView(view, 2131231076, "field 'mUserPetType'");
    view = finder.findRequiredView(source, 2131231073, "field 'mUserPetFooter'");
    target.mUserPetFooter = finder.castView(view, 2131231073, "field 'mUserPetFooter'");
    view = finder.findRequiredView(source, 2131231072, "field 'mUserPet'");
    target.mUserPet = finder.castView(view, 2131231072, "field 'mUserPet'");
    view = finder.findRequiredView(source, 2131230873, "field 'mItemImg'");
    target.mItemImg = finder.castView(view, 2131230873, "field 'mItemImg'");
    view = finder.findRequiredView(source, 2131230870, "field 'mItemDescript'");
    target.mItemDescript = finder.castView(view, 2131230870, "field 'mItemDescript'");
  }

  @Override public void unbind(T target) {
    target.mUserHeaderImg = null;
    target.mUserName = null;
    target.mUserAir = null;
    target.mUserPetImg = null;
    target.mUserPetName = null;
    target.mUserPetType = null;
    target.mUserPetFooter = null;
    target.mUserPet = null;
    target.mItemImg = null;
    target.mItemDescript = null;
  }
}
