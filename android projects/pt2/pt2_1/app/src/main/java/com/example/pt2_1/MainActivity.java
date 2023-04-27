package com.example.pt2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1;
EditText t1,t2;
String s1,s2,s3;
TextView disp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.editTextTextPersonName2);
        t2 = findViewById(R.id.editTextTextPersonName3);
        disp = findViewById(R.id.text);
    }
    public void display(View view){
        s1 = t1.getText().toString();
        s2 = t2.getText().toString();
        s3 = s1 + s2;
        disp.setText(s3);
    }
}