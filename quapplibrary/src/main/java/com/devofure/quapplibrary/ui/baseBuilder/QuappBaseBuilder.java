package com.devofure.quapplibrary.ui.baseBuilder;

import com.devofure.quapplibrary.ui.ComponentManager;
import com.devofure.quapplibrary.ui.viewManager.recyclerView.BaseAdapter;

import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;

public interface QuappBaseBuilder<Q extends QuappBaseBuilder> {

    Q setupToolbar(@IdRes int toolbarId);
    <D,  A extends RecyclerView.Adapter & BaseAdapter<D>> QuappBuilder setupRecyclerView(A recyclerViewAdapter, int recyclerViewId);
    Q setupViewComponent(ComponentManager viewComponentManager);
}
