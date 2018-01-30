package com.yianke.pet.ui.child;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.msg.MsgChildModel;
import com.yianke.pet.ui.adapter.msg.MsgChildAdapter;
import com.yianke.pet.utils.BannerImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017-6-19 14：03
 * 功能：资讯页面-推荐
 */

public class TuiJianFragment extends BaseFragment
{


    @Bind(R.id.tuijian_lists)
    ListView mTuijianLists;

    private MsgChildAdapter mAdapter;
    private List<MsgChildModel> mList;


    private Integer[] images =//banner图片
            {
                    R.drawable.banner_tuijian1,
                    R.drawable.banner_tuijian2,
                    R.drawable.banner_tuijian3,
                    R.drawable.banner_tuijian4,
                    R.drawable.banner_tuijian5
            };
    private String[] titles =
            {
                    "有宠福利购第八期来了，这次是个大手笔",
                    "世界献血日，宠物用血为何这么难",
                    "有宠福布斯：探秘名画中的狗，哪些狗是画家...",
                    "宠事儿：宅男网红养成记",
                    "名撕其实：你走过狗屎运吗？"
            };

    private Banner mBanner;



    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);

        mList = new ArrayList<>();
        mList.add(new MsgChildModel("世界献血日，宠物用血为何这么难", true, true, "刀斥", 22000, R.drawable.tuijian1));
        mList.add(new MsgChildModel("牧羊犬眼部问题", false, false, "娜酷子", 1199, R.drawable.tuijian2));
        mList.add(new MsgChildModel("夜里鬼哭狼嚎的猫，可不止发情这么简单", false, false, "哦四姑", 2298, R.drawable.tuijian3));
        mList.add(new MsgChildModel("三款“板凳”狗，挑选你中意的腊肠犬", false, false, "娜酷子", 1839, R.drawable.tuijian4));
        mList.add(new MsgChildModel("有宠探访实录父亲节特辑：揭秘“种公犬”背后的故事", true, false, "阿汤", 7599, R.drawable.tuijian5));
        mList.add(new MsgChildModel("有宠三句半：东航又一金毛在托运中惨死", false, false, "阿汤", 32000, R.drawable.tuijian6));
        mList.add(new MsgChildModel("猫咪下巴变黑怎么办？", false, false, "娜酷子", 9678, R.drawable.tuijian7));
        mList.add(new MsgChildModel("猫形积木，吸猫新方式", false, false, "蒂娜", 11000, R.drawable.tuijian8));
        mList.add(new MsgChildModel("喵星人打哈欠只是因为困了吗？", false, false, "娜酷子", 9119, R.drawable.tuijian9));
        mList.add(new MsgChildModel("犬激光治疗，缓解炎症和疼痛的首选", false, false, "哦四姑", 3259, R.drawable.tuijian10));
        mList.add(new MsgChildModel("到底是什么引起的呕吐呢？", false, false, "来份豆沙包", 13000, R.drawable.tuijian11));
        mList.add(new MsgChildModel("动物咖啡馆再添新成员，猫头鹰味的可以“尝尝”", false, false, "小灰灰", 5959, R.drawable.tuijian12));
        mList.add(new MsgChildModel("这个世界能不能对我好一点？别让我这么尴尬？", false, false, "云宁", 7879, R.drawable.tuijian13));
        mList.add(new MsgChildModel("挺可爱的小金毛，却长了一张忧国忧民的脸......", false, false, "苗仔", 16000, R.drawable.tuijian14));
        mList.add(new MsgChildModel("自从隔壁开了炸鸡店 哈士奇有了很大的转变", false, false, "苗仔", 18000, R.drawable.tuijian15));
        mList.add(new MsgChildModel("印度女用乳房喂牛吃奶 非洲小孩在全身；涂抹粪便", false, false, "蒂娜", 12000, R.drawable.tuijian16));
        mList.add(new MsgChildModel("来京旅游的亲戚趁主人不在把老猫扔了", false, false, "云宁", 12000, R.drawable.tuijian17));
        mList.add(new MsgChildModel("托运之痛：回家的旅程，竟是一场血淋林的惊魂记", true, true, "欢喜", 87000, R.drawable.tuijian18));
        mTuijianLists.setAdapter(mAdapter = new MsgChildAdapter(mList, getActivity()));


        //加载ListView顶部banner以及搜索框
        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header_msg_tuijian, null);
        mTuijianLists.addHeaderView(header);
        mBanner = (Banner) header.findViewById(R.id.banner);
        mBanner.setImageLoader(new BannerImageLoader());
        mBanner.setImages(Arrays.asList(images));
        mBanner.setIndicatorGravity(BannerConfig.RIGHT);
        mBanner.setBannerTitles(Arrays.asList(titles));
        mBanner.start();
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

    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_tuijian;
    }
}
