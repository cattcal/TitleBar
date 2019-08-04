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
|title|string|标题|
|titleColor|string|标题颜色|
|titleSize|dimension|标题大小|
|leftTitle|string|左标题|
|leftIcon|reference|左图标（leftIcon优先于backButton）|
|leftColor|string|左标题颜色|
|leftSize|dimension|左标题大小|
|leftBackground|reference/color|左标题背景|
|rightTitle|string|右标题|
|rightIcon|reference|右图标|
|rightColor|string|右标题颜色|
|rightSize|dimension|右标题大小|
|rightBackground|reference/color|右标题背景|
|lineVisible|boolean|分割线|
|lineColor|string|分割线颜色|
|lineSize|dimension|分割线大小|
#### 尾语
话不多说，喜欢的话，点个star


