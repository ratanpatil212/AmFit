package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class contents extends AppCompatActivity {

    Button logout,b1,b2,b3,b4,covid2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_contents);
        logout = findViewById(R.id.logoutBtn);

        logout.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(),Login.class));
            finish();
        });
        b1 = findViewById(R.id.amfit_specials);
        b1.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Specials.class)));


        b2 = findViewById(R.id.muscle_buildup);
        b2.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),workoutmain2.class)));

        b3 = findViewById(R.id.mental_health);
        b3.setOnClickListener(v -> {
                Intent i=new Intent(contents.this,MainActivity22.class);
                startActivity(i);
        });
        b4 = findViewById(R.id.diet);
        b4.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),Diet.class)));
        covid2 = findViewById(R.id.covid);
        covid2.setOnClickListener(v -> gotoURL());

    }

    private void gotoURL() {
        Uri uri = Uri.parse("https://www.mygov.in/covid-19/");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}