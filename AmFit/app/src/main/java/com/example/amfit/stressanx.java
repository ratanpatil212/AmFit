package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stressanx extends AppCompatActivity {
    Button yt2,yt3,yt4,yt5,yt6,yt7,yt8,yt9,yt10,yt11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stressanx);
        yt2 = findViewById(R.id.b1);
        yt3 = findViewById(R.id.b7);
        yt4 = findViewById(R.id.b8);
        yt5 = findViewById(R.id.b9);
        yt6 = findViewById(R.id.b10);
        yt7 = findViewById(R.id.b11);
        yt8 = findViewById(R.id.b12);
        yt9 = findViewById(R.id.b13);
        yt10 = findViewById(R.id.b14);
        yt11 = findViewById(R.id.b15);


        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/odADwWzHR24");
            }
        });
        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/jV5mOJwUu-g");
            }
        });
        yt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/ViEcofSsq9w");
            }
        });
        yt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/e7NlWcNvtDw");
            }
        });
        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/vpO_3ZegQL4");
            }
        });
        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/DB_cSy0IIOg");
            }
        });
        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/vgkiVSlFCXs");
            }
        });
        yt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/cRpQOXV2cFg");
            }
        });
        yt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/hJbRpHZr_d0");
            }
        });
        yt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/bLpChrgS0AY");
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
        Intent categoryIntent = new Intent(stressanx.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
}