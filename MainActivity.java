package com.example.gallery_recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ArrayList<ExampleItem> examplelist = new ArrayList<>();
      examplelist.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
      examplelist.add(new ExampleItem(R.drawable.ic_audio,"Line 3","Line 4"));
      examplelist.add(new ExampleItem(R.drawable.ic_sun,"Line 5","Line 6"));


      mRecyclerView = (RecyclerView) findViewById(R.id.names_list);
      mRecyclerView.setHasFixedSize(true);
      mLayoutManager = new LinearLayoutManager(this);
      mAdapter = new ExampleAdapter(examplelist);

      mRecyclerView.setLayoutManager(mLayoutManager);
      mRecyclerView.setAdapter(mAdapter);
    }
}
