package com.swift.hotta.tapbreak01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    MyApplication myApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        myApplication = (MyApplication) getApplication();

        GameCanvasFragment gameCanvasFragment = new GameCanvasFragment(this);



    }
}
