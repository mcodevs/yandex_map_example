package com.unact.yandexmapkitexample;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

import com.yandex.mapkit.MapKitFactory;

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//    MapKitFactory.setLocale("YOUR_LOCALE");
    MapKitFactory.setApiKey("546fc80d-a44d-4c7c-b61f-e38f913f27ab");
    super.configureFlutterEngine(flutterEngine);
  }
}
