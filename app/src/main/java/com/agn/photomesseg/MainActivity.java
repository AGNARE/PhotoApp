package com.agn.photomesseg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton register;
    private MaterialButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.mb_login);
        register = findViewById(R.id.registerButton);

    }

    @Override
    protected void onStart() {
        super.onStart();
        register.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,Register.class);
            startActivity(intent);

        });

        login.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity.this,Login.class);
            startActivity(intent2);
        });
    }

}