package com.allenxuan.xuanyihuang.isrlproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by allenxuan on 27/12/2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder> {

    @Override
    public RVViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RVViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(RVViewHolder holder, int position) {
        holder.textView.setText("" + position);
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public static class RVViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;

        public RVViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
