package com.example.bangash.listfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlowerDetailFragment extends android.app.Fragment {

    Flower flower;

    public FlowerDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b=getArguments();
        if(b!=null&&b.containsKey(Flower.Flower_Name))
        {
            flower=new Flower(b);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_flower_detail,container,false);

        if (flower != null) {
            TextView tvFlowerName = (TextView) view.findViewById(R.id.tvFlowerName);
            tvFlowerName.setText(flower.getFlowerName());
            TextView tvPrice = (TextView) view.findViewById(R.id.tvPrice);
            tvPrice.setText(flower.getPrice() + "");
            TextView tvInstruction = (TextView) view.findViewById(R.id.tvInstruction);
            tvInstruction.setText(flower.getInstructions());
            ImageView ivFlower = (ImageView) view.findViewById(R.id.ivFlower);
            ivFlower.setImageResource(flower.getImageResources());


        }
        return view;
    }

}
