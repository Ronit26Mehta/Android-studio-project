package com.example.prac_20_exercise_2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import android.net.wifi.WifiManager;
import android.os.Handler;




public class MyService extends Service {
    private Handler handler;
    private  Runner runner;


    public IBinder onBind(Intent intent){
        return null;
    }
    public void onCreate(){
        super.onCreate();
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        handler = new Handler();


        runner = new Runner();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler.post(runner);
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        handler.removeCallbacks(runner);


        Toast.makeText(this, "Service Destroy", Toast.LENGTH_SHORT).show();
    }
    private class Runner implements Runnable {
        @Override
        public void run() {
            Log.d("androidClarified","Running");

        }
    }

}
