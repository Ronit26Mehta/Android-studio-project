package com.example.prac_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText Username,Password;
Button Login;
TextView Status;
String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.editTextTextPersonName);
        Password = findViewById(R.id.editTextTextPersonName2);
        Login = findViewById(R.id.button);
        Status = findViewById(R.id.textView4);

                Password.getText().toString();
               s3="ronit";
               s4="mehta";
                Login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(Username.getText().toString().equals(s3) && Password.getText().toString().equals(s4) ) {

                                Status.setText("welcome   " + s3);

                        }
                        else{
                            Status.setText("wrong password or username or any field is missing");
                        }
                }
                });



    }
}