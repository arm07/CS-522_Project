package com.hci.android.myappointment;

import android.annotation.TargetApi;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Date;



public class summary extends AppCompatActivity {
    int mi,hr,d,mo,yr,k;
    long diff;

    @TargetApi(Build.VERSION_CODES.N)
    //@RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent in=getIntent();
        int month=in.getIntExtra("month",1);
        int day=in.getIntExtra("day",1);
        int year=in.getIntExtra("year",2017);
        int hour=in.getIntExtra("hour",1);
        int min=in.getIntExtra("minutes",0);
        k= in.getIntExtra("check",-1);
        mi=min;
        hr=hour;
        d=day;
        mo=month;
        yr=year;
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy,HH:mm");
        Date curDate = new Date();
        long curMillis = curDate.getTime();
        try {

            String newtime = String.valueOf(day) + "." + String.valueOf(month) + "." + String.valueOf(year) + "," + String.valueOf(hour) + ":" + String.valueOf(min);
            Date newdate = formatter.parse(newtime);
            long newmilli=newdate.getTime();
            diff=newmilli-curMillis;
        }
        catch(Exception e)
        {
        }

        TextView tvd=(TextView)findViewById(R.id.textView7);
        TextView tvt=(TextView)findViewById(R.id.textView9);
        String date=String.valueOf(month)+"/"+String.valueOf(day)+"/"+String.valueOf(year);
        tvd.setText(date);
        String time=String.valueOf(hour)+":"+String.valueOf(min);
        //String time=String.valueOf(diff);
        tvt.setText(time);

    }

    public void summ_ok_click(View v)
    {
        Intent i;

        //TextView tv=(TextView)findViewById(R.id.textView8);
        //tv.setText(String.valueOf(diff));
        String s=String.valueOf(k);

        /*
        Intent alertintent=new Intent(this,alert_receiver.class);
        AlarmManager am=(AlarmManager)getSystemService(Context.ALARM_SERVICE);

        am.setExact(AlarmManager.RTC_WAKEUP,diff, PendingIntent.getBroadcast(this,1,alertintent,PendingIntent.FLAG_UPDATE_CURRENT));

        */

        /*int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this,s,duration);
        toast.show();*/

        if(k==2)
        {

            i=new Intent(this,ReminderOptions.class);
            i.putExtra("check",k);
            i.putExtra("minutes",mi);
            i.putExtra("hour",hr);
            i.putExtra("day",d);
            i.putExtra("month",mo);
            i.putExtra("year",yr);
            i.putExtra("diff",diff);
        }

        else
        {
            i=new Intent(this,firstornew.class);
            i.putExtra("minutes",mi);
            i.putExtra("hour",hr);
            i.putExtra("day",d);
            i.putExtra("month",mo);
            i.putExtra("year",yr);
            i.putExtra("diff",diff);
        }


        startActivity(i);

    }
    public void summ_cancel_click(View v)
    {


        Intent i=new Intent(this,cliniclist.class);
        startActivity(i);
    }
    public void homeClick4(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
