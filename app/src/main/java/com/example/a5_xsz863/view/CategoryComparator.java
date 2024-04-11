package com.example.a5_xsz863.view;
import com.example.a5_xsz863.model.CalendarEvent;
import java.util.Comparator;

//this is a comparator

public class CategoryComparator implements Comparator<CalendarEvent> {
    @Override
    public int compare(CalendarEvent event1, CalendarEvent event2) {
        int categoryComparison = event1.getCategory().compareTo(event2.getCategory());
        if (categoryComparison != 0) {
            return categoryComparison;
        }
        int dateComparison = event1.getEventDate().compareTo(event2.getEventDate());
        if (dateComparison != 0) {
            return dateComparison;
        }
        return event1.getEventName().compareTo(event2.getEventName());
    }
}
