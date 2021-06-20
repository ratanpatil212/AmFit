package com.example.amfit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class Login extends AppCompatActivity {
    Button gotosignup,login;
    EditText email,password;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        gotosignup = (Button) findViewById(R.id.signupltr);
        gotosignup.setOnClickListener(new View.OnClickListener() { // new user signup button takes you to the register page
            @Override
            public void onClick(View v) {{
                openingPage();
            }
        }

            private void openingPage() {
                Intent i = new  Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
            });
        email = findViewById(R.id.Email);
        password = findViewById(R.id.Password);
        login = findViewById(R.id.Logintoapp);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //extract and validate

                if(email.getText().toString().isEmpty()){
                    email.setError("Email is missing");
                    return;
                }
                if (password.getText().toString().isEmpty()){
                    password.setError("Password cannot be empty");
                }
                //when these two if's are completed the data is validated
                //login
                firebaseAuth.signInWithEmailAndPassword(email.getText().toString().trim(),password.getText().toString().trim()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        if( Objects.requireNonNull(firebaseAuth.getCurrentUser()).isEmailVerified()){ // this code lands user on content only if user is verified
                                startActivity(new Intent(getApplicationContext(),contents.class));
                                finish();
                            }
                        else {
                            Toast.makeText(Login.this, "Please verify email", Toast.LENGTH_SHORT).show();
                        }
                        }
                        //login is successful
                });

            }
        });

    }

    @Override
    protected void onStart() {  // if user is already regisered/logged in then the app will not show the login or register page it will take to main app
        super.onStart();
        if (FirebaseAuth.getInstance().getCurrentUser()!=null){
            startActivity(new Intent(getApplicationContext(),contents.class));
        }
    }
}