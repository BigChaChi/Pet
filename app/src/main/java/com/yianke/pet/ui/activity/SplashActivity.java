package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;
import com.yianke.pet.config.Config;
import com.yianke.pet.utils.BaseHandler;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.ButterKnife;

/**
 * 界面启动页
 */
public class SplashActivity extends BaseActivity
{
    @Override
    protected int getResourceId()
    {
        return R.layout.activity_splash;
    }

    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColorNoTranslucent(this, Color.WHITE);
        new BaseHandler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent it = new Intent(SplashActivity.this, LeaderActivity.class);
                startActivity(it);
                finish();
            }
        }, 1500);
    }
}
