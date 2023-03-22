package com.example.prac_18_3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity{
    String result;
    TextView t1;
    Intent i;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        int extras= getIntent().getIntExtra("result",0);
        t1= findViewById(R.id.textView2);
        t1.setText("the result is" + extras);
         i = new Intent(Result.this,MainActivity.class);



    }
}
