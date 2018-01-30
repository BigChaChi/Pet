package com.yianke.pet.base;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.yianke.pet.R;
import com.yianke.pet.ui.activity.MainActivity;
import com.yianke.pet.utils.StatusBarUtils;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public abstract class BaseActivity extends AutoLayoutActivity
{

    private static long mPreTime;
    private static Activity mCurrentActivity;// 对所有activity进行管理
    public static List<Activity> mActivities = new LinkedList<Activity>();
    protected Bundle savedInstanceState;


    protected abstract int getResourceId();

    @Override
    public final void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        //初始化的时候将其添加到集合中
        synchronized (mActivities)
        {
            mActivities.add(this);
        }
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//设置Activity不允许横屏
        StatusBarUtils.setColorNoTranslucent(this, getResources().getColor(R.color.colorPet));
        setContentView(getResourceId());
        ButterKnife.bind(this);
        initView();
        initData();
    }



    public void initView()
    {
    }

    public void initData()
    {
    }



    @Override
    protected void onResume()
    {
        super.onResume();
        mCurrentActivity = this;
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mCurrentActivity = null;
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        //销毁的时候从集合中移除
        synchronized (mActivities)
        {
            mActivities.remove(this);
        }


    }


    /**
     * 退出应用的方法
     */
    public static void exitApp()
    {
        ListIterator<Activity> iterator = mActivities.listIterator();
        while (iterator.hasNext())
        {
            Activity next = iterator.next();
            next.finish();
        }
    }

    public static Activity getCurrentActivity()
    {
        return mCurrentActivity;
    }

    /**
     * 统一退出控制
     */
    @Override
    public void onBackPressed()
    {
        if (mCurrentActivity instanceof MainActivity)
        {
            //如果是主页面
            if (System.currentTimeMillis() - mPreTime > 2000)
            {
                Toast.makeText(this, "再次按返回键关闭", Toast.LENGTH_SHORT).show();
                mPreTime = System.currentTimeMillis();
                return;
            }
        }
        super.onBackPressed();// finish()
    }


}
