package me.temoa.glideprogressexample;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by lai
 * on 2018/5/3.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
