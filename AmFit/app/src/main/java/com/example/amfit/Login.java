package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.signupltr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {{
                openingPage();
            }
        }

            private void openingPage() {
                Intent i = new  Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
            });
    }
}