package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CalendarView;

public class DateActivity extends AppCompatActivity {

    int y,m,d,k;
    //TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        //CalendarView ca = (CalendarView) findViewById(R.id.cal);
        //Date d=(Date)ca.getDate();

        CalendarView cv = (CalendarView)findViewById(R.id.cal);
        //tv = (TextView)findViewById(R.id.textView4);
        Intent in=getIntent();
        k=in.getIntExtra("check",-1);
        //final Date selectedDate=(Date)cv.getDate();
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                // TODO Auto-generated method stub

                y=year;
                m=month;
                d=dayOfMonth;
                //tv.setText("Date is : " + d +" / " +m + " / " + y);

                Intent i=new Intent(getApplication(),time_selector.class);
                i.putExtra("check",k);
                i.putExtra("day",d);
                i.putExtra("month",(m+1));
                i.putExtra("year",y);
                startActivity(i);

            }
        });
    }
    public void homeClick2(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void date_click(View v)
    {
        /*
        Intent i=new Intent(this,time_selector.class);
        i.putExtra("day",d);
        i.putExtra("month",(m+1));
        i.putExtra("year",y);
        startActivity(i);
        */
    }
}
