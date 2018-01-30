package com.yianke.pet.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MissActivity extends BaseActivity
{

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_miss;
    }


    @OnClick({R.id.top_back, R.id.miss_btn})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.miss_btn:
                finish();
                break;
            default:
                break;
        }
    }
}
