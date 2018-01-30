package com.yianke.pet.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.shop.Pintuan;
import com.yianke.pet.model.shop.ShopModel;
import com.yianke.pet.ui.adapter.PintuanAdapter;
import com.yianke.pet.ui.adapter.shop.ShopAdapter;
import com.yianke.pet.utils.BannerImageLoader;
import com.youth.banner.Banner;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：${赵若位} on 2017/6/3 23:06
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class ShoppingFragment extends BaseFragment
{

    @Bind(R.id.shop_main)
    ListView mShopMain;


    private ShopAdapter mAdapter;
    private List<ShopModel> mList;
    private View header;
    private Integer[] images =
            {
                    R.drawable.banner_shop1,
                    R.drawable.banner_shop2,
                    R.drawable.banner_shop3,
                    R.drawable.banner_shop4,
                    R.drawable.banner_shop5
            };

    private Banner mBanner;




    private void initFooter()
    {
        View footer = LayoutInflater.from(getActivity()).inflate(R.layout.item_shopping_footer, null);
        AutoUtils.autoSize(footer);
        mShopMain.addFooterView(footer);
    }

    /**
     * 初始化顶部
     */
    private void initHeader()
    {
        List<Pintuan> mList = new ArrayList<>();
        mList.add(new Pintuan(R.drawable.pintuan_one, "【天然健康膳\n食狗粮，提升...", 39.9, 99));
        mList.add(new Pintuan(R.drawable.pintuan_two, "【适合搭配\n各类猫砂使用...", 29, 62));
        mList.add(new Pintuan(R.drawable.pintuan_three, "【温和配方,\n消炎止痒，抗...", 25, 40));
        mList.add(new Pintuan(R.drawable.pintuan_four, "【精致牛肉肉\n粒，美味有营...", 9.9, 35));
        mList.add(new Pintuan(R.drawable.pintuan_five, "【营养护理系\n列零食，美毛...", 19.9, 39));
        mList.add(new Pintuan(R.drawable.pintuan_six, "【买即送罐\n头】贵族鸸鹋...", 59, 125));
        mList.add(new Pintuan(R.drawable.pintuan_seven, "派地奥 盒装乳\n胶犬用玩具 宠...", 15.9, 35));
        mList.add(new Pintuan(R.drawable.pintuan_eight, "【满99送大礼\n包】 大宠爱 体...", 219, 438));
        mList.add(new Pintuan(R.drawable.pintuan_nine, "柏可心 猫薄荷\n猫零食 天然4...", 6.9, 19));

        header = LayoutInflater.from(getActivity()).inflate(R.layout.header_shopping, null);
        RecyclerView mHeaderMain = (RecyclerView) header.findViewById(R.id.header_recycler);
        mBanner = (Banner) header.findViewById(R.id.banner);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mHeaderMain.setLayoutManager(manager);
        mHeaderMain.setAdapter(new PintuanAdapter(mList, getActivity()));
        mHeaderMain.setNestedScrollingEnabled(false);

        mBanner.setImageLoader(new BannerImageLoader());
        mBanner.setImages(Arrays.asList(images));
        mBanner.start();
    }

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_shopping;
    }


    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        initHeader();
        mShopMain.addHeaderView(header);
        mList = new ArrayList<>();
        mList.add(new ShopModel("主粮零食", R.drawable.shop_parent1, new int[]{R.drawable.shop_child1, R.drawable.shop_child2, R.drawable.shop_child3, R.drawable.shop_child4,
                R.drawable.shop_child5, R.drawable.shop_child6, R.drawable.shop_child7, R.drawable.shop_child8, R.drawable.shop_child9}));

        mList.add(new ShopModel("医疗保健", R.drawable.shop_parent2, new int[]{R.drawable.shop_child10, R.drawable.shop_child11, 0, R.drawable.shop_child12, R.drawable.shop_child13, 0,
                R.drawable.shop_child14, 0, R.drawable.shop_child15}));

        mList.add(new ShopModel("玩具用品", R.drawable.shop_parent3, new int[]{R.drawable.shop_child16, R.drawable.shop_child17, R.drawable.shop_child18, R.drawable.shop_child19,
                R.drawable.shop_child20, R.drawable.shop_child21, R.drawable.shop_child22, R.drawable.shop_child23, R.drawable.shop_child24}));


        mAdapter = new ShopAdapter(getActivity(), mList);
        mShopMain.setAdapter(mAdapter);
        initFooter();
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
