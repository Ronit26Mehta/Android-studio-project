package com.example.prac_24;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
Button turn_on,turn_off,get_visible,list_device;
    Intent i,i1;
TextView displayer;
 Set<BluetoothDevice> paired_devices;
    BluetoothAdapter ba;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn_on=findViewById(R.id.button);
        get_visible=findViewById(R.id.button2);
        list_device=findViewById(R.id.button3);
        turn_off=findViewById(R.id.button4);
        displayer=findViewById(R.id.textView);
        ba=BluetoothAdapter.getDefaultAdapter();
        turn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ba.isEnabled()){
                    Toast.makeText(MainActivity.this, "Bluetooth is already on", Toast.LENGTH_SHORT).show();
                    displayer.setText("Bluetooth is already on");
                }
                else{
                      i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Bluetooth is turned on", Toast.LENGTH_SHORT).show();
                    displayer.setText("Bluetooth is turned on");
                }
            }
        });
        get_visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            i1= new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
            startActivity(i1);
            Toast.makeText(MainActivity.this, "Discovery is started", Toast.LENGTH_SHORT).show();
            displayer.setText("Discovery is started");
            }
        });
        list_device.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                displayer.setText("Paired devices are" + "\n");
                paired_devices=ba.getBondedDevices();
                for (BluetoothDevice b1 : paired_devices){
                    displayer.append("\n"+"list devices are:"+ b1.getName());
                }

            }
        });
        turn_off.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                displayer.setText("Bluetooth is turned off");
              ba.disable();
                Toast.makeText(MainActivity.this, "Bluetooth is turned off", Toast.LENGTH_SHORT).show();
            }
        });
    }

}