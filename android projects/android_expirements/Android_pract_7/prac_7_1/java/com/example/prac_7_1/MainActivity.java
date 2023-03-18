package com.example.prac_7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   EditText username,password;
   TextView dis,pas;
   Button submit;
   String s1;
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username =  findViewById(R.id.editTextTextPersonName);
        password =  findViewById(R.id.editTextTextPassword);
        dis =  findViewById(R.id.textView4);
        pas =  findViewById(R.id.textView5);
        submit =  findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
               s1=(username.getText().toString());
                s2=(password.getText().toString());

                 dis.setText("the username is " + s1);
                 pas.setText("the password is " + s2);


            }
        });
    }



}