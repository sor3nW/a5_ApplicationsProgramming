package com.example.a5_xsz863;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

/*
*
* this class is the second activity class
* that opens when a details button is pressed
*
* */
public class EventDetailsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        String eventDetails = getIntent().getStringExtra("eventDetails");

        // Use the string as needed
        TextView detailsTextView = findViewById(R.id.details_text_view);
        detailsTextView.setText(eventDetails);
    }
}

