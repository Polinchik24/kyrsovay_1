package com.example.kyrsovay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VariablesActivity extends AppCompatActivity {
    private Object button3_var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button button = findViewById(button3var);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(VariablesActivity.this,Vtesting1.class);
            startActivity(intent);
        });
    }
}

