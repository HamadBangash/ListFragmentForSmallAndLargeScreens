package com.example.bangash.listfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bangash on 10/12/2016.
 */
public class FlowerArrayAdapter extends ArrayAdapter<Flower> {
    Context context;
    List<Flower> objects;

    public FlowerArrayAdapter(Context context, int resource, List<Flower> objects) {
        super(context, resource, objects);

        this.context = context;
        this.objects = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Flower flowers = objects.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.flower_list_items, null);
        ImageView ivFlower = (ImageView) view.findViewById(R.id.ivFlower);
        ivFlower.setImageResource(flowers.getImageResources());

        TextView tvFlowerName = (TextView) view.findViewById(R.id.tvFlowerName);
        tvFlowerName.setText(flowers.getFlowerName());
        return view;
    }
}
