package com.example.prac_15_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Toast_shower;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast_shower=findViewById(R.id.button);
        Toast_shower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast t = Toast.makeText(getApplicationContext(),"Message for you : \n you have got mail!",Toast.LENGTH_LONG);
                t.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                t.show();

            }
        });

    }
}