package com.example.numfn;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    Handler handler;
    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);

        ObjectAnimator fadeInText = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        fadeInText.setDuration(2000);
        ObjectAnimator fadeInText2 = ObjectAnimator.ofFloat(textView2, "alpha", 0f, 1f);
        fadeInText2.setDuration(2000);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(
                        getApplicationContext(),
                        MainActivity.class
                );
                startActivity(intent);
            }
        }, 3000);
        fadeInText.start();
        fadeInText2.start();
    }
}

