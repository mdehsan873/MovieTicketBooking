package com.myjre.movieticketbooking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    EditText email,pass;
    Button login;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        firebaseAuth=FirebaseAuth.getInstance();
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.logins);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               firebaseAuth.signInWithEmailAndPassword(email.getText().toString(),pass.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(login.this,"Login Sucessfull",Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(login.this,afterlogin.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(login.this,"check your details",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}