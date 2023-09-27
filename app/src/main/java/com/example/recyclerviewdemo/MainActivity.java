package com.example.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Abbrevation> abbrevationArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        String[] abbreviations = getResources().getStringArray(R.array.abbr);

        for (String value : abbreviations) {
            Abbrevation newAbbr = new Abbrevation(value);
            abbrevationArrayList.add(newAbbr);
        }

        // create adapter
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, abbrevationArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // set adapter
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
