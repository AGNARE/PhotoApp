package com.agn.photomesseg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.button.MaterialButton;

public class RegisterNickName extends AppCompatActivity {
    private MaterialButton btn_back_nick;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_nick_name);
        btn_back_nick = findViewById(R.id.back_button_NickName);

    }

    @Override
    protected void onStart() {
        super.onStart();
        btn_back_nick.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterNickName.this,Register.class);
            startActivity(intent);

        });
    }
}