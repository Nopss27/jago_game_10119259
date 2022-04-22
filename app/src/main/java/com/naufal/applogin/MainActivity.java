package com.naufal.applogin;

/**
 * Tgl pengerjaan : 22-04-2022
 * Nim : 10119259
 * Nama : Naufal Daffa Ilyasa
 * Kelas : IF-7
 * **/

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    private CardView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.profile_cardview);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}