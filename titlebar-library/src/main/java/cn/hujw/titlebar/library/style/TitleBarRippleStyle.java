package cn.hujw.titlebar.library.style;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

import cn.hujw.titlebar.library.base.BaseTitleBarStyle;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description: 默认水波纹样式实现（布局属性：app:barStyle="ripple"）
 * @email: hujw_android@163.com
 */
public class TitleBarRippleStyle extends TitleBarTransparentStyle {
    public TitleBarRippleStyle(Context context) {
        super(context);
    }

    @Override
    public Drawable getLeftBackground() {
        // Android 3.0 及以上才可以使用水波纹效果
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
                return getDrawable(typedValue.resourceId);
            }
        }
        return super.getLeftBackground();
    }

    @Override
    public Drawable getRightBackground() {
        return getLeftBackground();
    }
}
