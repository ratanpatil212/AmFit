package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wwb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wwb);
        Button abs=(Button)findViewById(R.id.b10);
        Button butt=(Button)findViewById(R.id.b13);
        Button thigh=(Button)findViewById(R.id.b11);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabs();

            }
        });
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opebutt();

            }
        });
        thigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthigh();


            }
        });
    }
    public void openabs(){
        Intent i=new Intent(this,abs.class);
        startActivity(i);
    }
    public void opebutt(){
        Intent i2=new Intent(this,butt.class);
        startActivity(i2);
    }
    public void openthigh(){
        Intent i3=new Intent(this,thigh.class);
        startActivity(i3);
    }
}