package com.example.amfit;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Step_up_onto_chair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_up_onto_chair);
        getSupportActionBar().hide();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(Step_up_onto_chair.this,MainActivity.class);
        startActivity(categoryIntent);
        finish();

    }
}