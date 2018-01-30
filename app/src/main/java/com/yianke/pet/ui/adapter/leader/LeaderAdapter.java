package com.yianke.pet.ui.adapter.leader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.model.leader.LeaderModel;
import com.yianke.pet.ui.custom.LeaderView;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2018/1/27
 * 邮箱：1070138445@qq.com
 * 功能：引导页适配器
 */

public class LeaderAdapter extends RecyclerView.Adapter<LeaderAdapter.ViewHolder>
{

    private Context mContext;
    private List<LeaderModel> mList;


    //
    public LeaderAdapter(Context mContext)
    {
        this.mContext = mContext.getApplicationContext();
        mList = new ArrayList<>();
    }


    public void update(List<LeaderModel> list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }

        mList.clear();
        mList.addAll(list);
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View layout = LayoutInflater.from(mContext).inflate(R.layout.item_leader, parent, false);
        ViewHolder holder = new ViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        LeaderModel data = mList.get(position);
        holder.mItemTitle.setText(mContext.getString(data.getTitle()));
        holder.mItemDescript.setText(mContext.getString(data.getDescript()));


        Canvas mCanvas = new Canvas();
        Bitmap mBitmap = BitmapFactory.decodeResource(mContext.getResources(),
                data.getRescourceId());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Rect mSrcRect, mDestRect;
        mSrcRect = new Rect(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
        mDestRect = new Rect(0, 0, holder.mItemView.getWidth(), holder.mItemView.getHeight());
        mCanvas.drawBitmap(mBitmap, mSrcRect, mDestRect, paint);

        holder.mItemView.setImageBitmap(mBitmap);
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @Bind(R.id.item_title)
        TextView mItemTitle;
        @Bind(R.id.item_descript)
        TextView mItemDescript;
        @Bind(R.id.item_image)
        LeaderView mItemImage;
        @Bind(R.id.item_view)
        ImageView mItemView;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

