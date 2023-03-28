package com.example.common;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textview.MaterialTextView;

public class HomeActivity extends AppCompatActivity {

    private Button home_BTN_start;
    private MaterialTextView home_LBL_ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        home_BTN_start = findViewById(R.id.home_BTN_start);
        home_LBL_ad = findViewById(R.id.home_LBL_ad);
        home_LBL_ad.setText(App_Parent.adid);

        home_BTN_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, App_Parent.mainClass));
            }
        });
    }
}