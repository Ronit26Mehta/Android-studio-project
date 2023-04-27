package com.example.pt2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
String [] ar = {"mad","pwp","php","dwm","eti","mgt","ede"};
AutoCompleteTextView at;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        at = findViewById(R.id.auto);
        ArrayAdapter<String> ar1 = new ArrayAdapter<String>( this, android.R.layout.select_dialog_item,  ar);

        at.setAdapter(ar1);
        at.setThreshold(1);
    }
}