package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dgain_weight extends AppCompatActivity {
        private Button gbut1;
        private Button gbut2;
        private Button gbut3;
        private Button gbut4;
        private Button gbut5;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dgain_weight);
            gbut1 = findViewById(R.id.gb1);
            gbut2 = findViewById(R.id.gb2);
            gbut3 = findViewById(R.id.gb3);
            gbut4 = findViewById(R.id.gb4);
            gbut5 = findViewById(R.id.gb5);


            gbut1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(dgain_weight.this, dvegetables.class);
                    startActivity(intent);

                }
            });
            gbut2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(dgain_weight.this, dfruits.class);
                    startActivity(intent);

                }
            });
            gbut3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(dgain_weight.this, dlegumes.class);
                    startActivity(intent);

                }
            });
            gbut4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(dgain_weight.this, ddairy.class);
                    startActivity(intent);

                }
            });
            gbut5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(dgain_weight.this, dother.class);
                    startActivity(intent);

                }
            });
        }
    }
