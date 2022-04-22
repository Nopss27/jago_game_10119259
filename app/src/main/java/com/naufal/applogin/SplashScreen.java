package com.naufal.applogin;

/**
 * Tgl pengerjaan : 22-04-2022
 * Nim : 10119259
 * Nama : Naufal Daffa Ilyasa
 * Kelas : IF-7
 * **/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();

        Runnable intent = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        handler.postDelayed(intent, 3000);
    }
}