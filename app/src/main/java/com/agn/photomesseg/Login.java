package com.agn.photomesseg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {
    private MaterialButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnBack = findViewById(R.id.back_button_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        });
    }
}