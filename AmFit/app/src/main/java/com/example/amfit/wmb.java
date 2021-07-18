package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wmb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wmb);
        Button abs=(Button)findViewById(R.id.b10);
        Button shoulder=(Button)findViewById(R.id.b13);
        Button legs=(Button)findViewById(R.id.b14);
        Button arm=(Button)findViewById(R.id.b12);
        Button chest=(Button)findViewById(R.id.b11);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabs();

            }
        });
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshoulder();

            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlegs();

            }
        });
        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openarm();

            }
        });
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openchest();

            }
        });
    }
    public void openabs(){
        Intent i= new Intent(this,abs.class);
        startActivity(i);
    }
    public void openshoulder(){
        Intent i2= new Intent(this,shoulders.class);
        startActivity(i2);
    }
    public void openlegs(){
        Intent i3= new Intent(this,legs.class);
        startActivity(i3);
    }
    public void openarm(){
        Intent i4= new Intent(this,arm.class);
        startActivity(i4);
    }
    public void openchest(){
        Intent i5= new Intent(this,chest.class);
        startActivity(i5);
    }
}