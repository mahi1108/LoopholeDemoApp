package com.cynovo.kivvi.demo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.cynovo.kivvi.demo.ui.MainActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        ImageView logo = (ImageView) findViewById(R.id.logo);
       logo.startAnimation(shake);


        Handler h = new Handler( );
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Animation shake = AnimationUtils.loadAnimation(SplashScreen.this,
                        R.anim.shake);
                ImageView logo = (ImageView) findViewById(R.id.logo);
                logo.startAnimation(shake);


                Handler h1 = new Handler( );
                h1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(SplashScreen.this,
                                MenuSelectionActivity.class);
                        startActivity(i);

                    }
                }, 2000);

            }
        },3000);
    }
}
