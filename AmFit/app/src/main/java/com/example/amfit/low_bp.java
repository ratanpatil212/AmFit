package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class low_bp extends AppCompatActivity {
    private Button lbpbut1;
    private Button lbpbut2;
    private Button lbpbut3;
    private Button lbpbut4;
    private Button lbpbut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_bp);
        lbpbut1 = findViewById(R.id.lb1);
        lbpbut2 = findViewById(R.id.lb2);
        lbpbut3 = findViewById(R.id.lb3);
        lbpbut4 = findViewById(R.id.lb4);
        lbpbut5 = findViewById(R.id.lb5);


        lbpbut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(low_bp.this, lbp_vegetables.class);
                startActivity(intent);

            }
        });
        lbpbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(low_bp.this, lbp_fruits.class);
                startActivity(intent);

            }
        });
        lbpbut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(low_bp.this, lbp_legumes.class);
                startActivity(intent);

            }
        });
        lbpbut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(low_bp.this, lbp_dairy.class);
                startActivity(intent);

            }
        });
        lbpbut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(low_bp.this, lbp_other.class);
                startActivity(intent);

            }
        });
    }
}