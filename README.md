# Hidekeyboard
## 摘要
仿照iOS实现点击输入框以外区域 软键盘隐藏

## Gif动画
![1](https://github.com/yingLanNull/HideKeyboard/blob/master/show/show.gif)

## Demo 下载APK体验
[Download Demo](https://github.com/yingLanNull/HideKeyboard/blob/master/show/demo-debug.apk)

## Usage 使用方法
### Step 1
#### Gradle 配置
```
dependencies {
    compile 'com.yinglan.keyboard:hidekeyboard:0.0.2'
}
```

### Step 2

#### In Java Code

```
		HideUtil.init(this);
```

```
	{
	        @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                HideUtil.init(this);
            }
    }

```
## FAQ

```
	该实现使用了Activity顶层布局android.R.id.content的OnTouchListener监听,若使用此功能需注意;
```

## LICENSE

    Apache License Version 2.0

