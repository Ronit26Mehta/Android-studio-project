package com.example.prac_18_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Text;
    Button Result;
    String result;
    int n=1;
    int i ;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text= findViewById(R.id.editTextTextPersonName);
        Result = findViewById(R.id.button);
        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=1;
                for (i=1;i<=Integer.parseInt(String.valueOf(Text.getText()));i++) {
                    n*= i;

                }


                 intent = new Intent(MainActivity.this, Result.class);
                intent.putExtra("result",n);
                startActivity(intent);
            }
        });

    }
}