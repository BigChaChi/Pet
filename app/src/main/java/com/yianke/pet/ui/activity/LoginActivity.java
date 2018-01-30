package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity
{
    @Bind(R.id.top_text)
    TextView mTopText;


    @Override
    protected int getResourceId()
    {
        return R.layout.activity_login;
    }

    @Override
    public void initView()
    {
        super.initView();
        mTopText.setText("登录");
    }


    @OnClick({R.id.top_back, R.id.login_miss, R.id.login_btn, R.id.login_more})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.login_miss:
                startActivity(new Intent(this, MissActivity.class));
                break;
            case R.id.login_btn:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
            default:
                break;
        }
    }
}
