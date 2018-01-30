package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * 设置宠物信息
 */
public class PetMsgActivity extends BaseActivity
{

    @Bind(R.id.top_text)
    TextView mTopText;

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_pet_msg;
    }

    @Override
    public void initView()
    {
        super.initView();
        mTopText.setText("添加宠物");
    }


    @OnClick({R.id.top_back, R.id.msg_long, R.id.msg_save})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.msg_long:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
            case R.id.msg_save:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;
            default:
                break;
        }
    }
}
