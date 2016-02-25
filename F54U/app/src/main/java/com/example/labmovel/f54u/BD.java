package com.example.labmovel.f54u;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rafael on 24/02/2016.
 */
public class BD extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "banco.db";
    private static final String TABELA = "lista_URL";
    private static final String ID = "_id";
    private static final String URL = "url";
    private static final String TEMPO = "tempo";
    private static final boolean VERIFICADO = false;
    private static final int VERSAO = 1;

    public BD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"(" + ID + "integer primary key autoincrement," + URL + "text,"
                + TEMPO + "text," + VERIFICADO + "text" +")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);
    }

}
