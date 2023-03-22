package com.example.prac_15_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   CheckBox Pizza,Coffee,Burger;
   Button order;
   int total_bill=0;
   String total="Selected Items Are: \n";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pizza = findViewById(R.id.checkBox);
        Coffee = findViewById(R.id.checkBox2);
        Burger=findViewById(R.id.checkBox3);
        order = findViewById(R.id.button);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Pizza.isChecked()){
                    total=total + "\n" +Pizza.getText().toString() +":150rs"+"\n";
                    total_bill=total_bill+150;
                }
                if (Coffee.isChecked()){
                    total=total+"\n"+Coffee.getText().toString()+":50rs"+"\n";
                    total_bill=total_bill+50;
                }
                if(Burger.isChecked()){
                    total=total+"\n"+Burger.getText().toString()+":120";
                    total_bill=total_bill+120;
                }
                total=total+"\n"+"total:"+total_bill+"RS";
                Toast.makeText(MainActivity.this, total, Toast.LENGTH_LONG).show();
            }
        });

    }
}