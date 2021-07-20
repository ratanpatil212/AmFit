package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class depress extends AppCompatActivity {
    Button youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depress);
        youtube = findViewById(R.id.b6);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=5cGbc15CO1Q");
            }
        });
    }
        private void gotoUrl(String s){
            Uri uri= Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
        }

}
