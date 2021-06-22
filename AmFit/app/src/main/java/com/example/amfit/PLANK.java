package com.example.amfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PLANK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(PLANK.this,MainActivity.class);
        startActivity(categoryIntent);
        finish();

    }
}