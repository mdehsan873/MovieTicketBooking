package com.myjre.movieticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Bookticket extends AppCompatActivity {
    Button morning,noon,evening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookticket);
        morning=findViewById(R.id.morning);
        noon=findViewById(R.id.noon);
        evening=findViewById(R.id.evening);
        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bookticket.this,seatings.class);
                intent.putExtra("timing","7:00 AM");
                intent.putExtra("cinema","PVR-VENUS GORAKHPUR");
                startActivity(intent);
            }
        });
        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bookticket.this,seatings.class);
                intent.putExtra("timing","12:00 PM");
                intent.putExtra("cinema","PVR-VENUS GORAKHPUR");
                startActivity(intent);
            }
        });
        evening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bookticket.this,seatings.class);
                intent.putExtra("timing","6:00 PM");
                intent.putExtra("cinema","PVR-VENUS GORAKHPUR");
                startActivity(intent);
            }
        });
    }
}