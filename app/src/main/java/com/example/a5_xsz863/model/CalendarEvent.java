package com.example.a5_xsz863.model;
/*
* CalendarEvent is a class for holding all of the different categories
* for each event
* */
public class CalendarEvent {
    private String category;
    private String eventName;
    private String eventLocation;
    private int month;
    private int dayOfMonth;
    private String admissionPrice;
    private String eventDescription;

    // Constructor
    public CalendarEvent(String category, String eventName, String eventLocation, int month, int dayOfMonth, String admissionPrice, String eventDescription) {
        this.category = category;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.admissionPrice = admissionPrice;
        this.eventDescription = eventDescription;
    }

    // Getters
    public String getCategory() {
        return category;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }
    public String getEventDate() {
        return String.format("%02d/%02d", month, dayOfMonth);
    }

    public String getEventBlurb() {return (getEventDate() + " " + getCategory() + " " + getEventName());}

    public String getAdmissionPrice() {
        return admissionPrice;
    }

    public String getEventDescription() {
        return eventDescription;
    }
}
