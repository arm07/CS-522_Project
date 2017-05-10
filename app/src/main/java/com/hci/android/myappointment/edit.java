package com.hci.android.myappointment;

/*
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.clinicName, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }


    public void cancel(View v)
    {
        Intent i=new Intent(this,view.class);
        startActivity(i);

    }

    public void change(View v)
    {

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this,"Appointment details are changed", duration);
        toast.show();

        Intent i=new Intent(this,new_appointment.class);
        startActivity(i);
    }
}

*/