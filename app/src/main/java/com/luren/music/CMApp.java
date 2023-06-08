package com.luren.music;

import android.app.Application;

public class CMApp extends Application {
    private static CMApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static CMApp getInstance() {
        return context;
    }
}
