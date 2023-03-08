package com.agn.photomesseg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Register extends AppCompatActivity {
    private MaterialButton buttonBack;
    private MaterialButton btn_next;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        buttonBack = findViewById(R.id.back_button_register);
        btn_next = findViewById(R.id.btn_register_next);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btn_next.setOnClickListener(v -> {
            Intent intent = new Intent(Register.this,RegisterNickName.class);
            startActivity(intent);
        });
        buttonBack.setOnClickListener(v -> {
            Intent intent2 = new Intent(Register.this,MainActivity.class);
            startActivity(intent2);

        });
    }
}