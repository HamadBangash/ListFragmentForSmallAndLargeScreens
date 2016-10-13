package com.example.bangash.listfragment;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FlowerListFragment.CallBacks {
    boolean isLargeLayout = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (findViewById(R.id.detailContainer) != null) {
            isLargeLayout = true;
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.setting) {
            ScreenUtility utility = new ScreenUtility(this);
            String output = "Width : " + utility.getWidth() + " Height : " + utility.getHeight();
            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
            alertBuilder.setMessage(output);
            alertBuilder.setTitle("Screen Sizes").create().show();
        }
        else if (id==R.id.prefe)
        {
            Intent i=new Intent();
            i.setClass(this,MyPreferenceActivity.class);
            startActivityForResult(i,1002);
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemSelected(Flower flower) {
        Bundle b = flower.toBundle();
        if (isLargeLayout) {

            FlowerDetailFragment detailFragment = new FlowerDetailFragment();
            detailFragment.setArguments(b);
            getFragmentManager().beginTransaction().replace(R.id.detailContainer, detailFragment).commit();

        } else {

            Intent intent = new Intent(MainActivity.this, FlowerDetailActivity.class);
            intent.putExtra("MyBundle", b);
            startActivityForResult(intent, 0);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1002)
        {
            SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
            boolean value=preferences.getBoolean("pref1", false);
            MyDialogFragment dialog=new MyDialogFragment();
            Bundle b=new Bundle();
            b.putBoolean("Message", value);
            dialog.setArguments(b);
            dialog.show(getFragmentManager(),"MyDialog");
        }
    }
}
