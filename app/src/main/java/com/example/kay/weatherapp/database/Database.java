package com.example.kay.weatherapp.database;
import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Kay on 2017/1/9.
 */

public class Database {
    private static final String DATABASE_NAMES = "sqlitedata";
    private static final int DATABASE_VERSION = 3;
    public Database(Context context) {
        super(context, DATABASE_NAMES, null, DATABASE_VERSION);
    }
}
