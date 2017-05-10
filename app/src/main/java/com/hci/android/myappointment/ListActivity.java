package com.hci.android.myappointment;

import android.app.Activity;
import android.os.Bundle;

import android.widget.ListView;

/**
 * Created by rashmi on 5/9/2017.
 */

public class ListActivity  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        ListView lv = (ListView)findViewById(R.id.list);
        Bundle extras = getIntent().getExtras();
        int position = extras.getInt("position");
        int nameId=0;
        nameId=R.array.clinicName;
        String[] name = getResources().getStringArray(nameId);
        ListAdapter adapter = new ListAdapter(this,name);
        lv.setAdapter(adapter);
    }
}
