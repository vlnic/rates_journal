package com.example.ratesjournal.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.example.ratesjournal.model.Bank;
import com.example.ratesjournal.model.Currency;

import java.util.ArrayList;

public class Repository extends SQLiteOpenHelper {

    protected ArrayList<String> tableSchemas;

    public Repository(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.tableSchemas = new ArrayList<String>();
        tableSchemas.add(Bank.tableSchema());
        tableSchemas.add(Currency.tableSchema());
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for (String schema : this.tableSchemas) {
            db.execSQL(schema);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
