package com.example.prac_13_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements Runnable {
    ProgressBar progress;
    Button Start;
    Thread t;
    int myprogress = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = findViewById(R.id.progressBar);

        t = new Thread((Runnable) this, "demothread");
        t.start();

    }

    @Override
    public void run() {
        while (true) {
            try {
                myprogress++;
                progress.setProgress(myprogress);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}