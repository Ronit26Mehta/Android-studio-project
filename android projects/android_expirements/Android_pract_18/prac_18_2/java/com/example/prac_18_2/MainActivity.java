package com.example.prac_18_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Dialer_phone;
    Intent phone;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dialer_phone=findViewById(R.id.button);
        Dialer_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phone = new Intent(Intent.ACTION_DIAL);
                startActivity(phone);
            }
        });
    }
}