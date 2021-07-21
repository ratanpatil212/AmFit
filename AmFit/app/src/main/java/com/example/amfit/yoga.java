package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoga extends AppCompatActivity {
    Button yt6,yt7,yt8,yt9,yt10,yt11,yt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);
        yt6 = findViewById(R.id.b6);
        yt7 = findViewById(R.id.b7);
        yt8 = findViewById(R.id.b8);
        yt9 = findViewById(R.id.b9);
        yt10 = findViewById(R.id.b10);
        yt11 = findViewById(R.id.b11);
        yt12 = findViewById(R.id.b12);

        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/NDp_jRfVA5k");
            }
        });
        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yijuZA_rUiA");
            }
        });
        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/6tH5RIG0foU");
            }
        });
        yt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/EEcLR7NuPLs");
            }
        });
        yt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/s2NQhpFGIOg");
            }
        });
        yt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/dAqQqmaI9vY");
            }
        });
        yt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/MrR04m1zoJ8");
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
        Intent categoryIntent = new Intent(yoga.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
}