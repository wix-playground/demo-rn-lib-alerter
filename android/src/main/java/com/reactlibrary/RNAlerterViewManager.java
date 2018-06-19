package com.reactlibrary;


import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import java.util.logging.Logger;


public class RNAlerterViewManager extends SimpleViewManager<Button> {

    public static final String REACT_CLASS = "RNAlerterView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected Button createViewInstance(ThemedReactContext reactContext) {
        Button tv = new Button(reactContext);
        tv.setLayoutParams(new LinearLayout.LayoutParams(200,200));
        tv.setText("123");
        return tv;
    }
}