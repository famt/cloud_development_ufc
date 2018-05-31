package br.ufc.great.myphotos.dao;

import br.ufc.great.myphotos.util.DatabaseManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public abstract class Dao {
	protected SQLiteDatabase database;
	private final DatabaseManager databaseManager;

	public Dao(Context con) {
		databaseManager = new DatabaseManager(con);
	}

	public void openDatabase() {
		database = databaseManager.getWritableDatabase();
	}

	public void closeDatabase() {
		database.close();
	}
}