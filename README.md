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
#### Gradle
```
dependencies {
    compile 'com.yinglan.keyboard:hidekeyboard:1.2.0'
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
OR	
```
  //Forced hidden keyboard
		HideUtil.hideSoftKeyboard(activity);
```
OR	
```
  //Forced hidden keyboard
		HideUtil.hideSoftKeyboard(view);
```
OR	
```
  //Forced hidden keyboard
		HideUtil.hideDialogSoftKeyboard(dialog);
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
OR
```
view.findViewById(R.id.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HideUtil.hideSoftKeyboard(getActivity());
            }
        });
```
## FAQ

```
	The library implementation uses the top layer layout android.R.id.content the OnTouchListener listener, rewrite the monitor to be noted.
```

## License
The work done has been licensed under Apache License 2.0. The license file can be found
[here](LICENSE). You can find out more about the license at:

http://www.apache.org/licenses/LICENSE-2.0

