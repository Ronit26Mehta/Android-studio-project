package com.example.prac_16_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    EditText Date_enter,Time_enter;
    Button select_date,select_time;
    TimePicker clock;
    DatePicker cal;
    String s1="the time is:",s2="the cal is:";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date_enter=findViewById(R.id.editTextDate);
        Time_enter=findViewById(R.id.editTextTime);
        select_date=findViewById(R.id.button);
        select_time=findViewById(R.id.button2);
        clock=findViewById(R.id.clock);
        clock.setIs24HourView(true);
        cal=findViewById(R.id.calendar);
        select_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clock.setVisibility(View.VISIBLE);
                cal.setVisibility(View.INVISIBLE);
                s1=s1+clock.getHour()+":"+clock.getMinute();
                Time_enter.setText(s1);
            }
        });
        select_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             cal.setVisibility(View.VISIBLE);
             clock.setVisibility(View.INVISIBLE);
             s2= s2 +cal.getDayOfMonth()+"-"+cal.getMonth()+"-"+cal.getYear();
             Date_enter.setText(s2);

            }
        });
    }
}