package cn.hujw.titlebar.library;

import android.view.View;

/**
 * @author: hujw
 * @date: 2019/8/4
 * @description: 标题栏点击监听接口
 * @email: hujw_android@163.com
 */
public interface OnTitleBarListener {
    /**
     * 左边点击事件
     * @param v 被点击的左View
     */
    void onLeftClick(View v);

    /**
     *标题点击事件
     * @param v 被点击的标题View
     */
    void onTitleClick(View v);

    /**
     *右边点击事件
     * @param v 被点击的右View
     */
    void onRightClick(View v);
}
