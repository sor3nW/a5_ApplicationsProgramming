package com.example.a5_xsz863.controller;
import com.example.a5_xsz863.EventDetailsActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.a5_xsz863.MainActivity;
import com.example.a5_xsz863.view.Adapter;
import com.example.a5_xsz863.view.EventView;
import com.example.a5_xsz863.model.CalendarEvent;
import java.util.ArrayList;
public class MainController {

    private Context context;
    Adapter adapter;

    public MainController(Context context, Adapter adapter) {
        this.context = context;
        this.adapter = adapter;
    }
    public void sortByDate(Adapter adapter) {
        EventView.sortByDate(adapter);

    }
    public void sortByCategory(Adapter adapter) {
        EventView.sortByCategory(adapter);
    }
    public void sortByName(Adapter adapter) {
        EventView.sortByName(adapter);
    }

    public void showDetails(CalendarEvent calendarEvent){
        Log.d("listTag", "listener is working ");
        Intent intent = new Intent(this.context, EventDetailsActivity.class);
        intent.putExtra("eventDetails", EventView.fullDescription(calendarEvent));

        this.context.startActivity(intent);
    }

}

