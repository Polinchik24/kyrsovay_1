package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ConditionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c1);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(ConditionsActivity.this,SecondActivity.class);
            startActivity(intent);
        });
    }
}