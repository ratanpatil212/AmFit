package com.example.amfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Push_ups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_ups);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(Push_ups.this,MainActivity.class);
        startActivity(categoryIntent);
        finish();

    }
}