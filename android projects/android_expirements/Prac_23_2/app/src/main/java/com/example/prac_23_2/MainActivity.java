package com.example.prac_23_2;


import static android.content.ContentValues.TAG;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button video;
    private Uri video1;
    private final int requestcode = 100;
    private final int cameracode = 101;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = findViewById(R.id.button);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, requestcode);
                } else {
                    Intent i = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                    startActivityForResult(i, cameracode);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == requestcode && resultCode == cameracode) {
            video1 = data.getData();
            Log.d(TAG, "video path: " + video1);
        }

    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case requestcode: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission was granted
                    Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                    startActivityForResult(intent, cameracode);
                } else {
                    // permission denied
                    Toast.makeText(this, "Camera permission required.", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
}