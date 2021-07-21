package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class medit extends AppCompatActivity {
    Button yt1,yt2,yt3,yt4,yt5,yt6,yt7,yt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medit);
        yt1 = findViewById(R.id.b6);
        yt2 = findViewById(R.id.b7);
        yt3 = findViewById(R.id.b8);
        yt4 = findViewById(R.id.b9);
        yt5 = findViewById(R.id.b10);
        yt6 = findViewById(R.id.b11);
        yt7 = findViewById(R.id.b12);
        yt8 = findViewById(R.id.b13);

        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/ZToicYcHIOU");
            }
        });
        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/v7grtHZAd-0");
            }
        });
        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/paX5Q2y75k4");
            }
        });
        yt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/SkyYu4zz-vQ");
            }
        });
        yt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/5w3G95awAlU");
            }
        });
        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/XyLqxCiXf8g");
            }
        });
        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/ihO02wUzgkc");
            }
        });
        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/GFs1yBadozo");
            }
        });
    }
    private void gotoUrl(String s){
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(medit.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
}