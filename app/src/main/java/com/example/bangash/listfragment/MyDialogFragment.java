package com.example.bangash.listfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Bangash on 10/13/2016.
 */
public class MyDialogFragment extends DialogFragment {

    public MyDialogFragment() {

    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle b=getArguments();
    ;

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle("Result ="+b.getBoolean("Message",false))
                .setMessage("This is Dialog")
                .setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getDialog().dismiss();
                    }
                });
        return builder.create();
    }
}
