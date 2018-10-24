package com.yumf.jince.library;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.widget.PopupWindow;

/**
 * Created by jince on 24/10/2018.
 */

public class CommonPopupWindow extends PopupWindow {


    public CommonPopupWindow(Context context, @LayoutRes int layout, int width, int height) {
        super(context);

        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(true);

        setWidth(width);
        setHeight(height);

        // 设置弹窗的布局界面
        setContentView(LayoutInflater.from(context).inflate(layout, null));
    }

}
