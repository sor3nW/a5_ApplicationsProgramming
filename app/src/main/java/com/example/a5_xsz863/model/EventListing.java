package com.example.a5_xsz863.model;



import android.content.Context;
import android.util.Log;

import com.example.a5_xsz863.R;
import com.example.a5_xsz863.model.CalendarEvent;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
*
* Event Listing uses the input file to create the arraylist of
* Calendar events
* */

public class EventListing {
    InputStream is;
    public EventListing(InputStream is){
        this.is = is;
    }


    public ArrayList<CalendarEvent> readEventsFromCSV() {
        ArrayList<CalendarEvent> events = new ArrayList<CalendarEvent>(); // Initialize the ArrayList outside the try-catch block
        InputStream is = this.is;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8)
        );

        String line = "";

        try {
            while ( (line = reader.readLine()) != null){

                String[] e = line.split(",");

                CalendarEvent newEvent = new CalendarEvent(e[0],e[1],e[2],Integer.parseInt(e[3]),Integer.parseInt(e[4]),e[5],e[6]);
                events.add(newEvent);
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading file");
            e.printStackTrace();
        }

        // Return the ArrayList after reading the file
        return events;
    }
}
