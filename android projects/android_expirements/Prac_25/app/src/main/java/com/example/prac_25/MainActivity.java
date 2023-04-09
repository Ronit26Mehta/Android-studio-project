package com.example.prac_25;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button clock,anti_clock,zoom_in,zoom_out,fade_in,fade_out;
ImageView Display;
float i= 1.0F,i2=0.1F;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clock=findViewById(R.id.button);
        anti_clock=findViewById(R.id.button2);
        zoom_in=findViewById(R.id.button3);
        zoom_out=findViewById(R.id.button4);
        fade_in=findViewById(R.id.button5);
        fade_out=findViewById(R.id.button6);
        Display=findViewById(R.id.imageView2);
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setRotation((float)Display.getRotation()+ 20 );
                Toast.makeText(MainActivity.this, "Clockwise", Toast.LENGTH_SHORT).show();
            }
        });
        anti_clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Display.setRotation((float)Display.getRotation() - 20 );
                Toast.makeText(MainActivity.this, "anti Clockwise", Toast.LENGTH_SHORT).show();
            }
        });
        zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Display.setScaleX((float) (Display.getScaleX() + 1.0));
             Display.setScaleY((float) (Display.getScaleY()+1.0));
                Toast.makeText(MainActivity.this, "Zoom _in", Toast.LENGTH_SHORT).show();
            }
        });
        zoom_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setScaleX((float) (Display.getScaleX() -1.0));
                Display.setScaleY((float) (Display.getScaleY() - 1.0));
                Toast.makeText(MainActivity.this, "Zoom_out", Toast.LENGTH_SHORT).show();
            }
        });
        fade_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setAlpha(i);
                Toast.makeText(MainActivity.this, "fade_in", Toast.LENGTH_SHORT).show();
            }
        });
        fade_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setAlpha(i2);
                Toast.makeText(MainActivity.this, "fade_out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}