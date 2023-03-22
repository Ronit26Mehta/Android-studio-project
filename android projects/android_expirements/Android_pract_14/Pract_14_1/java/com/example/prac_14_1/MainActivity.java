package com.example.prac_14_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;
ArrayAdapter <String>list1;

String list2[]={"Android","Java","Php","Sap","Python","Ajax","C++","Ruby","Rails"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        list.setTextFilterEnabled(true);
        list1 = new <String>ArrayAdapter(this , androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list2);
        list.setAdapter(list1);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText( MainActivity.this,((TextView) view).getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
