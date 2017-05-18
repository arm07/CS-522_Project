package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ReminderOptions extends AppCompatActivity {

    String fn,g;
    int mi,hr,d,mo,yr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder_options);
        Intent i=getIntent();
        fn=i.getStringExtra("name");

        mi=i.getIntExtra("minutes",0);
        hr=i.getIntExtra("hour",1);
        d=i.getIntExtra("day",1);
        mo=i.getIntExtra("month",1);
        yr=i.getIntExtra("year",2017);
        if(i.getStringExtra("verify")=="n")
            g="n" ;
        else
            g="o";


        TextView na=(TextView)findViewById(R.id.textView52);
        na.setText(fn);

        TextView dateTv=(TextView)findViewById(R.id.d2);
        String date=String.valueOf(mo)+"/"+String.valueOf(d)+"/"+String.valueOf(yr);
        dateTv.setText(date);

        TextView timeTv=(TextView)findViewById(R.id.t2);
        String time=String.valueOf(hr)+":"+String.valueOf(mi);
        timeTv.setText(time);


    }

    public void confirmClick(View v){

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this,"Remainder is set..!!!", duration);
        toast.show();


        /*
        Intent i=new Intent(this,home1.class);
        i.putExtra("verify",g);
        i.putExtra("name",fn);
        startActivity(i);

        */
    }
}
