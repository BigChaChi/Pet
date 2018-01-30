package com.yianke.pet.ui.activity;

import android.webkit.WebView;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;

import butterknife.Bind;
import butterknife.OnClick;

public class AgreeDetialActivity extends BaseActivity
{

    @Bind(R.id.top_text)
    TextView mTopText;
    @Bind(R.id.agree_web)
    WebView mAgreeWeb;

    private String url_agree = "http://www.yc.cn/app/info/agreement.html?petVer=390&petPlat=1&packetId=2000";

    @Override
    protected int getResourceId()
    {
        return R.layout.activity_agree_detial;
    }


    @Override
    public void initView()
    {
        super.initView();
        mTopText.setText("有宠用户服务协议");
        mAgreeWeb.loadUrl(url_agree);
    }


    @OnClick(R.id.top_back)
    public void onViewClicked()
    {
        finish();
    }
}
