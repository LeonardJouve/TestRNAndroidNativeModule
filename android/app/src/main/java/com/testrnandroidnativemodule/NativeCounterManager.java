package com.testrnandroidnativemodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class NativeCounterManager extends SimpleViewManager<NativeCounterView> {
    @NonNull
    @Override
    public String getName() {
        return "NativeCounter";
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