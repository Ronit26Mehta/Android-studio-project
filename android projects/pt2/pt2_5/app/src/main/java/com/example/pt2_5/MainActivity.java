package com.example.pt2_5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
ProgressBar prog;
Button disp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prog = findViewById(R.id.prog);
        disp = findViewById(R.id.btn);
    }
    public void disp(View view){
        prog.setVisibility(view.VISIBLE);
    }
}