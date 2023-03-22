package com.example.prac_13_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Runnable {
    ProgressBar File_downloader;
    int progress = 0;
    TextView notation,progress1,percent;
    Button btn;
    Thread th;
    ConstraintLayout back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File_downloader = findViewById(R.id.progressBar);
        notation = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        progress1=findViewById(R.id.textView2);
        percent=findViewById(R.id.textView3);
        back = findViewById(R.id.background);

        th = new Thread(this, "thread");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File_downloader.setVisibility(View.VISIBLE);
                notation.setVisibility(View.VISIBLE);
                btn.setVisibility(View.INVISIBLE);
                progress1.setVisibility(View.VISIBLE);
                percent.setVisibility(View.VISIBLE);
                th.start();
                back.setBackgroundColor(Color.GRAY);


            }
        });
    }

    @Override
    public void run() {
        while (progress < 100) {
            try {
                progress++;
                File_downloader.setProgress(progress);
                Thread.sleep(100);
                progress1.setText(progress+"/100");
                percent.setText(progress+"%");
            } catch (Exception e) {
            }
        }
    }
}