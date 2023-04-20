package com.example.pt_2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Roll,name;
TextView Display;

Button display;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Roll = findViewById(R.id.editTextTextPersonName);
        name = findViewById(R.id.editTextTextPersonName2);
       Display = findViewById(R.id.textView);
       display = findViewById(R.id.button);
       display.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String s1 = Roll.getText().toString();
               String s2 = name.getText().toString();
               String total = "Roll :-" + s1 +"\n"+"Name :-"+ s2 +"\n";
               Display.setText(total);

           }
       });

    }
}