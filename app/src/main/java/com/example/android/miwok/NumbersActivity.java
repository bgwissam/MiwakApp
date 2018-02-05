package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //numbers array
        ArrayList<Words> words = new ArrayList<Words>();

        //list of words
        words.add(new Words("One", "Lutti"));
        words.add(new Words("Two", "otikko"));
        words.add(new Words("Three", "tolookosu"));
        words.add(new Words("Four", "oyyisa"));
        words.add(new Words("Five", "massokka"));
        words.add(new Words("Six", "temmokka"));
        words.add(new Words("Seven", "kenekaku"));
        words.add(new Words("Eight", "kawinta"));
        words.add(new Words("Nine", "wo'e"));
        words.add(new Words("Ten", "na'aacha"));





        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
