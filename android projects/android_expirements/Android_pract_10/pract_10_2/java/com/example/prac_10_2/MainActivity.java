package com.example.prac_10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Username,Password,Enroll_number;
    Button Submit;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.editTextTextPersonName);
        Enroll_number=findViewById(R.id.editTextTextPersonName2);
        Password = findViewById(R.id.editTextTextPassword);
        Submit= findViewById(R.id.button);
        Result= findViewById(R.id.textView4);
        Submit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals("Ronit") && Enroll_number.getText().toString().equals("2005220336") && Password.getText().toString().equals("123")){
                    Result.setText("student name" + Username.getText().toString()+"\n"+"Enroll_number:"+Enroll_number.getText().toString()+"\n"+"your marks are 91.67%");
                    Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "login unsuccessful", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}