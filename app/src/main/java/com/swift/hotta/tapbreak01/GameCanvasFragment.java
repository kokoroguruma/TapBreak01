package com.swift.hotta.tapbreak01;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
        // Required empty public constructor
        myApplication = (MyApplication) getActivity().getApplication();
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

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

System.out.println("---------------------");


            }
        });




    }



}
