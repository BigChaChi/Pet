package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 注册界面获取验证码
 */
public class VerificationCodeActivity extends BaseActivity
{

    @Bind(R.id.top_text)
    TextView mTopText;
    @Bind(R.id.code_nums)
    TextView mCodeNums;
    @Bind(R.id.code_getnums)
    EditText mCodeGetnums;

    private boolean isStart = false;
    private Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);

            if (msg.what == 0)
            {
                isStart = false;
                mCodeNums.setText("重新获取");
                mCodeNums.setClickable(true);
                return;
            }
            mCodeNums.setText(msg.what+" s");
        }
    };

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_verification_code;
    }


    @Override
    public void initView()
    {
        super.initView();
        mTopText.setText("注册");

    }


    @OnClick({R.id.top_back, R.id.code_nums, R.id.code_btn, R.id.register_agree})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.code_nums:
                if (isStart = true)
                {
                    mCodeNums.setClickable(false);
                }
                isStart = true;
                startTime();
                break;
            case R.id.code_btn:
                startActivity(new Intent(this,PetMsgActivity.class));
                finish();
                break;
            case R.id.register_agree:
                startActivity(new Intent(this, AgreeDetialActivity.class));
                break;
            default:
                break;
        }
    }

//    计时器，延迟计时
    private void startTime()
    {
        new Thread()
        {
            @Override
            public void run()
            {
                super.run();
                int position = 3;
                while (isStart)
                {
                    mHandler.sendEmptyMessage(position--);
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
