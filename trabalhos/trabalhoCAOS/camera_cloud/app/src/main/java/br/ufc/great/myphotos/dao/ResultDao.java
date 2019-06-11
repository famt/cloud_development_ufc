package br.ufc.great.myphotos.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import org.json.JSONException;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import br.ufc.great.myphotos.dao.model.AppConfiguration;
import br.ufc.great.myphotos.dao.model.ResultImage;

public final class ResultDao extends Dao {
	private final String pattern = "dd-MM-yyyy HH:mm:ss";
	private final DateFormat dateFormat = new SimpleDateFormat(pattern,
			Locale.US);
	private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
			pattern, Locale.US);

	private final String TABLE_NAME = "result";

	// FIELD
	private final String F_ID = "id";
	private final String F_PHOTO_NAME = "photo_name";
	private final String F_FILTER_NAME = "filter_name";
	private final String F_LOCAL = "local";
	private final String F_SIZE = "photo_size";
	private final String F_EXECUTION_CPU_TIME = "execution_cpu_time";
	private final String F_UPLOAD_TIME = "upload_time";
	private final String F_DOWNLOAD_TIME = "download_time";
	private final String F_TOTAL_TIME = "total_time";
	private final String F_DOWN_SIZE = "download_size";
	private final String F_UP_SIZE = "upload_size";
	private final String F_DATE = "date";

	public ResultDao(Context con) {
		super(con);
	}

	public void add(ResultImage results) {
		openDatabase();

		ContentValues cv = new ContentValues();

		cv.put(F_PHOTO_NAME, results.getConfig().getImage());
		cv.put(F_FILTER_NAME, results.getConfig().getFilter());
		cv.put(F_LOCAL, results.getConfig().getLocal());
		cv.put(F_SIZE, results.getConfig().getSize());

		// cv.put(F_EXECUTION_CPU_TIME,
		// results.getRpcProfile().getExecutionCpuTime());
		// cv.put(F_UPLOAD_TIME, results.getRpcProfile().getUploadTime());
		// cv.put(F_DOWNLOAD_TIME, results.getRpcProfile().getDonwloadTime());
		cv.put(F_TOTAL_TIME, results.getTotalTime());
		// cv.put(F_DOWN_SIZE, results.getRpcProfile().getDownloadSize());
		// cv.put(F_UP_SIZE, results.getRpcProfile().getUploadSize());

		cv.put(F_DATE, dateFormat.format(results.getDate()));

		database.insert(TABLE_NAME, null, cv);

		closeDatabase();
	}

	public ArrayList<ResultImage> getAll() throws JSONException, ParseException {
		return queryResultImage("SELECT * FROM " + TABLE_NAME);
	}

	private ArrayList<ResultImage> queryResultImage(String sql)
			throws JSONException, ParseException {
		openDatabase();

		Cursor cursor = database.rawQuery(sql, null);

		ArrayList<ResultImage> lista = new ArrayList<ResultImage>();

		// obtem todos os indices das colunas da tabela
		int idx_id = cursor.getColumnIndex(F_ID);
		int idx_date = cursor.getColumnIndex(F_DATE);

		int idx_photo_name = cursor.getColumnIndex(F_PHOTO_NAME);
		int idx_filter_name = cursor.getColumnIndex(F_FILTER_NAME);
		int idx_local = cursor.getColumnIndex(F_LOCAL);
		int idx_size = cursor.getColumnIndex(F_SIZE);

		int idx_cpu_time = cursor.getColumnIndex(F_EXECUTION_CPU_TIME);
		int idx_up_time = cursor.getColumnIndex(F_UPLOAD_TIME);
		int idx_down_time = cursor.getColumnIndex(F_DOWNLOAD_TIME);
		int idx_total_time = cursor.getColumnIndex(F_TOTAL_TIME);
		int idx_down_size = cursor.getColumnIndex(F_DOWN_SIZE);
		int idx_up_size = cursor.getColumnIndex(F_UP_SIZE);

		if (cursor != null && cursor.moveToFirst()) {
			do {
				ResultImage result = new ResultImage();
				result.setId(cursor.getInt(idx_id));
				result.setDate(simpleDateFormat.parse(cursor
						.getString(idx_date)));
				result.setTotalTime(cursor.getLong(idx_total_time));

				AppConfiguration config = new AppConfiguration();
				config.setImage(cursor.getString(idx_photo_name));
				config.setFilter(cursor.getString(idx_filter_name));
				config.setLocal(cursor.getString(idx_local));
				config.setSize(cursor.getString(idx_size));
				result.setConfig(config);

				// RpcProfile profile = new RpcProfile();
				// profile.setDonwloadTime(cursor.getLong(idx_down_time));
				// profile.setDownloadSize(cursor.getInt(idx_down_size));
				// profile.setUploadTime(cursor.getLong(idx_up_time));
				// profile.setUploadSize(cursor.getInt(idx_up_size));
				// profile.setExecutionCpuTime(cursor.getLong(idx_cpu_time));
				// result.setRpcProfile(profile);

				lista.add(result);
			} while (cursor.moveToNext());
		}

		cursor.close();
		closeDatabase();

		return lista;
	}

	public void clean() {
		openDatabase();

		database.delete(TABLE_NAME, null, null);

		closeDatabase();
	}
}