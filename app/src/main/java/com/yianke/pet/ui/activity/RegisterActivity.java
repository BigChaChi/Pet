package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity implements TextWatcher
{

    @Bind(R.id.top_text)
    TextView mTopText;
    @Bind(R.id.register_phone)
    EditText mRegisterPhone;
    @Bind(R.id.register_pass)
    EditText mRegisterPass;
    @Bind(R.id.register_btn)
    TextView mRegisterBtn;


    @Override
    protected int getResourceId()
    {
        return R.layout.activity_register;
    }

    @Override
    public void initView()
    {
        super.initView();
        mTopText.setText("注册");
        mRegisterPass.addTextChangedListener(this);
        mRegisterPhone.addTextChangedListener(this);
    }


    @OnClick({R.id.top_back, R.id.register_btn, R.id.parent_phone, R.id.parent_pass, R.id.register_agree})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back://返回
                finish();
                break;
            case R.id.register_btn://下一步
                startActivity(new Intent(this, VerificationCodeActivity.class));
                finish();
                break;
            case R.id.parent_phone://点击父类获取焦点
                mRegisterPhone.requestFocus();
                break;
            case R.id.parent_pass://点击父类获取焦点
                mRegisterPass.requestFocus();
                break;
            case R.id.register_agree://用户协议
                startActivity(new Intent(this, AgreeDetialActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after)
    {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count)
    {

    }

    @Override
    public void afterTextChanged(Editable s)
    {
        if (!mRegisterPass.getText().toString().equals("") && !mRegisterPhone.getText().toString().equals(""))
        {
            mRegisterBtn.setBackgroundResource(R.drawable.shape_register_btn_pet);
        } else
        {
            mRegisterBtn.setBackgroundResource(R.drawable.shape_register_btn_32);
        }
    }
}
