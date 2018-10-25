package com.yumf.jince.library;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;

/**
 * Created by jince on 24/10/2018.
 */

public class CommonPopupWindow extends PopupWindow {

    public CommonPopupWindow(Context context, @LayoutRes int layout) {
        this(context, layout, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, android.R.color.transparent);
    }

    public CommonPopupWindow(Context context, @LayoutRes int layout, @DrawableRes int background) {
        this(context, layout, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, background);
    }

    public CommonPopupWindow(Context context, @LayoutRes int layout, int width, int height, @DrawableRes int background) {
        super(context);

        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);

        setWidth(width);
        setHeight(height);

        //背景透明
        setBackgroundDrawable(ContextCompat.getDrawable(context, background));
        // 设置弹窗的布局界面
        setContentView(LayoutInflater.from(context).inflate(layout, null));
    }

}
