package com.example.jmush.android_session12_assignment_123;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    final Context context=this;
    Button btAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAlert= (Button) findViewById(R.id.button);

        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intialising AlertDialog Object
                AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
                // Setting Title And Icon
                alertDialog.setTitle("Confirm Delete...");
                alertDialog.setIcon(R.drawable.delete);
                // Setting message, Positive and Negative Button with onClick of each button
                alertDialog
                        .setMessage("Are you sure you want delete this?")
                        .setCancelable(false)
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                // Creating Alert Dialog
                AlertDialog alertDialog1 = alertDialog.create();

                // show it
                alertDialog.show();
            }
        });

    }
}
