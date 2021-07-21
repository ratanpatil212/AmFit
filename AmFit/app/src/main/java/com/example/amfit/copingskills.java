package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class copingskills extends AppCompatActivity {
    Button yt1,yt2,yt3,yt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copingskills);
        yt2 = findViewById(R.id.b7);
        yt3 = findViewById(R.id.b8);
        yt4 = findViewById(R.id.b9);
        yt1 = findViewById(R.id.b6);

        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9ww1Wi2e7NQ");
            }
        });
        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/0NzWGtYHbWs");
            }
        });
        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/NHUInh9wfXA");
            }
        });
        yt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://positivepsychology.com/wp-content/uploads/3-Resilience-Exercises-Pack.pdf");
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
        Intent categoryIntent = new Intent(copingskills.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
}