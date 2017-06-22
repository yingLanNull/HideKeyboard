# Hidekeyboard
## Abstract
Modelled on the iOS implementation click on the input box area, soft keyboard hide, a super easy to use library of lightweight.

## Chinese Documents
[点击查看中文文档](https://github.com/yingLanNull/HideKeyboard/blob/master/READEME_CN.md)

## Gif
![1](https://github.com/yingLanNull/HideKeyboard/blob/master/show/show.gif)

## Demo
[Download Demo](https://github.com/yingLanNull/HideKeyboard/blob/master/show/demo-debug.apk)

## Usage
### Step 1
#### Gradle 配置
```
dependencies {
    compile 'com.yinglan.keyboard:hidekeyboard:1.1.2'
}
```

### Step 2

#### In Java Code

##### The main method

```
		HideUtil.init(context);
```
OR	
```
		HideUtil.init(context,viewgroup);
```
##### USE
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
OR
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
## FAQ

```
	The library implementation uses the top layer layout android.R.id.content the OnTouchListener listener, rewrite the monitor to be noted.
```

## LICENSE

    Apache License Version 2.0

