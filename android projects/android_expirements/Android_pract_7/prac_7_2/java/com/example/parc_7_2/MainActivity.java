package com.example.parc_7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText Stud_name,Stud_roll,Stud_enroll,Stud_marks;
     Button Submit;
     TextView print_name,print_roll,print_enroll,print_marks;
     String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stud_name=findViewById(R.id.editTextTextPersonName);
        Stud_roll=findViewById(R.id.editTextNumber);
        Stud_enroll=findViewById(R.id.editTextNumber2);
        Stud_marks=findViewById(R.id.editTextNumberDecimal);
        Submit = findViewById(R.id.button);
        print_name=findViewById(R.id.textView7);
        print_roll=findViewById(R.id.textView8);
        print_enroll=findViewById(R.id.textView9);
        print_marks=findViewById(R.id.textView10);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              s1=(Stud_name.getText().toString());
              s2=(Stud_roll.getText().toString());
              s3=(Stud_enroll.getText().toString());
              s4=( Stud_marks.getText().toString());
              print_name.setText("the username is " + s1);
              print_roll.setText("the roll no. is  "+ s2);
              print_enroll.setText("the enroll no.  is " + s3);
              print_marks.setText("the marks is "+s4);

            }
        });
    }
}