package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pregnant_women extends AppCompatActivity {
    private Button pbut1;
    private Button pbut2;
    private Button pbut3;
    private Button pbut4;
    private Button pbut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregnant_women);
        pbut1 = findViewById(R.id.pb1);
        pbut2 = findViewById(R.id.pb2);
        pbut3 = findViewById(R.id.pb3);
        pbut4 = findViewById(R.id.pb4);
        pbut5 = findViewById(R.id.pb5);

        pbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pregnant_women.this, pvegetables.class);
                startActivity(intent);
            }
        });
        pbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pregnant_women.this, pfruits.class);
                startActivity(intent);

            }
        });
        pbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pregnant_women.this, plegumes.class);
                startActivity(intent);

            }
        });
        pbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pregnant_women.this, pdairy.class);
                startActivity(intent);

            }
        });
        pbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(pregnant_women.this, pother.class);
                startActivity(intent);

            }
        });

    }
}