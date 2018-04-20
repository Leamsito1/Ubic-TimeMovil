package com.example.ismael.timeubic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ISMAEL on 19/04/2018.
 */

public class registrarUsuarios extends SQLiteOpenHelper{
    public registrarUsuarios(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(idu integer primary key autoincrement, usuario text, email text,telefono text,password text)");
        db.execSQL("insert into usuarios values('ismael','leamsito3@gmail.com','7331414582','leamsito')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("create table usuarios(idu integer primary key autoincrement, usuario text, email text,telefono text,password text)");
        db.execSQL("insert into usuarios values('ismael','leamsito3@gmail.com','7331414582','leamsito')");

    }
}
