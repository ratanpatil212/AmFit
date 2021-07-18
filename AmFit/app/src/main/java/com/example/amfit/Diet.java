package com.example.amfit;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Diet extends AppCompatActivity {
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        but1 = findViewById(R.id.b1);
        but2 = findViewById(R.id.b2);
        but3 = findViewById(R.id.b3);
        but4 = findViewById(R.id.b4);
        but5 = findViewById(R.id.b5);
        but6 = findViewById(R.id.b6);
        but7 = findViewById(R.id.b7);
        but8 = findViewById(R.id.b8);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, dloose_weight.class);
                startActivity(intent);

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, dgain_weight.class);
                startActivity(intent);

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, high_bp.class);
                startActivity(intent);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, low_bp.class);
                startActivity(intent);

            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, diabetics.class);
                startActivity(intent);

            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, pregnant_women.class);
                startActivity(intent);

            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, dloose_weight.class);
                startActivity(intent);

            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Diet.this, dloose_weight.class);
                startActivity(intent);

            }
        });
    }
}