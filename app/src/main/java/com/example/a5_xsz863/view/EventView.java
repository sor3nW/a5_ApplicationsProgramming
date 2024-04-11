package com.example.a5_xsz863.view;
import com.example.a5_xsz863.MainActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a5_xsz863.MainActivity;
import com.example.a5_xsz863.model.CalendarEvent;

//event view class
public class EventView {
    Adapter adapter;
    public EventView(Adapter adapter){
        this.adapter = adapter;
    }
    public static String abbreviatedDescription(CalendarEvent calendarEvent) {
        return calendarEvent.getEventDate() + " " + calendarEvent.getCategory() + " " + calendarEvent.getEventName();
    }

    public static String fullDescription(CalendarEvent calendarEvent) {
        return calendarEvent.getEventName() + "\n" +
                "Date: " + calendarEvent.getEventDate() + "\n" +
                "Location: " + calendarEvent.getEventLocation() + "\n" +
                "Admission Price: $" + calendarEvent.getAdmissionPrice() + "\n\n" +
                  calendarEvent.getEventDescription();
    }

    public static void sortByDate( Adapter adapter) {
        ArrayList<CalendarEvent> events = adapter.events;
        Collections.sort(events, new DateComparator());
        adapter.notifyDataSetChanged();

    }

    public static void sortByCategory(Adapter adapter) {
        ArrayList<CalendarEvent> events = adapter.events;

        Collections.sort(events, new CategoryComparator());
        adapter.notifyDataSetChanged();
    }

    public static void sortByName(Adapter adapter) {
        ArrayList<CalendarEvent> events = adapter.events;

        Collections.sort(events, new NameComparator());
        adapter.notifyDataSetChanged();

    }
}
