package cn.hujw.titlebar.library.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;

import cn.hujw.titlebar.library.ITitleBarStyle;
import cn.hujw.titlebar.library.utils.DensityUtils;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description: 默认样式基类
 * @email: hujw_android@163.com
 */
public abstract class BaseTitleBarStyle implements ITitleBarStyle {

    private Context mContext;

    public Context getContext() {
        return mContext;
    }

    public BaseTitleBarStyle(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public int getTitleGravity() {
        return Gravity.CENTER;
    }

    @Override
    public int getDrawablePadding() {
        return DensityUtils.dp2px(mContext, 2);
    }

    @Override
    public int getChildPadding() {
        return DensityUtils.dp2px(mContext, 12);
    }

    @Override
    public int getTitleBarHeight() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            //获取 ActionBar 的高度
            TypedArray ta = mContext.obtainStyledAttributes(new int[]{android.R.attr.actionBarSize});
            int actionBarSize = (int) ta.getDimension(0, 0);
            ta.recycle();
            return actionBarSize;
        }
        //ActionBar 的高度为 154 px，计算得出为 56 dp
        return DensityUtils.dp2px(mContext, 56);
    }

    @Override
    public float getLeftSize() {
        return DensityUtils.sp2px(mContext, 14);
    }

    @Override
    public float getTitleSize() {
        return DensityUtils.sp2px(mContext, 16);
    }

    @Override
    public float getRightSize() {
        return DensityUtils.sp2px(mContext, 14);
    }


    @Override
    public int getLineSize() {
        return 1;
    }

    protected Drawable getDrawable(int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return getContext().getResources().getDrawable(id, getContext().getTheme());
        } else {
            return getContext().getResources().getDrawable(id);
        }
    }

    protected int getColor(int id) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return getContext().getResources().getColor(id, getContext().getTheme());
        } else {
            return getContext().getResources().getColor(id);
        }
    }
}
