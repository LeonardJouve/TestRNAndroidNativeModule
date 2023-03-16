package com.testrnandroidnativemodule;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ToasterModule extends ReactContextBaseJavaModule {
    ReactApplicationContext context;
    Toast toast;
    ToasterModule(ReactApplicationContext context) {
        super(context);
        this.context = context;
    }

    @NonNull
    @Override
    public String getName() {
        return "NativeToaster";
    }

    @ReactMethod
    public void toast(String message, Integer duration)  {
        if (this.toast != null) {
            this.toast.cancel();
        }
        this.toast = Toast.makeText(this.context, message, duration);
        this.toast.show();
    }
}
