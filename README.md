# TitleBar
Android中通用的标题栏
## 引入
```
implementation 'com.github.cattcal:TitleBar:v1.0'
```
###### XML实例
```
<cn.hujw.titlebar.library.TitleBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:title="标题栏" />
```
###### 设置监听事件
```
mTitleBar.setOnTitleBarListener(new OnTitleBarListener() {
            @Override
            public void onLeftClick(View v) {

            }

            @Override
            public void onTitleClick(View v) {

            }

            @Override
            public void onRightClick(View v) {

            }
        });
```
###### 所有属性
```
<declare-styleable name="TitleBar">
        <!-- 整体样式 -->
        <attr name="barStyle">
            <enum name="light" value="0x10" />
            <enum name="night" value="0x20" />
            <enum name="transparent" value="0x30" />
            <enum name="ripple" value="0x40" />
        </attr>
        <!-- 中间 -->
        <attr name="title" format="string" />
        <attr name="titleColor" format="color" />
        <attr name="titleSize" format="dimension" />
        <!-- 左边 -->
        <attr name="leftTitle" format="string" />
        <attr name="leftIcon" format="reference" /><!-- leftIcon 优先于 backButton -->
        <attr name="backButton" format="boolean" /><!-- 返回按钮（默认开） -->
        <attr name="leftColor" format="color" />
        <attr name="leftSize" format="dimension" />
        <attr name="leftBackground" format="reference|color" />
        <!-- 右边 -->
        <attr name="rightTitle" format="string" />
        <attr name="rightIcon" format="reference" />
        <attr name="rightColor" format="color" />
        <attr name="rightSize" format="dimension" />
        <attr name="rightBackground" format="reference|color" />
        <!-- 分割线 -->
        <attr name="lineVisible" format="boolean" />
        <attr name="lineColor" format="reference|color" />
        <attr name="lineSize" format="dimension" />
    </declare-styleable>
```
