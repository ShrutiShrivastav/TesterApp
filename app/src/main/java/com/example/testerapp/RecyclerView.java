package com.example.testerapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {
private RecyclerView mRecyclerView;
private RecyclerView.Adapter mAdapter;
private RecyclerView.LayoutManager mLayoutManager;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        ArrayList<RecyclerViewItem> recyclerViewItem = new ArrayList<>();

        recyclerViewItem.add(new RecyclerViewItem("Title", "CompanyName","Date from","Date to"))

    mRecyclerView = findViewById(R.id.recycler_list);
    mLayoutManager = new RecyclerView.LayoutManager(this);
    mAdapter = new RecyclerView.Adapter(recyclerViewItem);

    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setAdapter(mAdapter);
}
}