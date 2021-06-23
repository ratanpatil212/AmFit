package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Specials extends AppCompatActivity {

    Button b1,b2,b3,b4,b6,b7,b9,b10,b11,b12,b13,b14,b15,b16,b17,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specials);

        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(Specials.this,Jumping_jacks.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(Specials.this,High_knees.class);
                startActivity(categoryIntent2);
                finish();
            }
        });

        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent8 = new Intent(Specials.this,Lunges.class);
                startActivity(categoryIntent8);
                finish();
            }
        });

        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent3 = new Intent(Specials.this,PLANK.class);
                startActivity(categoryIntent3);
                finish();
            }
        });

        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent4 = new Intent(Specials.this,Skipping_ropes.class);
                startActivity(categoryIntent4);
                finish();
            }
        });

        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent6 = new Intent(Specials.this,Push_ups.class);
                startActivity(categoryIntent6);
                finish();
            }
        });

        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent7 = new Intent(Specials.this,Walking_and_Running.class);
                startActivity(categoryIntent7);
                finish();
            }
        });

        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent9 = new Intent(Specials.this,Wall_sit.class);
                startActivity(categoryIntent9);
                finish();
            }
        });

        b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent10 = new Intent(Specials.this,Crunches.class);
                startActivity(categoryIntent10);
                finish();
            }
        });

        b11=(Button)findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent11 = new Intent(Specials.this,Squats.class);
                startActivity(categoryIntent11);
                finish();
            }
        });

        b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent12 = new Intent(Specials.this,Mountain_climber.class);
                startActivity(categoryIntent12);
                finish();
            }
        });

        b13=(Button)findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent13 = new Intent(Specials.this,Cobra_stretch.class);
                startActivity(categoryIntent13);
                finish();
            }
        });

        b14=(Button)findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent14 = new Intent(Specials.this,Glute_bridge.class);
                startActivity(categoryIntent14);
                finish();
            }
        });

        b15=(Button)findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent15 = new Intent(Specials.this,Leg_raises.class);
                startActivity(categoryIntent15);
                finish();
            }
        });

        b16=(Button)findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent16 = new Intent(Specials.this,Step_up_onto_chair.class);
                startActivity(categoryIntent16);
                finish();
            }
        });

        b17=(Button)findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent17 = new Intent(Specials.this,Shoulder_taps.class);
                startActivity(categoryIntent17);
                finish();
            }
        });
    }
}