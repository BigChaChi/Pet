package com.yianke.pet.ui.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.yianke.pet.R;
import com.yianke.pet.base.BaseActivity;
import com.yianke.pet.config.Config;
import com.yianke.pet.model.leader.LeaderModel;
import com.yianke.pet.ui.adapter.leader.LeaderAdapter;
import com.yianke.pet.ui.custom.LeaderView;
import com.yianke.pet.utils.StatusBarUtils;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

public class LeaderActivity extends BaseActivity
{

    @Bind(R.id.mains)
    RecyclerView mMains;
    @Bind(R.id.indicator)
    AutoLinearLayout mIndicator;
    private List<ImageView> mViewList;

    private LeaderAdapter mAdapter;
    private List<LeaderModel> mList;


    @Override
    protected int getResourceId()
    {
        return R.layout.activity_leader;
    }


    //初始化控件
    @Override
    public void initView()
    {
        super.initView();
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorWhite), 20);
        mList = new ArrayList<>();
        mAdapter = new LeaderAdapter(this);
        final LinearLayoutManager mManager = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        mMains.setLayoutManager(mManager);
        SnapHelper mHelper = new PagerSnapHelper();
        mHelper.attachToRecyclerView(mMains);

        mMains.setAdapter(mAdapter);
        mList.add(new LeaderModel(R.string.leader_title_1, R.string.leader_descript_1, R.drawable.guide_1_anim_1));
        mList.add(new LeaderModel(R.string.leader_title_2, R.string.leader_descript_2, R.drawable.guide_2_anim_1));
        mList.add(new LeaderModel(R.string.leader_title_3, R.string.leader_descript_3, R.drawable.guide_3_anim_1));
        mList.add(new LeaderModel(R.string.leader_title_4, R.string.leader_descript_4, R.drawable.guide_4_anim_1));
        mAdapter.update(mList);

        inDicator();

        mMains.addOnScrollListener(new RecyclerView.OnScrollListener()
        {
            private int item;
            private int lastPosition = -1;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState)
            {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState)
                {
                    case RecyclerView.SCROLL_STATE_IDLE:
                        if (item == -1) return;
                        if (lastPosition == item) return;
                        startAnimation(mManager, item);

                        //修改指示器背景图片
                        mViewList.get(item).setImageResource(R.drawable.shape_leader_circle_pet);
                        mViewList.get(lastPosition).setImageResource(R.drawable.shape_leader_circle_f0);
                        lastPosition = item;
                        break;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy)
            {
                super.onScrolled(recyclerView, dx, dy);
                item = mManager.findFirstCompletelyVisibleItemPosition();

                if (item == 0)
                {
                    if (lastPosition == item) return;
                    startAnimation(mManager, item);
                    lastPosition = item;
                }
            }
        });


    }

    //初始化指示器图标
    private void inDicator()
    {
        mViewList = new ArrayList<>();
        for (int i = 0; i < mList.size(); i++)
        {
            ImageView mView = new ImageView(this.getApplicationContext());
            LinearLayout.LayoutParams mParams = new LinearLayout.LayoutParams(16, 16);
            mParams.setMargins(16, 0, 16, 0);
            mView.setLayoutParams(mParams);
            mView.setImageResource(R.drawable.shape_leader_circle_f0);
            if (i == 0)
            {
                mView.setImageResource(R.drawable.shape_leader_circle_pet);
            }
            mViewList.add(mView);
            mIndicator.addView(mView);
        }
    }


    private void startAnimation(LinearLayoutManager manager, int position)
    {
        if (manager.findViewByPosition(position) != null &&
                manager.findViewByPosition(position).findViewById(R.id.item_image) != null)
        {
            LeaderView mView = (LeaderView) manager.findViewByPosition(position).findViewById(R.id.item_image);
            switch (position)
            {
                case 0:
                    mView.setBitmapResoursID(Config.IMG_ONE);
                    break;
                case 1:
                    mView.setBitmapResoursID(Config.IMG_TWO);
                    break;
                case 2:
                    mView.setBitmapResoursID(Config.IMG_THREE);
                    break;
                case 3:
                    mView.setBitmapResoursID(Config.IMG_FOUR);
                    break;
            }
            mView.setOnFrameFinisedListener(new LeaderView.OnFrameFinishedListener()
            {
                @Override
                public void onStart()
                {
                }

                @Override
                public void onStop()
                {

                }
            });
            mView.setGapTime(50);
            mView.start();
//            lastPosition = item;
        }
    }


    //点击事件监听
    @OnClick({R.id.leader_register, R.id.leader_login})
    public void onViewClicked(View view)
    {
        Intent it = null;
        switch (view.getId())
        {
            case R.id.leader_register:
                it = new Intent(this, RegisterActivity.class);
                break;
            case R.id.leader_login:
                it = new Intent(this, LoginActivity.class);
                break;
            default:
                break;
        }
        startActivity(it);
        finish();
    }


}
