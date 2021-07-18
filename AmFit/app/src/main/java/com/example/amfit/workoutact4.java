package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workoutact4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutact4);
        Button b7=(Button)findViewById(R.id.b7);
        Button b8=(Button)findViewById(R.id.b8);
        Button b9=(Button)findViewById(R.id.b9);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwb();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwi();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwa();
            }
        });

    }
    public void  openwb(){
        Intent i7= new Intent(this, wwb.class);
        startActivity(i7);
    }
    public void  openwi() {
        Intent i8 = new Intent(this, wwi.class);
        startActivity(i8);
    }
    public void  openwa(){
        Intent i9= new Intent(this, wwa.class);
        startActivity(i9);
    }

}