package com.example.prac_26;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

public class Background extends AsyncTask<String,String,Void> {
    Context ctx;

    Background(Context ctx){
        this.ctx=ctx;
    }
    @Override
    protected Void doInBackground(String... voids) {
        DbOperations dbOperations= new DbOperations(ctx);
        String method = voids[0];
        if(method.equals("add_info")){
            String name = voids[1];
            SQLiteDatabase db = dbOperations.getWritableDatabase();
          DbOperations.addInformation(db,name);


        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
    }

    @Override
    protected void onProgressUpdate(String... values) {

        Toast.makeText(ctx, "the result"+values+"is stored", Toast.LENGTH_SHORT).show();
    }
}
