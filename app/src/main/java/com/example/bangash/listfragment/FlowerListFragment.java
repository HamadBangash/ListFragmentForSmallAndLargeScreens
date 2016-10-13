package com.example.bangash.listfragment;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FlowerListFragment extends ListFragment {
    List<Flower> flowers = new ArrayList<>();
    FlowerData flowerData = new FlowerData();
    private CallBacks activity;
    public FlowerListFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        flowers = flowerData.getFlowersData();
        FlowerArrayAdapter arrayAdapter = new FlowerArrayAdapter(getActivity(), R.layout.flower_list_items, flowers);
        setListAdapter(arrayAdapter);
        return inflater.inflate(R.layout.flower_list, container, false);
    }

    public interface CallBacks{
        public void onItemSelected(Flower flower);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Flower flower=flowers.get(position);
        activity.onItemSelected(flower);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        this.activity= (CallBacks) activity;
    }
}
