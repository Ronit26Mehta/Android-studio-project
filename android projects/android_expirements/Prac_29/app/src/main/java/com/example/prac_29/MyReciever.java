package com.example.prac_29;



import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
    private static final String TAG = "SmsReceiver"; // Define TAG constant
    // Initialize TextView instance for displaying SMS information

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            Object[] smsObj = (Object[]) bundle.get("pdus");
            if (smsObj != null) {
                for (Object obj : smsObj) {
                    SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) obj, "3gpp2");
                    String mobNo = smsMessage.getDisplayOriginatingAddress();
                    String msg = smsMessage.getDisplayMessageBody();
                    String total = "Mobile Number: " + mobNo + "\n" + "Message: " + msg;
                    Log.d(TAG, "onReceive: " + total);
                    // Display SMS information in TextView or handle as needed
                }
            }
        }
    }
}
