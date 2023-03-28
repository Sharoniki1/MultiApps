package com.example.common;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public abstract class MainParentActivity extends AppCompatActivity {

    public final static int NUM_SENTENCE = 9;
    final Handler handler = new Handler();

    private Button[] allButtons;
    private ArrayList<String> dataBase;
    protected abstract ArrayList<String> getData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();
        dataBase = getData();

        initiateCards();
    }

    private void initiateCards() {
        for(int i=0; i<NUM_SENTENCE; i++)
            allButtons[i].setText(dataBase.get(i));

    }

    private void initViews() {

        for(int i=0; i<allButtons.length; i++) {
            int finalI = i;
            allButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    allButtons[finalI].setTextColor(Color.BLUE);

                    updateUI(finalI);
                }
            });
        }

    }

    private void updateUI(int buttonNumber) {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                //TODO the color should be as same as button's color
                allButtons[buttonNumber].setTextColor(Color.WHITE);

            }
        }, 5000);
    }

    private void findViews() {

        allButtons = new Button[]{
                findViewById(R.id.game_BTN_p1),
                findViewById(R.id.game_BTN_p2),
                findViewById(R.id.game_BTN_p3),
                findViewById(R.id.game_BTN_p4),
                findViewById(R.id.game_BTN_p5),
                findViewById(R.id.game_BTN_p6),
                findViewById(R.id.game_BTN_p7),
                findViewById(R.id.game_BTN_p8),
                findViewById(R.id.game_BTN_p9)
        };
    }


}
