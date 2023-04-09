package com.example.prac_26;

import static android.content.ContentValues.TAG;
import static com.example.prac_26.ProductContract.ProductEntry.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DbOperations extends SQLiteOpenHelper {
    static ContentValues cnt;
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "product_info.db";
    private static final String CREATE_QUERY = "create TABLE "+ProductContract.ProductEntry.TABLE_NAME + "("+  ProductContract.ProductEntry.NAME + "  text); ";
    DbOperations(Context ctx){
        super(ctx,DB_NAME,null,DB_VERSION);
        Log.d(TAG, "db created ");
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_QUERY);
        Log.d(TAG, "Table Created: ");
    }
    public static void addInformation(SQLiteDatabase db,  String name){
        cnt = new ContentValues();

        cnt.put(ProductContract.ProductEntry.NAME,name);
        db.insert(ProductContract.ProductEntry.TABLE_NAME,null,cnt);
        Log.d(TAG,"One Row Inserted");


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
