package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

public class cliniclist extends AppCompatActivity {

    String[] clinicName;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        //this.findViewById(android.R.id.content).setBackgroundColor(Color.GRAY);
        clinicName = getResources().getStringArray(R.array.clinicName);
        ListAdapter listAdapter = new ListAdapter(this, clinicName);
        Intent in=getIntent();
        i=in.getIntExtra("check",-1);


        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(listAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                /*
                Intent intent = new Intent(getApplication(),searchBy.class);
                intent.putExtra("check",i);
                startActivity(intent); */
            }
        });
        //
    }


}
