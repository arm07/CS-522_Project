package com.hci.android.myappointment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SearchBy extends AppCompatActivity {

    int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by);
        Intent in=getIntent();
        k=in.getIntExtra("check",-1);

        /*
        Button physician = (Button) findViewById(R.id.physician);


        physician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),Physicians.class);
                startActivity(intent);

            }
        });

*/
        Button date= (Button) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),DateActivity.class);
                intent.putExtra("check",k);
                startActivity(intent);
            }
        });

    }

    public void homeClick(View view){
        Intent i = new Intent(this,MainActivity.class);

        startActivity(i);
    }
}
