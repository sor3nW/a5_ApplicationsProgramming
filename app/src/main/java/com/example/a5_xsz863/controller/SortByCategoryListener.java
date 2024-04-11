package com.example.a5_xsz863.controller;
import com.example.a5_xsz863.controller.MainController;
import android.content.Context;
import com.example.a5_xsz863.view.Adapter;
import com.example.a5_xsz863.controller.MainController;
import android.view.View;

public class SortByCategoryListener implements View.OnClickListener{

    Context context;
    Adapter adapter;
    public SortByCategoryListener(Context context, Adapter adapter){
        this.context = context;
        this.adapter = adapter;
    }
    @Override
    public void onClick(View v) {

        MainController controller = new MainController(context, adapter);
        controller.sortByCategory(adapter);

    }
}
