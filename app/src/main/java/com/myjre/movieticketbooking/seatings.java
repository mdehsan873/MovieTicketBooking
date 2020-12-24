package com.myjre.movieticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class seatings extends AppCompatActivity {
    String[] seat={"1","2","3","4","5","6"};
    String cinema;
    String timing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seatings);
        Intent intent=getIntent();
        cinema=intent.getStringExtra("cinema");
        timing=intent.getStringExtra("timing");
     Toast.makeText(this,
             timing,Toast.LENGTH_SHORT).show();
    }
}