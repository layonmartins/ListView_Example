package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Octopus", "Pig", "Sheep", "Rabbit", "Snake", "Spider"};

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary."
    };

    Integer[] imageArray = {
            R.drawable.octopus,
            R.drawable.pig,
            R.drawable.sheep,
            R.drawable.rabbit,
            R.drawable.snake,
            R.drawable.spider
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray);

        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);
    }
}
