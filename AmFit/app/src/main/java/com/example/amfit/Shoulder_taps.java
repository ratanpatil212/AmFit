package com.example.amfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Shoulder_taps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_taps);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(Shoulder_taps.this,MainActivity.class);
        startActivity(categoryIntent);
        finish();

    }
}