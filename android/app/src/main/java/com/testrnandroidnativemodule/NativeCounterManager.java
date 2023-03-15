package com.testrnandroidnativemodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class NativeCounterManager extends SimpleViewManager<NativeCounterView> {
    public static final String REACT_CLASS = "NativeCounter";
    ReactApplicationContext callerContext;

    public NativeCounterManager(ReactApplicationContext reactContext) {
        callerContext = reactContext;
    }

    @NonNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @NonNull
    @Override
    protected NativeCounterView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new NativeCounterView(themedReactContext);
    }

    @ReactProp(name = "text")
    public void setText(NativeCounterView nativeCounterView, String text) {
        nativeCounterView.setText(text);
    }
}