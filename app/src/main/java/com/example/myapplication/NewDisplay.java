package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class NewDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_display);

        Intent i = getIntent();
        String input_message = i.getStringExtra("extra_message");
        TextView textView = findViewById(R.id.textView2);
        textView.setTextSize(40);
        textView.setText(input_message);
    }
}