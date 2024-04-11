package com.example.a5_xsz863.view;
import com.example.a5_xsz863.R;
import com.example.a5_xsz863.controller.SortByCategoryListener;
import com.example.a5_xsz863.controller.SortByDateListener;
import com.example.a5_xsz863.controller.SortByNameListener;
import com.example.a5_xsz863.model.CalendarEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.content.Context;
import com.example.a5_xsz863.controller.DetailsButtonListener;
import com.example.a5_xsz863.controller.MainController;

/*
*
* the adapter class extends RecyclerView and is a mediator
*
* */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<CalendarEvent> events;
    public Adapter(Context context, ArrayList<CalendarEvent> events){
        this.context = context;
        this.events = events;

    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.event_item, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        String buttonText = "Details";
        holder.detailsButton.setText(buttonText);
        holder.blurb.setText(EventView.abbreviatedDescription(events.get(position)));

        MainController mainController = new MainController(context, this);
        DetailsButtonListener detButtonListener = new DetailsButtonListener(events.get(position));
        DetailsButtonListener.setMainController(mainController);

        holder.detailsButton.setOnClickListener(detButtonListener);
    }

    @Override
    public int getItemCount() {

        return events.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        Button detailsButton;
        TextView blurb;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            detailsButton = itemView.findViewById(R.id.details_button);
            blurb = itemView.findViewById(R.id.event_blurb);
        }
    }
}
