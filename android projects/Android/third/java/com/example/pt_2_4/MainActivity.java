package com.example.pt_2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nav;
Button   navigator;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nav= findViewById(R.id.editTextTextPersonName);
        navigator = findViewById(R.id.button);
        navigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = nav.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
                startActivity(intent);
            }
        });
    }
}