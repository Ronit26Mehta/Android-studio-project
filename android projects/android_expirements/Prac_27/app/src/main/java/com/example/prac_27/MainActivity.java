package com.example.prac_27;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText user_text,pass_text;
 Button login;
 TextView status;
 String status1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_text = findViewById(R.id.editTextTextPersonName);
        pass_text = findViewById(R.id.editTextTextPersonName2);
        login=findViewById(R.id.button);
        status=findViewById(R.id.textView2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user_text.getText().toString().equals("Ronit") && pass_text.getText().toString().equals("72")){
                    Toast.makeText(MainActivity.this, "log in successful", Toast.LENGTH_SHORT).show();
                    status1="Status:log in successful";
                    status.setText(status1);
                }
                else {

                    Toast.makeText(MainActivity.this, "log in unsuccessful", Toast.LENGTH_SHORT).show();
                    status1="Status: log in unsuccessful";
                    status.setText(status1);
                }
            }
        });

    }
}