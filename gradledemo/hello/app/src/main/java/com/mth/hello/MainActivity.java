package com.mth.hello;

import android.app.Activity;
import android.os.Bundle;

/**
 * https://docs.gradle.org/current/userguide/build_lifecycle.html
 * settings.gradle -->'hello:app'引入方式编译
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
