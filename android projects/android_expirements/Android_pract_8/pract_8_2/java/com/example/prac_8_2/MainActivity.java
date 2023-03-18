package com.example.prac_8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
       AutoCompleteTextView t1;
       String [] List={"22509 - Mgmt","22616 - PWP","22617 - MAD","22618 -  ETI","22621 - DWM","22032 - EDE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> sub = new ArrayAdapter<String>(this , android.R.layout.simple_dropdown_item_1line,List);
        t1.setThreshold(1);
        t1.setAdapter(sub);
    }
}