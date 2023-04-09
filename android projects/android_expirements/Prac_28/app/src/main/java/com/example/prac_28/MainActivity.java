package com.example.prac_28;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText user_name,pass_name;

Button login;
int no_of_attempts, l1 = 0 , l2 = 0,s1 = 8,s2 = 8;
String result,attempts,user_string,pass_string;
TextView result_main,attempts_login;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = findViewById(R.id.editTextTextPersonName);
        pass_name = findViewById(R.id.editTextTextPersonName2);
        attempts_login=findViewById(R.id.textView3);
        result_main=findViewById(R.id.textView2);
        login =findViewById(R.id.button);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l1 =user_name.getText().toString().length();
                l2 = pass_name.getText().toString().length();


                       if( l1 >= s1 && l2>= s2) {
                           if (user_name.getText().toString().equals("ronit_mehta") && pass_name.getText().toString().equals("72_tyco_b")) {
                               Toast.makeText(MainActivity.this, "login successfully", Toast.LENGTH_SHORT).show();
                           } else if (user_name.getText().toString() != "ronit_mehta" || pass_name.getText().toString() != "72_tyco_b") {
                               no_of_attempts += 1;
                               attempts = "The no. of attempts" + no_of_attempts;
                               attempts_login.setText(attempts);
                               Toast.makeText(MainActivity.this, "login unsuccessful", Toast.LENGTH_SHORT).show();
                           }
                       }

                   else{
                         Toast.makeText(MainActivity.this, "enter sufficient characters or fields are empty", Toast.LENGTH_SHORT).show();
                     }
            }
        });

    }
}