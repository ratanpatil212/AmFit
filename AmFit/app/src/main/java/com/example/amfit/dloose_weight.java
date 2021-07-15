package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dloose_weight extends AppCompatActivity {
    private Button lbut1;
    private Button lbut2;
    private Button lbut3;
    private Button lbut4;
    private Button lbut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dloose_weight);
        lbut1 = findViewById(R.id.lb1);
        lbut2 = findViewById(R.id.lb2);
        lbut3 = findViewById(R.id.lb3);
        lbut4 = findViewById(R.id.lb4);
        lbut5 = findViewById(R.id.lb5);

        lbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dloose_weight.this, lvegetables.class);
                startActivity(intent);
            }
        });
        lbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dloose_weight.this, lfruits.class);
                startActivity(intent);

            }
        });
        lbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dloose_weight.this, llegumes.class);
                startActivity(intent);

            }
        });
        lbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dloose_weight.this, ldairy.class);
                startActivity(intent);

            }
        });
        lbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(dloose_weight.this, lother.class);
                startActivity(intent);

            }
        });

    }
}