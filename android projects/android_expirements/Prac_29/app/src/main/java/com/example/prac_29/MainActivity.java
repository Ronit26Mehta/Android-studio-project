
package com.example.prac_29;


import static android.content.pm.PackageManager.PERMISSION_GRANTED;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Permission;

public class MainActivity extends Activity {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;
    Button submit;
EditText phone_no,msg;
String phone_number,msg_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button);
        msg = findViewById(R.id.editTextTextPersonName);
        phone_no=findViewById(R.id.editTextTextPersonName2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSMS();
            }
        });

    }
    protected void sendSMS(){
        phone_number=phone_no.getText().toString();
        msg_number=msg.getText().toString();
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) != PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }
            else {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }
    }
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults){
        switch (requestCode){
            case MY_PERMISSIONS_REQUEST_SEND_SMS:
                if(grantResults.length >0 && grantResults[0] == PERMISSION_GRANTED ){
                    SmsManager  smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phone_number,null,msg_number,null,null);
                    Toast.makeText(this, "msg send successfully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "msg was not send successfully", Toast.LENGTH_SHORT).show();
                }
        }
    }
}