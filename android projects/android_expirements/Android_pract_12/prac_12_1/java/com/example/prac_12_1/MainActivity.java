package com.example.prac_12_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton Radio_button1,Radio_button2,Radio_button3,Radio_button4;
String s1;
Button Result;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Radio_button1=findViewById(R.id.radioButton);
        Radio_button2=findViewById(R.id.radioButton2);
        Radio_button3=findViewById(R.id.radioButton3);
        Radio_button4=findViewById(R.id.radioButton4);
        Result=findViewById(R.id.button);
        s1="the selected ones are as follows \n";
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Radio_button1.isChecked()){
                   s1 = s1+ "\n"+Radio_button1.getText().toString();
                }
                if(Radio_button2.isChecked()){
                    s1 = s1 + "\n" + Radio_button2.getText().toString();
                }
                if(Radio_button3.isChecked()){
                    s1 = s1 + "\n" + Radio_button3.getText().toString();
                }
                if(Radio_button4.isChecked()){
                    s1= s1 +"\n"+ Radio_button4.getText().toString();
                }
                Toast.makeText(MainActivity.this, s1, Toast.LENGTH_LONG).show();
            }
        });
    }
}