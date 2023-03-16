package com.testrnandroidnativemodule;

import androidx.annotation.NonNull;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.List;

public class NativePackage implements ReactPackage {
    @NonNull
    @Override
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Arrays.<ViewManager>asList(
            new NativeCounterManager()
        );
    }

    @NonNull
    @Override
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        return Arrays.<NativeModule>asList(
            new ToasterModule(reactApplicationContext)
        );
    }
}
