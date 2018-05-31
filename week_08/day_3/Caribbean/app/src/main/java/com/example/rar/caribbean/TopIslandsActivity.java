package com.example.rar.caribbean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TopIslandsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_islands);

        TopIslands topIslands = new TopIslands();
        ArrayList<Islands> list = topIslands.getList();

        TopIslandsAdapter islandsAdapter = new TopIslandsAdapter(this, list);

        ListView listView = findViewById(R.id.Islands);
        listView.setAdapter(islandsAdapter);
    }
}
