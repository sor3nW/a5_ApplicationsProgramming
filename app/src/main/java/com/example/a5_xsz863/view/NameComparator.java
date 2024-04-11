package com.example.a5_xsz863.view;
import java.util.Comparator;
import com.example.a5_xsz863.model.CalendarEvent;
//this is a comparator
public class NameComparator implements Comparator<CalendarEvent> {
    @Override
    public int compare(CalendarEvent event1, CalendarEvent event2) {
        int nameComparison = event1.getEventName().compareTo(event2.getEventName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        int dateComparison = event1.getEventDate().compareTo(event2.getEventDate());
        if (dateComparison != 0) {
            return dateComparison;
        }
        return event1.getCategory().compareTo(event2.getCategory());
    }
}

