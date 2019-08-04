# TitleBar
Android中通用的标题栏
## 引入
```
implementation 'com.github.cattcal:TitleBar:v1.0'
```
## XML实例
```
<cn.hujw.titlebar.library.TitleBar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:title="标题栏" />
```
## 设置监听事件
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
