package com.example.amfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Wall_sit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_sit);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(Wall_sit.this,MainActivity.class);
        startActivity(categoryIntent);
        finish();

    }
}