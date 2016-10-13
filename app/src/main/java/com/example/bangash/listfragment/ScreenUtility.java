package com.example.bangash.listfragment;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Bangash on 10/12/2016.
 */
public class ScreenUtility {

    private Activity activity;


    private float width;
    private float height;

    public ScreenUtility(Activity activity) {
        this.activity = activity;
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = activity.getResources().getDisplayMetrics().density;
        height = outMetrics.heightPixels / density;
        width = outMetrics.widthPixels / density;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
