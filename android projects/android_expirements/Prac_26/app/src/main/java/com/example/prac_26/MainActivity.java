package com.example.prac_26;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText input;
String user_name;
Button data;
Background background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.editTextTextPersonName);
        data = findViewById(R.id.button);
             background = new Background(this);
        data.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View view) {
                user_name=input.getText().toString();
                background.execute("add_info",user_name);
                Toast.makeText(MainActivity.this, "the name : "+ user_name + " is stored", Toast.LENGTH_SHORT).show();
            }
        });
    }
}