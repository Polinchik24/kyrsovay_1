package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Vtesting1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Vtesting1.this,Vtesting1.class);
            startActivity(intent);
        });
    }
}