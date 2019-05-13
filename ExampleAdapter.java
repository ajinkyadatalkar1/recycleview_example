package com.example.gallery_recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> { // create this class.
    private ArrayList<ExampleItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{ // this is a nested  class.
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(@NonNull View itemView) {
            //create constructor for the ExampleViewHolder class. A ViewHolder describes an item view and metadata about its place within the RecyclerView.
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.line1);
            mTextView2 = itemView.findViewById(R.id.line2);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList){ // Constructor for the ExampleAdapter class
        mExampleList = exampleList;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {  //A viewholder contains metadata such as location of elements in the recycler view
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards,viewGroup, false); // Here viewgroup contains all children views of the cards layout.
        ExampleViewHolder evh = new ExampleViewHolder(v); // called constructor for ExampleViewHolder class and assigned a view to it so that items can be placed in the view.
        return evh; // returned the viewholder
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {
        ExampleItem currentItem = mExampleList.get(i);
        exampleViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        exampleViewHolder.mTextView1.setText(currentItem.getLine1());
        exampleViewHolder.mTextView2.setText(currentItem.getLine2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
