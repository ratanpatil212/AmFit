package com.example.amfit;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class loose_weight extends AppCompatActivity {
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dloose_weight);
        but1 = findViewById(R.id.db1);
        but2 = findViewById(R.id.db2);
        but3 = findViewById(R.id.db3);
        but4 = findViewById(R.id.db4);
        but5 = findViewById(R.id.db5);
        but6 = findViewById(R.id.db6);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, lvegetables.class);
                startActivity(intent);

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, lfruits.class);
                startActivity(intent);

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, llegumes.class);
                startActivity(intent);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, lnuts.class);
                startActivity(intent);

            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, loose_weight.class);
                startActivity(intent);

            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loose_weight.this, loose_weight.class);
                startActivity(intent);

            }
        });
    }
}





