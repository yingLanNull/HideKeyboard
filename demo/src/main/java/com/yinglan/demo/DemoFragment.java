package com.yinglan.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yinglan.keyboard.HideUtil;

/**
 * @function ${desc}
 * @auther: Created by sufei
 * @time: 16/9/27
 */

public class DemoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fm_layout, null);
        view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //在需要隐藏软键盘的地方，HideUtil.init(context)方法无效时可以尝试使用
                HideUtil.hideSoftKeyboard(getActivity());
            }
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        HideUtil.init(getActivity());
    }
}
