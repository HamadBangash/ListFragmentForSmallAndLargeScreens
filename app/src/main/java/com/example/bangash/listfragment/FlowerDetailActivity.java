package com.example.bangash.listfragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FlowerDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);
        FlowerDetailFragment detailFragment = new FlowerDetailFragment();
        Bundle b = getIntent().getBundleExtra("MyBundle");
        detailFragment.setArguments(b);
        getFragmentManager().beginTransaction().replace(R.id.detailContainer, detailFragment).commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();
        if (id == R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
