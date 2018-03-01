package com.swift.hotta.tapbreak01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    MyApplication myApplication;

    List<String> levelList;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myApplication = (MyApplication) getApplication();


        this.setLevelList();
        this.setMainLevelSpinner();


        this.mainStartButtonOnClick();
        this.mainScoreButtonOnClick();


    }

    public void setLevelList() {
        levelList = new ArrayList<String>();

        levelList.add("level: 1");
        levelList.add("level: 2");
        levelList.add("level: 3");


    }


    public void setMainLevelSpinner() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for (String str : levelList) {
            adapter.add(str);
        }

        spinner = findViewById(R.id.mainLevelSpinner);
        spinner.setAdapter(adapter);
    }


    public void mainStartButtonOnClick() {

        Button btMainStartButton = findViewById(R.id.mainStartButton);
        btMainStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), GameActivity.class);
/*
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("levelList", (ArrayList<String>) levelList);
                bundle.putString("level", (String) spinner.getSelectedItem());
                intent.putExtras(bundle);
*/
                startActivity(intent);

            }
        });
    }

    public void mainScoreButtonOnClick() {

        Button btMainScoreButton = findViewById(R.id.mainScoreButton);
        btMainScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(), ScoreListActivity.class);

                startActivity(intent);


            }
        });

    }



}
