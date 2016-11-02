package com.yinglan.keyboard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by yinglan
 */
public class HideUtil {

    public static void init(Activity activity) {
        new HideUtil(activity);
    }


    private HideUtil(final Activity activity) {
        ViewGroup content = (ViewGroup) activity.findViewById(android.R.id.content);
        content.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                dispatchTouchEvent(activity, motionEvent);

                return false;
            }
        });
    }

    public boolean dispatchTouchEvent(Activity mActivity, MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            View v = mActivity.getCurrentFocus();
            if (null != v && isShouldHideInput(v, ev)) {
                hideSoftInput(mActivity, v.getWindowToken());
            }
        }
        return false;
    }

    /**
     * @param v
     * @param event
     * @return
     */
    private boolean isShouldHideInput(View v, MotionEvent event) {
        if (v instanceof EditText) {
            Rect rect = new Rect();
            v.getHitRect(rect);
            if (rect.contains((int) event.getX(), (int) event.getY())) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param mActivity
     * @param token
     */
    private void hideSoftInput(Activity mActivity, IBinder token) {
        if (token != null) {
            InputMethodManager im = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
            im.hideSoftInputFromWindow(token, InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
