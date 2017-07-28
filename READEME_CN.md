# Hidekeyboard
## 摘要 
仿照iOS实现点击非输入框区域 软键盘隐藏 一款使用超简单的轻量级库

## 英文文档
[View English Documents](https://github.com/yingLanNull/HideKeyboard)

## 动画
![1](https://github.com/yingLanNull/HideKeyboard/blob/master/show/show.gif)

## 下载APK体验
[Download Demo](https://github.com/yingLanNull/HideKeyboard/blob/master/show/demo-debug.apk)

## 使用方法
### 步骤 1
#### Gradle 配置
##### 可点击按钮点击支持触发隐藏键盘,如:Button的点击等。
```
dependencies {
    compile 'com.yinglan.keyboard:hidekeyboard:1.1.3'
}
```
##### 可点击按钮点击不可触发隐藏
```
dependencies {
    compile 'com.yinglan.keyboard:hidekeyboard:1.1.1'
}
```

### 步骤 2

#### 代码

##### 主要方法

```
		HideUtil.init(context);
```
或者	
```
		HideUtil.init(context,viewgroup);
```
或者	
```
    //部分情况下init方法无法隐藏软键盘时，调用强制隐藏（1.1.3版本新增方法）
		HideUtil.hideSoftKeyboard(activity);
```

##### 使用
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
或者
```
{
	 @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         ViewGroup viewGroup = (ViewGroup) findViewById(R.id.activity_main);
         HideUtil.init(this,viewGroup);
     }
}

```
或者
```
view.findViewById(R.id.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HideUtil.hideSoftKeyboard(getActivity());
            }
        });
```
## 注意

```
该实现使用了Activity顶层布局android.R.id.content的OnTouchListener监听,重写此监听需注意。
```

## 开源协议

    Apache License Version 2.0

