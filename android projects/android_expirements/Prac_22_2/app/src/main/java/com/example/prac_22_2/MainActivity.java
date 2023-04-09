package com.example.prac_22_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
 SensorManager sensorManager;
 TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> deviceSensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
        textView = findViewById(R.id.textView);
        for (Sensor sensor:deviceSensor) {
            textView.append(sensor.toString()+"\n");

        }

    }
}