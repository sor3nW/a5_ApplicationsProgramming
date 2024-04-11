package com.example.a5_xsz863;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a5_xsz863.controller.MainController;
import com.example.a5_xsz863.controller.SortByCategoryListener;
import com.example.a5_xsz863.controller.SortByDateListener;
import com.example.a5_xsz863.controller.SortByNameListener;
import com.example.a5_xsz863.view.Adapter;
import com.example.a5_xsz863.model.CalendarEvent;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import com.example.a5_xsz863.model.EventListing;
import android.widget.Button;
/* Main Activity is the main running file for the app where
* I create the adapter and recycler view
* setUpEvents() access the csv file and sends it to the EventListing class
* to get parsed
*
* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ArrayList<CalendarEvent> events = null;

        events = setUpEvents();

        Adapter adapter = new Adapter(this, events);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        SortByCategoryListener categoryListener = new SortByCategoryListener(this, adapter);
        SortByDateListener dateListener = new SortByDateListener(this, adapter);
        SortByNameListener nameListener = new SortByNameListener(this, adapter);

        Button dateSort = findViewById(R.id.sort_by_date);
        dateSort.setOnClickListener(dateListener);

        Button categorySort = findViewById(R.id.sort_by_category);
        categorySort.setOnClickListener(categoryListener);

        Button nameSort = findViewById(R.id.sort_by_name);
        nameSort.setOnClickListener(nameListener);
    }

    public ArrayList<CalendarEvent> setUpEvents(){
        EventListing newList = new EventListing(getResources().openRawResource(R.raw.events));
        ArrayList<CalendarEvent> events = newList.readEventsFromCSV();
        return events;
    }

}