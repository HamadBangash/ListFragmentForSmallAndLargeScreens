package com.example.bangash.listfragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Bangash on 10/13/2016.
 */
public class MyPreferenceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content,new MyPreferenceFragment()).commit();
    }
}
