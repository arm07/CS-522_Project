package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class firstornew extends AppCompatActivity {

    int mi,hr,d,mo,yr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstornew);

        Intent in=getIntent();
        int month=in.getIntExtra("month",1);
        int day=in.getIntExtra("day",1);
        int year=in.getIntExtra("year",2017);
        int hour=in.getIntExtra("hour",1);
        int min=in.getIntExtra("minutes",0);
        mi=min;
        hr=hour;
        d=day;
        mo=month;
        yr=year;
    }

    public void click_first(View v)
    {
        /*
        Intent i=new Intent(this,signup.class);
        i.putExtra("verify","n");
        i.putExtra("minutes",mi);
        i.putExtra("hour",hr);
        i.putExtra("day",d);
        i.putExtra("month",mo);
        i.putExtra("year",yr);
        startActivity(i);

        */
    }

    public void click_already(View v)
    {

        Intent i=new Intent(this,logging.class);
        startActivity(i);
    }

    public void homeClick5(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
