# TitleBar
Android中通用的标题栏
#### 添加依赖
1. 在Project中的build.gradle添加仓库地址
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
2. 在app:中的build.gradle添加框架依赖
```
implementation 'com.github.cattcal:TitleBar:v1.0'
```
#### XML示例
```
<cn.hujw.titlebar.library.TitleBar
        android:id="@+id/mTitleBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:title="标题栏" />
```
#### 设置监听事件
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
#### 所有属性
|name|format|description|
|:-|:-:|-:|
