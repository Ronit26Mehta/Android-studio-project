package com.example.prac_30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText to,e_subject,e_msg;
Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        to = findViewById(R.id.editTextTextPersonName);
        e_subject=findViewById(R.id.editTextTextPersonName2);
        e_msg=findViewById(R.id.editTextTextPersonName3);
      send = findViewById(R.id.button);
      send.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent it = new Intent(Intent.ACTION_SEND);
              it.putExtra(Intent.EXTRA_EMAIL, new String[]{to.getText().toString()});
              it.putExtra(Intent.EXTRA_SUBJECT,e_subject.getText().toString());
              it.putExtra(Intent.EXTRA_TEXT,e_msg.getText().toString());
              it.setType("message/rfc822");
              startActivity(Intent.createChooser(it,"Choose mail app"));


          }
      });
    }
}