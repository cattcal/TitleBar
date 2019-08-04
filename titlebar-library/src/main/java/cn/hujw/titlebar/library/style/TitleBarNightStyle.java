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
 * @description: 默认夜间主题样式实现（布局属性：app:barStyle="night"）
 * @email: hujw_android@163.com
 */
public class TitleBarNightStyle extends BaseTitleBarStyle {

    public TitleBarNightStyle(Context mContext) {
        super(mContext);
    }

    @Override
    public Drawable getBackground() {
        return new ColorDrawable(0xFF000000);
    }

    @Override
    public Drawable getBackIcon() {
        return getDrawable(R.mipmap.bar_icon_back_white);
    }

    @Override
    public int getLeftColor() {
        return 0xCCFFFFFF;
    }

    @Override
    public int getTitleColor() {
        return 0xEEFFFFFF;
    }

    @Override
    public int getRightColor() {
        return 0xCCFFFFFF;
    }

    @Override
    public boolean isLineVisible() {
        return true;
    }

    @Override
    public Drawable getLineDrawable() {
        return new ColorDrawable(0xFFFFFFFF);
    }

    @Override
    public Drawable getLeftBackground() {
        return new SelectorDrawable.Builder()
                .setDefault(new ColorDrawable(0x00000000))
                .setFocused(new ColorDrawable(0x66FFFFFF))
                .setPressed(new ColorDrawable(0x66FFFFFF))
                .builder();
    }

    @Override
    public Drawable getRightBackground() {
        return getLeftBackground();
    }
}
