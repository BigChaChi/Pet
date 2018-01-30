package com.yianke.pet.ui.child;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.home.JXModel;
import com.yianke.pet.ui.adapter.home.JXAdapter;
import com.yianke.pet.utils.BannerImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;

/**
 * 作者：${赵若位} on 2017/6/6 10:20
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class JXFragment extends BaseFragment
{
    @Bind(R.id.jx_main)
    ListView mJxMain;

    private JXAdapter mAdapter;
    private List<JXModel> mJxList;

    private Banner mBanner;//图片轮播
    private Integer[] images =
            {
                    R.drawable.jx_header_1,
                    R.drawable.jx_header_2,
                    R.drawable.jx_header_3,
                    R.drawable.jx_header_4,
                    R.drawable.jx_header_5,
            };


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mJxList = new ArrayList<>();
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mAdapter = new JXAdapter(getActivity(), mJxList);
        mJxMain.setAdapter(mAdapter);

        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header_jx, null);
        mJxMain.addHeaderView(header);
        mBanner = (Banner) header.findViewById(R.id.banner);
        mBanner.setImageLoader(new BannerImageLoader());
        List<Integer> list = Arrays.asList(images);
        mBanner.setImages(list);

        mBanner.start();

    }


    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_jx;
    }



    @Override
    public void onStart()
    {
        super.onStart();
        if (mBanner != null)
        {
            mBanner.startAutoPlay();
        }
    }

    @Override
    public void onStop()
    {
        super.onStop();
        if (mBanner != null)
        {
            mBanner.stopAutoPlay();
        }
    }
}

