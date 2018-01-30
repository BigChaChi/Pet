package com.yianke.pet.ui.child;

import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.home.DTModel;
import com.yianke.pet.ui.adapter.home.PDAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * 作者：${赵若位} on 2017/6/6 10:20
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PDFragment extends BaseFragment
{
    @Bind(R.id.pd_main)
    ListView mPdMain;

    private PDAdapter mAdapter;
    private int[] images =
            {
                    R.drawable.pd_1,
                    R.drawable.pd_2,
                    R.drawable.pd_3,
                    R.drawable.pd_4,
                    R.drawable.pd_5,
                    R.drawable.pd_6,
                    R.drawable.pd_7,
                    R.drawable.pd_8,
                    R.drawable.pd_9,
            };
    private List<DTModel> mList;


    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_pd;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mList = new ArrayList<>();
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mList.add(new DTModel(R.drawable.jx_header, "Summer麻麻", "#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻", images));
        mPdMain.setAdapter(mAdapter = new PDAdapter(getActivity(), mList));
    }
}
