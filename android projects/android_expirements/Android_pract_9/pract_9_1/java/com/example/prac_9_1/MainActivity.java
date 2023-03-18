package com.example.prac_9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton t1;
    String s1;
    Button btn;
    TextView Result;
    boolean b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.toggleButton);
        Result = findViewById(R.id.textView);
        btn = findViewById(R.id.b);
       btn.setOnClickListener( new View.OnClickListener(){

           @Override
           public void onClick(View view) {
               StringBuffer result = new StringBuffer();
               result.append("the bluetooth is :").append( t1.getText());
               Result.setText(result);
           }
       });

        }

    }
