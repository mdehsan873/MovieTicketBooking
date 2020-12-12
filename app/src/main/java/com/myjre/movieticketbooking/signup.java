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

public class signup extends AppCompatActivity {

    Button singup;
    EditText email,pasw;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        singup=findViewById(R.id.singups);
        email=findViewById(R.id.emailid);
        pasw=findViewById(R.id.passwords);
        mAuth=FirebaseAuth.getInstance();
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().contains("@")&&pasw.getText().toString().length()>5) {
                    mAuth.createUserWithEmailAndPassword(email.getText().toString(), pasw.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(signup.this, "User Created Please Login", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(signup.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            } else {
                                Toast.makeText(signup.this, "User exited  Please try Login", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
                else
                {
                    Toast.makeText(signup.this,"Please Check Email and make sure password is greater than 5 digits",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}