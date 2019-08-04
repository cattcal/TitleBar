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
 * @description: 默认日间主题样式实现（布局属性：app:barStyle="light"）
 * @email: hujw_android@163.com
 */
public class TitleBarLightStyle extends BaseTitleBarStyle {

    public TitleBarLightStyle(Context mContext) {
        super(mContext);
    }

    @Override
    public Drawable getBackground() {
        return new ColorDrawable(0xFFFFFFFF);
    }

    @Override
    public Drawable getBackIcon() {
        return getDrawable(R.mipmap.bar_icon_back_black);
    }

    @Override
    public int getLeftColor() {
        return 0xFF666666;
    }

    @Override
    public int getTitleColor() {
        return 0xFF222222;
    }

    @Override
    public int getRightColor() {
        return 0xFFA4A4A4;
    }

    @Override
    public boolean isLineVisible() {
        return true;
    }

    @Override
    public Drawable getLineDrawable() {
        return new ColorDrawable(0xFFECECEC);
    }

    @Override
    public Drawable getLeftBackground() {
        return new SelectorDrawable.Builder()
                .setDefault(new ColorDrawable(0x00000000))
                .setFocused(new ColorDrawable(0x0C000000))
                .setPressed(new ColorDrawable(0x0C000000))
                .builder();
    }

    @Override
    public Drawable getRightBackground() {
        return getLeftBackground();
    }
}
