package com.yianke.pet.utils;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.youth.banner.loader.ImageLoader;

/**
 * 作者：赵若位
 * 时间：2018/1/30
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BannerImageLoader extends ImageLoader
{

    @Override
    public void displayImage(Context context, Object path, ImageView imageView)
    {
        Picasso.with(context)
                .load((Integer) path)
                .fit()
                .centerCrop()
                .into(imageView);
    }
}
