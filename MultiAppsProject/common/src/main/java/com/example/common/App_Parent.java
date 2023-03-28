package com.example.common;

import android.app.Application;
import android.content.Context;

public abstract class App_Parent extends Application {

    public static String adid = null;
    protected static Class<?> mainClass;


    protected  abstract String getWeatherApiKey();
    protected abstract  String getAdMobBannerID();


    @Override
    public void onCreate() {
        super.onCreate();

        MySignal.initHelper(this);
        String weatherApiKey = getWeatherApiKey();
        initAPI(weatherApiKey);

        adid = getAdMobBannerID();
    }

    private void initAPI(String weatherApiKey) {
    }
}
