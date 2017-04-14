package com.hci.android.myappointment;

/**
 * Created by rashmi on 4/14/2017.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class clinic_list extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] clinics = {"Ultrasound","Dermatology","OB-COC","Sp-MedEndo",
                "Geriatrics","Radiology"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listtext1, clinics);

        ListView lv = (ListView)findViewById(R.id.cll);
        lv.setAdapter(adapter);

        setContentView(R.layout.clinicslist);


    }
}