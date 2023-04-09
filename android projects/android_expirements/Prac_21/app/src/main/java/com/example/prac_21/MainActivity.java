package com.example.prac_21;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent intent;
    MyReceiver receiver;
    IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent("com.package.CUSTOM_INTENT");
                sendBroadcast(intent);
                Log.d(TAG, "onBroadcast");
            }
        });
        receiver = new MyReceiver();
         filter = new IntentFilter("com.package.CUSTOM_INTENT");
        registerReceiver(receiver, filter);
    }
    protected void onDestroy() {
        super.onDestroy();
        // Unregister the receiver
        unregisterReceiver(receiver);
    }
}
