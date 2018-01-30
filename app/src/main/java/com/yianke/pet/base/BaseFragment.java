package com.yianke.pet.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/11/28
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public abstract class BaseFragment extends Fragment
{
    private View rootView;
    protected Activity mActivity;
    protected boolean isUIVisible;//UI是否可被用户看见
    protected boolean isUICreated;//UI是否已被初始化完成



    protected abstract int getResounrceId();


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser)
    {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser)
        {
            isUIVisible = true;
            loadingData();
        } else
        {
            isUIVisible = false;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        isUICreated = true;
        loadingData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootView = inflater.inflate(getResounrceId(), container, false);
        ButterKnife.bind(this, rootView);
        initView(rootView);
        return rootView;
    }

    private void loadingData()
    {
        if (isUIVisible && isUICreated)
        {
            initData();
            isUIVisible = false;
            isUICreated = false;
        }
    }

    /**
     * StateView的根布局，默认是整个界面，如果需要变换可以重写此方法
     */
    public View getStateViewRoot()
    {
        return rootView;
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    /**
     * 初始化一些view
     *
     * @param rootView
     */
    public void initView(View rootView)
    {
    }

    /**
     * 初始化数据
     */
    public void initData()
    {

    }



    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        isUICreated = false;
        isUIVisible = false;
        ButterKnife.unbind(this);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        rootView = null;
    }

}
