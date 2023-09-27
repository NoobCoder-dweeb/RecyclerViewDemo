package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<Abbrevation> abbrevationArrayList;

    public RecyclerViewAdapter(Context context, ArrayList<Abbrevation> abbrevationArrayList) {
        this.context = context;
        this.abbrevationArrayList = abbrevationArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text_name.setText(abbrevationArrayList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return abbrevationArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            text_name = itemView.findViewById(R.id.text_name);
        }
    }
}
