package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diabetics extends AppCompatActivity {
    private Button dbut1;
    private Button dbut2;
    private Button dbut3;
    private Button dbut4;
    private Button dbut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetics);
        dbut1 = findViewById(R.id.db1);
        dbut2 = findViewById(R.id.db2);
        dbut3 = findViewById(R.id.db3);
        dbut4 = findViewById(R.id.db4);
        dbut5 = findViewById(R.id.db5);


        dbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diabetics.this, dbvegetables.class);
                startActivity(intent);

            }
        });
        dbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diabetics.this, dbfruits.class);
                startActivity(intent);

            }
        });
        dbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diabetics.this, dblegumes.class);
                startActivity(intent);

            }
        });
        dbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diabetics.this, dbdairy.class);
                startActivity(intent);

            }
        });
        dbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(diabetics.this, dbother.class);
                startActivity(intent);

            }
        });
    }
}