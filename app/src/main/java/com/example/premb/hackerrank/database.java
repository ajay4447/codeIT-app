package com.example.premb.hackerrank;
import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class database extends SQLiteOpenHelper{

    public static String databasename="credentials.DB";
    public static int dataver = 1;
    public static  String query="CREATE TABLE "+databaseContract.datas.table_name+" ("+databaseContract.datas.name1+" TEXT,"+databaseContract.datas.pwd1+" TEXT);";
    public database(Context c)
    {
        super(c,databasename,null,dataver);
        Log.e("DATABASE","DATABASE CREATED/ACCESSED");

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(query);
        Log.e("DATABASE","TABLE CREATED");

    }
    public void addinfo(String name,String pwd,SQLiteDatabase db)
    {
        ContentValues v=new ContentValues();
        v.put(databaseContract.datas.name1,name);
        v.put(databaseContract.datas.pwd1,pwd);
        db.insert(databaseContract.datas.table_name,null,v);
        Log.e("DATABASE","TABLE INSERTED");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
