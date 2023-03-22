package com.example.prac_14_2;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  ImageView image_code;
  Button Change_View;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_code=findViewById(R.id.imageView);
        Change_View=findViewById(R.id.button);
        Change_View.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                image_code.setImageResource(R.drawable.linux);
                Toast.makeText(MainActivity.this, "Image Changed", Toast.LENGTH_LONG).show();
            }
        });

    }
}