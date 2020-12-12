package com.myjre.movieticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class seatings extends AppCompatActivity {
    ListView listView;
    String[] img={"1","2","3","4","5","6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatings);
        listView=findViewById(R.id.list_item);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
               android.R.layout.simple_list_item_1, android.R.id.text1, img);
        listView.setAdapter(adapter);
    }
}