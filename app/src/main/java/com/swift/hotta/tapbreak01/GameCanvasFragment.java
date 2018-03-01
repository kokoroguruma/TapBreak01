package com.swift.hotta.tapbreak01;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameCanvasFragment extends Fragment {

    MyApplication myApplication;

    View view;

    public GameCanvasFragment() {
        super();
    }

    @SuppressLint("ValidFragment")
    public GameCanvasFragment(AppCompatActivity appCompatActivity) {
        this();
        myApplication = (MyApplication) appCompatActivity.getApplication();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_game_canvas, container, false);

gameView();


        return view;
    }



    private void gameView() {

        view.setBackgroundColor(Color.BLUE);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

System.out.println("---------------------");


            }
        });




    }



}
