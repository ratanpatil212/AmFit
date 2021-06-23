package com.example.amfit;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workoutact3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutact3);
        Button b4=(Button)findViewById(R.id.b4);
        Button b5=(Button)findViewById(R.id.b5);
        Button b6=(Button)findViewById(R.id.b6);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmb();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmi();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openma();
            }
        });


    }
    public void  openmb(){
        Intent i4= new Intent(this, wmb.class);
        startActivity(i4);
    }
    public void  openmi() {
        Intent i5 = new Intent(this, wmi.class);
        startActivity(i5);
    }
    public void  openma(){
        Intent i6= new Intent(this, wma.class);
        startActivity(i6);
    }

}