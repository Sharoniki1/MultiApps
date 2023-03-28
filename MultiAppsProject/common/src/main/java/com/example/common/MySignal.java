package com.example.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

public class MySignal {

    private static MySignal instance;
    private static Context appContext;

    public static MySignal getInstance() {
        return instance;
    }

    private MySignal(Context context) {
        appContext = context;
    }

    public static MySignal initHelper(Context context) {
        if (instance == null)
            instance = new MySignal(context);
        return instance;
    }

    public void showToast(final String message) {
        // If we put it into handler - we can call in from asynctask outside of main uithread
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                try {
                    Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show();
                } catch (IllegalStateException ex) {}
            }
        });
    }


}
