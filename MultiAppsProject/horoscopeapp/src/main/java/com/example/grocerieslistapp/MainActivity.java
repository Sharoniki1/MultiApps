package com.example.grocerieslistapp;

import com.example.common.MainParentActivity;

import java.util.ArrayList;

public class MainActivity extends MainParentActivity {
    @Override
    protected ArrayList<String> getData() {
        return DataManager.getHoroscope();
    }
}
