package com.example.multiappsproject;

import com.example.common.App_Parent;

public class App extends App_Parent {

    @Override
    protected String getWeatherApiKey() {
        return BuildConfig.WEATHER_API_KEY;
    }

    @Override
    protected String getAdMobBannerID() {
        return BuildConfig.AD_KEY;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mainClass = MainActivity.class;
        //adid= getAdMobBannerID();
    }
}
