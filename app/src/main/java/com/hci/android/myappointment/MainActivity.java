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
        /*
        TextView t=(TextView)findViewById(R.id.button);
        t.setVisibility(View.VISIBLE);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(getApplication(),logging.class);
                startActivity(i);
            }

        }); */
    }


    public void clicking(View v)
    {
        Intent i=new Intent(this,logging.class);
        startActivity(i);
    }

    public void clinic_click(View v)
    {
        Intent i=new Intent(this,logging.class);
        startActivity(i);
    }

}