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
//import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    Button msignUp,gotologin;
    EditText mFullname,mEmail,mPassword,mPhone;
    TextView mLogin,verifyMsg;
    FirebaseAuth fAuth,auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        msignUp = findViewById(R.id.signup);
        msignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
                finish();
            }
        });


//        verifyEmailbtn = findViewById(R.id.signup);

        mFullname = findViewById(R.id.Name);
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.Password);
        mPhone = findViewById(R.id.Phone);
        msignUp = findViewById(R.id.signup);
        gotologin = findViewById(R.id.Logintoapp);

        fAuth = FirebaseAuth.getInstance();

        gotologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

        msignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = mFullname.getText().toString().trim();
                String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();

                if(fullname.isEmpty()){
                    mFullname.setError("Full name is Required");
                    return;
                }
                if(email.isEmpty()){
                    mFullname.setError("Email is required");
                    return;
                }
                if(password.isEmpty()){
                    mFullname.setError("Strong password is required");
                    return;
                }
                if(password.length()<6){
                    mPassword.setError("Password should be more than 6 letters");
                }

                //getting this stuff on firebase
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Hurray!You are registered.Check your email for verification of your account", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(getApplicationContext(),contents.class));
                                finish();
                            }
                            else {
                                Toast.makeText(MainActivity.this, "Error! "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
//                }
            }
        });
//        if(!auth.getCurrentUser().isEmailVerified()){       // checking if the email is already verified or not
//
//        }
//        progressbar = findViewById(R.id.progressBar);


//        if(fAuth.getCurrentUser() != null){   // this code was getting me to the login page
//            startActivity(new Intent(getApplicationContext(),Login.class));
//            finish();
//        }
//        verifyEmailbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //send verification email
//                auth.getCurrentUser().sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
//                    @Override
//                    public void onSuccess(Void aVoid) {
//                        Toast.makeText(MainActivity.this, "Verification Email is Sent", Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        });



        };

//
//    public void openNewActivity() {
//        Intent i = new Intent(MainActivity.this, Login.class);
//        startActivity(i);
//    }
}