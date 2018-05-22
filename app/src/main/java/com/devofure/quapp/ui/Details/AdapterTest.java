package com.devofure.quapp.ui.Details;

import android.view.ViewGroup;

import com.devofure.quapplibrary.ui.viewManager.recyclerView.BaseAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterTest<D> extends RecyclerView.Adapter implements BaseAdapter<D> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void updateData(D data) {

    }
}
