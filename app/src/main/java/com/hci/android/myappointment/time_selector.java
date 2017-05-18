package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

//import android.content.ContextWrapper;

public class time_selector extends AppCompatActivity {
    int h,mi;
    int m,d,y,k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_selector);
        Intent in;
        in = getIntent();
        k=in.getIntExtra("check",-1);
        d=in.getIntExtra("day",1);
        m=in.getIntExtra("month",1);
        y=in.getIntExtra("year",2017);

        TextView tv=(TextView)findViewById(R.id.textView11);
        tv.setText(" "+String.valueOf(m)+"/"+String.valueOf(d)+"/"+String.valueOf(y));

        TimePicker tp=(TimePicker)findViewById(R.id.timePicker);


        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {

            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                //updateDisplay(hourOfDay, minute);
                h=hourOfDay;
                mi=minute;


                Intent i=new Intent(getApplication(),summary.class);
                i.putExtra("hour",h);
                i.putExtra("minutes",mi);
                i.putExtra("day",d);
                i.putExtra("month",m);
                i.putExtra("year",y);
                startActivity(i);

            }
        });

    }

    /*
    public void click_time(View v)
    {
        Intent i=new Intent(this,summary.class);
        i.putExtra("check",k);
        i.putExtra("hour",h);
        i.putExtra("minutes",mi);
        i.putExtra("day",d);
        i.putExtra("month",m);
        i.putExtra("year",y);
        startActivity(i);
    }
    */
    public void homeClick3(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
