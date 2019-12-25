package com.example.ad37_tranthihoan_day01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class dangky02 extends AppCompatActivity {
   TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky02);
        tv = findViewById(R.id.tv);
        Intent output = getIntent();
        String textOutput = output.getStringExtra("a");
        tv.setText(textOutput);
    }
}
