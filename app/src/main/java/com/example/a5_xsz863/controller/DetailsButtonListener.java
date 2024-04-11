package com.example.a5_xsz863.controller;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a5_xsz863.MainActivity;
import com.example.a5_xsz863.model.CalendarEvent;

public class DetailsButtonListener implements View.OnClickListener {

    private CalendarEvent calendarEvent;
    private static MainController mainController;

    public DetailsButtonListener(CalendarEvent calendarEvent) {
        this.calendarEvent = calendarEvent;
    }

    public static void setMainController(MainController controller) {
        mainController = controller;
    }

    @Override
    public void onClick(View v) {

        if (mainController != null) {
            mainController.showDetails(calendarEvent);
        }

    }
}
