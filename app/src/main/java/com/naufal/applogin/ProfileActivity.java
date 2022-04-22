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
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView backProfile;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backProfile = findViewById(R.id.back_profile);
        logout = findViewById(R.id.logout_button);

        backProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Action
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}