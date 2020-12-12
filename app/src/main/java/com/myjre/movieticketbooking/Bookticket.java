package com.myjre.movieticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Bookticket extends AppCompatActivity {
    Button morning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookticket);
        morning=findViewById(R.id.morning);
        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bookticket.this,seatings.class);
                startActivity(intent);
            }
        });
    }
}