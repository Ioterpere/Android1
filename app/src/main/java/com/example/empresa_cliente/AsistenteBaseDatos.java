package com.example.empresa_cliente;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AsistenteBaseDatos extends SQLiteOpenHelper {


    public AsistenteBaseDatos(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String crearClientes = "CREATE TABLE Clientes(" +
                "id_Cliente INTEGER NOT NULL  PRIMARY KEY AUTOINCREMENT," +
                "Nombre TEXT NOT NULL," +
                "Apellido1 TEXT NOT NULL," +
                "Apellido2 TEXT," +
                "Vip INTEGER NOT NULL" +
                ");";
        db.execSQL(crearClientes);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
