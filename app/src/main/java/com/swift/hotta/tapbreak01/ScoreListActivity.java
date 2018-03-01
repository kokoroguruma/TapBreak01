package com.swift.hotta.tapbreak01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ScoreListActivity extends AppCompatActivity {

    MyApplication myApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_list);

        myApplication = (MyApplication) getApplication();

        setScoreList();


    }


    private void setScoreList() {

        ListView listView = findViewById(R.id.scoreListView);

        String[] listItems = {"aaa","bbb","ccccccc","dddd"};

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);

    }

    private void setScoreListReturnButtonOnClick() {
        Button btScoreListReturnButton = findViewById(R.id.scoreListReturnButton);
        btScoreListReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }


}
