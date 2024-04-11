package com.example.a5_xsz863.controller;

import android.content.Context;
import android.view.View;

import com.example.a5_xsz863.view.Adapter;

public class SortByDateListener implements View.OnClickListener{
    Context context;
    Adapter adapter;
    public SortByDateListener(Context context, Adapter adapter){
        this.context = context;
        this.adapter = adapter;
    }

    public void onClick(View v) {

        MainController controller = new MainController(context, adapter);
        controller.sortByDate(adapter);

    }
}
