package com.devofure.quapplibrary.ui.viewManager.recyclerView;

import com.devofure.quapplibrary.ui.ComponentManager;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewComponentManager<D, A extends RecyclerView.Adapter & BaseAdapter<D>> implements ComponentManager {

    private RecyclerView viewComponent;
    private A recyclerViewAdapter;
    private LiveData<D> liveData;
    private LifecycleOwner lifecycleOwner;

    public RecyclerViewComponentManager(RecyclerView viewComponent, A recyclerViewAdapter, LiveData<D> liveData, LifecycleOwner lifecycleOwner){
        this.viewComponent = viewComponent;
        this.recyclerViewAdapter = recyclerViewAdapter;
        this.liveData = liveData;
        this.lifecycleOwner = lifecycleOwner;
    }

    @Override
    public void runConfiguration() {
        viewComponent.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void loadData() {
        liveData.observe(lifecycleOwner, data -> recyclerViewAdapter.updateData(data));
    }
}
