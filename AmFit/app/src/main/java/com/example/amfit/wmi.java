package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wmi);
        Button abs=(Button)findViewById(R.id.b10);
        Button arm=(Button)findViewById(R.id.b12);
        Button leg=(Button)findViewById(R.id.b14);
        Button shoulder=(Button)findViewById(R.id.b13);
        Button chest=(Button)findViewById(R.id.b11);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openabs();

            }
        });
        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openarm();

            }
        });
        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openleg();

            }
        });
        shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshoulder();

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
        Intent i=new Intent(this,abs.class);
        startActivity(i);
    }
    public  void openarm(){
        Intent i2=new Intent(this,arm.class);
        startActivity(i2);
    }
    public void openleg(){
        Intent i3=new Intent(this,legs.class);
        startActivity(i3);
    }
    public void openshoulder(){
        Intent i4=new Intent(this,shoulders.class);
        startActivity(i4);
    }
    public void openchest(){
        Intent i5=new Intent(this,chest.class);
        startActivity(i5);

    }
}