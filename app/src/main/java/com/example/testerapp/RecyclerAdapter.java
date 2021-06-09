package com.example.testerapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ExampleViewHolder> {

private ArrayList<RecyclerViewItem> mRecyclerViewItems;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        EditText title,name,dateFrom,dateTo;
        public ExampleViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.et_title);
            name=itemView.findViewById(R.id.et_compName);
            dateFrom=itemView.findViewById(R.id.et_dateFrom);
            dateTo=itemView.findViewById(R.id.et_dateTo);
        }
    }


public RecyclerAdapter(ArrayList<RecyclerViewItem> recyclerViewItems)
    {
        mRecyclerViewItems = recyclerViewItems;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerAdapter.ExampleViewHolder holder, int position) {
        RecyclerViewItem currentItem = mRecyclerViewItems.get(position);

        holder.title.setText(currentItem.getEt_title());
        holder.name.setText(currentItem.getEt_companyName());
        holder.dateFrom.setText(currentItem.getEt_dateFrom());
        holder.dateTo.setText(currentItem.getEt_dateTo());
    }

    @Override
    public int getItemCount() {
        return mRecyclerViewItems.size();
    }


}
