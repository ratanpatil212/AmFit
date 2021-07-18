package com.example.amfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class AmFit extends AppCompatActivity {
        private final Handler mWaitHandler = new Handler();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_am_fit);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            mWaitHandler.postDelayed(new Runnable() {

                @Override
                public void run() {

                    //The following code will execute after the 5 seconds.

                    try {

                        //Go to next page i.e, start the next activity.
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);

                        //Let's Finish Splash Activity since we don't want to show this when user press back button.
                        finish();
                    } catch (Exception ignored) {
                        ignored.printStackTrace();
                    }
                }
            }, 2000);  // Give a 5 seconds delay.
        }

        @Override
        public void onDestroy() {
            super.onDestroy();

            //Remove all the callbacks otherwise navigation will execute even after activity is killed or closed.
            mWaitHandler.removeCallbacksAndMessages(null);
        }
    }


