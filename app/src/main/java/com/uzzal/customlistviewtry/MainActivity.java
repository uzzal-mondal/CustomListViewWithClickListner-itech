package com.uzzal.customlistviewtry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] programmingName;
     int[] flagName = {R.drawable.kotlin_logo,R.drawable.javalogo,
            R.drawable.pythonlogo,R.drawable.fluterlogo,R.drawable.dartlogo,
            R.drawable.phplogo,R.drawable.javascriptlogo};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Programming List");

        programmingName = getResources().getStringArray(R.array.programming_name);


        listView  = findViewById(R.id.listView_id);

        //create to custom ListView.
        CustomAdapter adapter = new CustomAdapter(this,flagName,programmingName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = programmingName[position];
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("key",value);
                startActivity(intent);
                Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
