package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button b=(Button)findViewById(R.id.button);
    }
    public void clicking(View v)
    {
        Intent i=new Intent(this,logging.class);
        startActivity(i);
    }
    public void clinic_clicking(View v)
    {
        Intent in=new Intent(this,clinic_list.class);
        startActivity(in);
    }
}
