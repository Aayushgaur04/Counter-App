package com.aayush.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_Text, counterText;
    Button btn, resetBtn;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        resetBtn = findViewById(R.id.resetButton);
        counterText = findViewById(R.id.counterText);
        welcome_Text = findViewById(R.id.welcometext);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("" +increaseCounter());
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText("" + resetCounter());
            }
        });

    }

    public int increaseCounter() {
        return ++counter;
    }

    public int resetCounter() {
        counter = 0;
        return counter;

    }
}