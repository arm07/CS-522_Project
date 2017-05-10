package com.hci.android.myappointment;

/**
 * Created by rashmi on 5/9/2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



public class ListAdapter extends ArrayAdapter<String> {

    private Activity context;
    private String[] name;

    public ListAdapter(Activity context,String[] name){
        super(context,R.layout.activity_main,name);
        this.context=context;
        this.name = name;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_cliniclist, null, false);
        TextView viewName = (TextView) rowView.findViewById(R.id.cname);
        viewName.setText(name[position]);
        return rowView;
    }
}
