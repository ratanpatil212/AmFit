package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class high_bp extends AppCompatActivity {
    private Button hbpbut1;
    private Button hbpbut2;
    private Button hbpbut3;
    private Button hbpbut4;
    private Button hbpbut5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_bp);
        hbpbut1 = findViewById(R.id.hb1);
        hbpbut2 = findViewById(R.id.hb2);
        hbpbut3 = findViewById(R.id.hb3);
        hbpbut4 = findViewById(R.id.hb4);
        hbpbut5 = findViewById(R.id.hb5);


        hbpbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(high_bp.this, hbp_vegetables.class);
                startActivity(intent);

            }
        });
        hbpbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(high_bp.this, hbp_fruits.class);
                startActivity(intent);

            }
        });
        hbpbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(high_bp.this, hbp_legumes.class);
                startActivity(intent);

            }
        });
        hbpbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(high_bp.this, hbp_dairy.class);
                startActivity(intent);

            }
        });
        hbpbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(high_bp.this, hbp_other.class);
                startActivity(intent);

            }
        });
    }
}