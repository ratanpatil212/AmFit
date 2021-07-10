package com.example.amfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.util.regex.Pattern;

public class passforgot extends AppCompatActivity {

    private EditText emailedittext;
    private Button resetbutton;
    private ProgressBar progressBar;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passforgot);

        emailedittext=(EditText)findViewById(R.id.em);
        resetbutton=(Button)findViewById(R.id.reset);
        progressBar=(ProgressBar)findViewById(R.id.progressBar3);

        progressBar.setVisibility(View.INVISIBLE);

        auth=FirebaseAuth.getInstance();

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetPassword();

            }
        });
    }

    private  void resetPassword(){

        String email = emailedittext.getText().toString().trim();
        if (email.isEmpty()){
            emailedittext.setError("Email is required!");
            emailedittext.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailedittext.setError("Please provide valid Email!");
            emailedittext.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Check your Email to reset password",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }else {
                    Toast.makeText(getApplicationContext(),"Something went wrong! Try again",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}