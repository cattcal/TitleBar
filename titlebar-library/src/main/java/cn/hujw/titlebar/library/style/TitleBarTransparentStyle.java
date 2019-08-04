package cn.hujw.titlebar.library.style;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

import cn.hujw.titlebar.library.R;
import cn.hujw.titlebar.library.SelectorDrawable;
import cn.hujw.titlebar.library.base.BaseTitleBarStyle;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description: 默认透明主题样式实现（布局属性：app:barStyle="transparent"）
 * @email: hujw_android@163.com
 */
public class TitleBarTransparentStyle extends BaseTitleBarStyle {

    public TitleBarTransparentStyle(Context mContext) {
        super(mContext);
    }

    @Override
    public Drawable getBackground() {
        return new ColorDrawable(0x00000000);
    }

    @Override
    public Drawable getBackIcon() {
        return getDrawable(R.mipmap.bar_icon_back_white);
    }

    @Override
    public int getLeftColor() {
        return 0xFFFFFFFF;
    }

    @Override
    public int getTitleColor() {
        return 0xFFFFFFFF;
    }

    @Override
    public int getRightColor() {
        return 0xFFFFFFFF;
    }

    @Override
    public boolean isLineVisible() {
        return false;
    }

    @Override
    public Drawable getLineDrawable() {
        return new ColorDrawable(0x00000000);
    }

    @Override
    public int getLineSize() {
        return 0;
    }

    @Override
    public Drawable getLeftBackground() {
        return new SelectorDrawable.Builder()
                .setDefault(new ColorDrawable(0x00000000))
                .setFocused(new ColorDrawable(0x22000000))
                .setPressed(new ColorDrawable(0x22000000))
                .builder();
    }

    @Override
    public Drawable getRightBackground() {
        return getLeftBackground();
    }
}
