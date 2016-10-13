package com.example.bangash.listfragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Bangash on 10/13/2016.
 */
public class MyPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.myprefrences);
    }
}
