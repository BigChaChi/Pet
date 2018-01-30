package com.yianke.pet.ui.child;

import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseFragment;
import com.yianke.pet.model.home.DTModel;
import com.yianke.pet.ui.adapter.home.DTAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * 作者：${赵若位} on 2017/6/6 10:20
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class DTFragment extends BaseFragment
{
    @Bind(R.id.dt_main)
    ListView mDtMain;

    private DTAdapter mAdapter;


    private List<DTModel> mList;
    private int[] images =
            {
                    R.drawable.dt_1,
                    R.drawable.dt_2,
                    R.drawable.dt_3,
                    R.drawable.dt_4,
                    R.drawable.dt_5,
                    R.drawable.dt_6,
                    R.drawable.dt_7,
                    R.drawable.dt_8,
                    R.drawable.dt_9,
            };


    @Override
    protected int getResounrceId()
    {
        return R.layout.fragment_dt;
    }

    @Override
    public void initView(View rootView)
    {
        super.initView(rootView);
        mList = new ArrayList<>();
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mList.add(new DTModel(R.drawable.jx_header, "王豆豆", "#高考Fighting！ #学霸汪，为高考学子加油n(*≧▽≦*)n打\\\\n气，看好你们哦！", images));
        mDtMain.setAdapter(mAdapter = new DTAdapter(getActivity(), mList));
    }
}
