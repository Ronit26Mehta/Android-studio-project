package com.example.prac_11_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox Check_box1, Check_box2, Check_box3, Check_box4, Check_box5;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Check_box1 = findViewById(R.id.checkBox);
        Check_box2 = findViewById(R.id.checkBox2);
        Check_box3 = findViewById(R.id.checkBox3);
        Check_box4 = findViewById(R.id.checkBox4);
        Check_box5 = findViewById(R.id.checkBox5);
        Check_box1.setOnCheckedChangeListener(this::onCheckedChanged);
        Check_box2.setOnCheckedChangeListener(this::onCheckedChanged);
        Check_box3.setOnCheckedChangeListener(this::onCheckedChanged);
        Check_box4.setOnCheckedChangeListener(this::onCheckedChanged);
        Check_box5.setOnCheckedChangeListener(this::onCheckedChanged);
        result="the checkboxes are " + "\n";
    }

    public void onCheckedChanged(CompoundButton arg0, boolean isChecked) {
        if (Check_box1.isChecked()) {
            result = result + "\n"+"the checkbox one is checked";

        }
        if(Check_box2.isChecked()){
            result = result + " \n"+ "the checkbox two is checked";
        }
        if( Check_box3.isChecked()){
            result = result + "\n"+ "the checkbox three is checked";
        }
        if (Check_box4.isChecked()){
            result = result + "\n"+ "the checkbox four is checked";
        }
        if(Check_box5.isChecked()){
            result= result +"\n" +"the checkbox five is checked";
        }
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }
}