package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class depress extends AppCompatActivity {
    Button youtube1,yt2,yt3,yt4,yt5,yt6,yt7,yt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depress);
        youtube1 = findViewById(R.id.b6);
        yt2 = findViewById(R.id.b7);
        yt3 = findViewById(R.id.b8);
        yt4 = findViewById(R.id.b9);
        yt5 = findViewById(R.id.b10);
        yt6 = findViewById(R.id.b11);
        yt7 = findViewById(R.id.b12);
        yt8 = findViewById(R.id.b13);


        youtube1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(" https://youtu.be/SWCG0wCebNE");
            }
        });
        yt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(" https://youtu.be/QEiIJ-62NK4");
            }
        });
        yt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/qDykQJpxqZk");
            }
        });
        yt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(" https://youtu.be/92Oc8-lnx4k");
            }
        });
        yt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(" https://youtu.be/o8W8ixFjCMY");
            }
        });
        yt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(" https://youtu.be/RJ-qqpQxzSs");
            }
        });
        yt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Y9A5wuTtblw");
            }
        });
        yt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/duhuUiG5_m4");
            }
        });
    }
        private void gotoUrl(String s){
            Uri uri= Uri.parse(s);
            startActivity(new Intent(Intent.ACTION_VIEW,uri));
        }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent categoryIntent = new Intent(depress.this,MainActivity2.class);
        startActivity(categoryIntent);
        finish();

    }
    


}
