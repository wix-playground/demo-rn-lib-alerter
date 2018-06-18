
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import android.widget.Toast;

public class RNAlerterModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAlerterModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAlerter";
  }

  @ReactMethod
  public void alert(String title, String message) {
    Toast.makeText(getReactApplicationContext(), message, 5000).show();
  }
}