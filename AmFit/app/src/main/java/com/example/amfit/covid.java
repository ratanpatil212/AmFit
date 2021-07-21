package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class covid extends AppCompatActivity {
    Button yt6,yt7,yt8,yt9,yt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        yt6 = findViewById(R.id.b6);
        yt7 = findViewById(R.id.b7);
        yt8 = findViewById(R.id.b8);
        yt9 = findViewById(R.id.b9);
        yt10 = findViewById(R.id.b10);

        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/jD50qEQLax8");
            }
        });
        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/45w-kqpWVGk");
            }
        });
        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/xzNMABRELPg");
            }
        });
        yt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/BTx1vELv7zU");
            }
        });
        yt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/lN4Wr1s48cM");
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
        Intent categoryIntent = new Intent(covid.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
}