package com.devofure.quapplibrary.ui.baseBuilder;

import android.view.View;
import android.view.ViewGroup;

import com.devofure.quapplibrary.ui.ComponentManager;
import com.devofure.quapplibrary.ui.QuappSetupUtils;
import com.devofure.quapplibrary.ui.viewManager.recyclerView.BaseAdapter;
import com.devofure.quapplibrary.ui.viewManager.recyclerView.RecyclerViewComponentManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class QuappBuilder implements QuappBaseBuilder<QuappBuilder> {

    private AppCompatActivity activity;
    private View rootView;

    public QuappBuilder(ViewGroup rootView) {
        this.rootView = rootView;
    }

    @Override
    public QuappBuilder setupToolbar(int toolbarId) {
        QuappSetupUtils.setupToolbar(activity, rootView.findViewById(toolbarId));
        return this;
    }

    @Override
    public <D,  A extends RecyclerView.Adapter & BaseAdapter<D>> QuappBuilder setupRecyclerView(A recyclerViewAdapter, int recyclerViewId) {
        new RecyclerViewComponentManager<>(
                rootView.findViewById(recyclerViewId)
                , recyclerViewAdapter
                , null
                , null)
                .runConfiguration();
        return this;
    }

    @Override
    public QuappBuilder setupViewComponent(ComponentManager viewComponentManager) {
        viewComponentManager.runConfiguration();
        viewComponentManager.loadData();
        return this;
    }

    public View getRootView() {
        return rootView;
    }

    public QuappBuilder setActivity(AppCompatActivity activity) {
        this.activity = activity;
        return this;
    }
}
