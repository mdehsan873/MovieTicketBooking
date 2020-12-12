package com.myjre.movieticketbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class afterlogin extends AppCompatActivity {
    TextView user;
    FirebaseAuth mauth;
    Button book;
    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
        user=findViewById(R.id.user);
        mauth=FirebaseAuth.getInstance();
        email=FirebaseAuth.getInstance().getCurrentUser().getEmail();
        user.setText(email);
        book=findViewById(R.id.bookticket);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(afterlogin.this,Bookticket.class);
                startActivity(intent);
            }
        });
    }
}