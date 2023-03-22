package com.example.prac_16_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
   TimePicker t1,t2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2= findViewById(R.id.secclock);
        t2.setIs24HourView(true);
    }
}