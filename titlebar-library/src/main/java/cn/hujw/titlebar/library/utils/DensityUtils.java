package cn.hujw.titlebar.library.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description:
 * @email: hujw_android@163.com
 */
public class DensityUtils {

    /**
     * dp转px
     *
     * @param context
     * @param dpValue
     * @return
     */
    public static int dp2px(Context context, float dpValue) {

        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpValue, context.getResources().getDisplayMetrics());
    }

    public static int sp2px(Context context, float spValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spValue, context.getResources().getDisplayMetrics());
    }

}
