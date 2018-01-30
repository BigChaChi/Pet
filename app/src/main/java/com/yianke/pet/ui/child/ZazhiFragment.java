package com.yianke.pet.ui.child;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.msg.ZazhiModel;
import com.yianke.pet.ui.adapter.msg.ZazhiAdapter;
import com.yianke.pet.utils.BannerImageLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/6/19 19:34
 * 功能：资讯---杂志页面
 */

public class ZazhiFragment extends BaseFragment
{
    @Bind(R.id.zhazi_recycler)
    RecyclerView mZhaziRecycler;
    @Bind(R.id.banner)
    Banner mBanner;

    private List<ZazhiModel> mList;
    private ZazhiAdapter mAdapter;

    private Integer[] images =
            {
                    R.drawable.banner_zazhi1,
                    R.drawable.banner_zazhi2,
                    R.drawable.banner_zazhi3,
                    R.drawable.banner_zazhi4,
                    R.drawable.banner_zazhi5
            };
    private String[] titles =
            {
                    "封面故事--《家·猫·果实》",
                    "专题巨献--《帝苑猫说》",
                    "封面故事--《戏痞士与惊魂鸟》",
                    "活着--《生存游戏》",
                    "专题巨献--《猎场》"
            };



    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_zhazi;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);

        mList = new ArrayList<>();

        mList.add(new ZazhiModel(R.drawable.zazhi1, "第12期", "May.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi2, "第11期", "Apr.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi3, "第10期", "Mar.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi4, "第9期", "Feb.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi5, "第8期", "Jan.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi6, "第7期", "Dec.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi7, "第6期", "Nov.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi8, "第5期", "Oct.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi9, "第4期", "Sep.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi10, "第3期", "Aug.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi11, "第2期", "Jul.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi12, "第1期", "Jun.2016"));

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mZhaziRecycler.setNestedScrollingEnabled(false);
        mZhaziRecycler.setLayoutManager(manager);
        mZhaziRecycler.setAdapter(mAdapter = new ZazhiAdapter(mList, getActivity()));

        mBanner.setImageLoader(new BannerImageLoader());
        mBanner.setImages(Arrays.asList(images));
        mBanner.start();
    }

    @Override
    public void onStart()
    {
        super.onStart();
        mBanner.startAutoPlay();
    }

    @Override
    public void onStop()
    {
        super.onStop();
        mBanner.stopAutoPlay();
    }
}
