package com.devofure.quapp.ui.Details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devofure.quapp.R;
import com.devofure.quapplibrary.ui.ComponentManager;
import com.devofure.quapplibrary.ui.baseBuilder.QuappFragmentBuilder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class DetailsFragment extends Fragment {

    private DetailsViewModel mViewModel;

    public static DetailsFragment newInstance() {
        return new DetailsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return new QuappFragmentBuilder(R.layout.details_fragment, inflater, container)
                .setActivity((AppCompatActivity) getActivity())
                .setupToolbar(R.id.toolbar)
                .setupRecyclerView(new AdapterTest<Void>(), R.id.recyclerView)
                .setupViewComponent(getViewComponentManger())
                .getRootView();
    }

    private ComponentManager getViewComponentManger() {
        return new ComponentManager() {
            @Override
            public void runConfiguration() {

            }

            @Override
            public void loadData() {

            }
        };
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DetailsViewModel.class);
        // TODO: Use the ViewModel
    }
}
