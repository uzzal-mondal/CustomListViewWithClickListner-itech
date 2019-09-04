package com.uzzal.customlistviewtry;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter
{
    private LayoutInflater inflater;


    private Context context;
    private int[] falgs;
    private String[] programmingName;

    public CustomAdapter(Context context, int[] falgs, String[] programmingName) {
        this.context = context;
        this.falgs = falgs;
        this.programmingName = programmingName;
    }

    @Override
    public int getCount() {
        return programmingName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView =  inflater.inflate(R.layout.sample_view,parent,false);
        }

       ImageView imageView =  convertView.findViewById(R.id.imageView);
       TextView tv =  convertView.findViewById(R.id.textView);
      // TextView tv2 =  convertView.findViewById(R.id.textView2);

        imageView.setImageResource(falgs[position]);
        tv.setText(programmingName[position]);


        return convertView;



    }


}
