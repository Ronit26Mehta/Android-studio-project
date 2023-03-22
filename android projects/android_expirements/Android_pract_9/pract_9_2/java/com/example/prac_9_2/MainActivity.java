package com.example.prac_9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button b1 , b2 , b3 ,b4;
TextView t1,t2;
EditText num1,num2;
int n1 ,n2;
String s1 ,s2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        t1 = findViewById(R.id.textView);
        num1= findViewById(R.id.editTextTextPersonName);
        num2 = findViewById(R.id.editTextTextPersonName2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=num1.getText().toString();
                s2=num2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                int sum= n1 + n2;
                t1.setText("the result is :"+ sum );

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=num1.getText().toString();
                s2=num2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                int sum= n1 - n2;
                t1.setText("the result is :"+ sum );

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=num1.getText().toString();
                s2=num2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                int sum= n1 * n2;
                t1.setText("the result is :"+ sum );

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=num1.getText().toString();
                s2=num2.getText().toString();
                n1=Integer.parseInt(s1);
                n2=Integer.parseInt(s2);
                int sum= n1 / n2;
                t1.setText("the result is :"+ sum );

            }
        });
    }
}