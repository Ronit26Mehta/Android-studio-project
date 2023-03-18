package com.example.prac_8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
      String [] search_engine={"google","yaahoo","facebook","twitter","instagram","youtube","chat gpt","git hub"};

      AutoCompleteTextView search_mania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search_mania=findViewById(R.id.autoCompleteTextView);
        ArrayAdapter <String> list= new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, search_engine);
        search_mania.setThreshold(10);
        search_mania.setAdapter(list);
    }
}