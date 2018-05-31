/*******************************************************************************
 * Copyright (C) 2014 Philipp B. Costa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package br.ufc.great.myphotos.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.util.Log;

import br.ufc.great.myphotos.dao.ResultDao;
import br.ufc.great.myphotos.dao.model.AppConfiguration;
import br.ufc.great.myphotos.dao.model.ResultImage;
import br.ufc.great.myphotos.util.ImageUtils;
import br.ufc.great.myphotos.util.TaskResultAdapter;

/**
 * Asynctask for processing image...
 * 
 * @author Philipp
 */
public final class ImageFilterTask extends AsyncTask<Void, String, ResultImage> {
	private final String clsName = ImageFilterTask.class.getName();
	private PowerManager.WakeLock wakeLock;

	private Context context;
	private ImageFilter filter;
	private AppConfiguration config;
	private TaskResultAdapter<ResultImage> taskResult;

	private ResultDao dao;
	private ResultImage result = null;

	public ImageFilterTask(Context context, ImageFilter filter, AppConfiguration config, TaskResultAdapter<ResultImage> taskResult) {
		this.context = context;
		this.filter = filter;
		this.config = config;
		this.taskResult = taskResult;

		result = new ResultImage(config);
		dao = new ResultDao(context);
	}

	@Override
	protected void onPreExecute() {
		preventSleep();
	}

	@Override
	protected ResultImage doInBackground(Void... params) {
		try {
			if (config.getFilter().equals("Benchmark")) {
				Log.i(clsName, "Iniciou processo de Benchmark");
				benchmarkTask();
			} else if (config.getFilter().equals("Original")) {
				originalTask();
			} else if (config.getFilter().equals("Cartoonizer")) {
				cartoonizerTask();
			} else if (config.getFilter().equals("Sharpen")) {
				sharpenTask();
			} else {
				filterMapTask();
			}
			return result;
		} catch (InterruptedException e) {
			Log.w(clsName, e);
		} catch (IOException e) {
			Log.w(clsName, e);
		}
		return null;
	}

	@Override
	protected void onProgressUpdate(String... values) {
		taskResult.taskOnGoing(0, values[0]);
	}

	@Override
	protected void onPostExecute(ResultImage result) {
		wakeLock.release();
		taskResult.completedTask(result);
	}

	private String sizeToPath(String size) {
		if (size.equals("8MP")) {
			return "images/8mp/";
		} else if (size.equals("4MP")) {
			return "images/4mp/";
		} else if (size.equals("2MP")) {
			return "images/2mp/";
		} else if (size.equals("1MP")) {
			return "images/1mp/";
		} else if (size.equals("0.3MP")) {
			return "images/0_3mp/";
		}

		return null;
	}

	private File saveResultOnStorage(byte data[]) throws IOException {
		File file = new File(config.getImage());
		OutputStream output = new FileOutputStream(file);
		output.write(data);
		output.flush();
		output.close();
		return file;
	}

	private void preventSleep() {
		PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
		wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "PicFilter CPU");
		wakeLock.acquire();
	}

	private void originalTask() throws IOException {
		long initialTime = System.currentTimeMillis();

		publishProgress("Carregando imagem");

		Bitmap image = decodeSampledBitmapFromResource(context, sizeToPath(config.getSize()) + config.getImage(), config.getSize());
		result.setTotalTime(System.currentTimeMillis() - initialTime);
		result.setBitmap(image);

		publishProgress("Imagem carregada!");
	}

	private void filterMapTask() throws IOException {
		publishProgress("Start...");

		byte mapFilter[] = null;
		if (config.getFilter().equals("Red Ton")) {
			mapFilter = ImageUtils.streamToByteArray(context.getAssets().open("filters/map1.png"));
		} else if (config.getFilter().equals("Blue Ton")) {
			mapFilter = ImageUtils.streamToByteArray(context.getAssets().open("filters/map3.png"));
		} else if (config.getFilter().equals("Yellow Ton")) {
			mapFilter = ImageUtils.streamToByteArray(context.getAssets().open("filters/map2.png"));
		}

		byte image[] = ImageUtils.streamToByteArray(new FileInputStream(config.getImage()));
		byte imageResult[] = filter.mapTone(image, mapFilter);
		File fileSaved = saveResultOnStorage(imageResult);

		result.setBitmap(BitmapFactory.decodeFile(fileSaved.getAbsolutePath()));
		
		imageResult = null;
		image = null;
		mapFilter = null;
		System.gc();
	}

	private void sharpenTask() throws IOException {
		publishProgress("Start...");

		byte image[] = ImageUtils.streamToByteArray(new FileInputStream(config.getImage()));
		double mask[][] = { { -1, -1, -1 }, { -1, 9, -1 }, { -1, -1, -1 } };
		double factor = 1.0;
		double bias = 0.0;

		byte imageResult[] = filter.filterApply(image, mask, factor, bias);

		File fileSaved = saveResultOnStorage(imageResult);
		result.setBitmap(BitmapFactory.decodeFile(fileSaved.getAbsolutePath()));

		imageResult = null;
		image = null;
		System.gc();
	}

	private void cartoonizerTask() throws IOException, InterruptedException {
		publishProgress("Start...");

		byte image[] = ImageUtils.streamToByteArray(new FileInputStream(config.getImage()));
		byte imageResult[] = filter.cartoonizerImage(image);

		File fileSaved = saveResultOnStorage(imageResult);
		result.setBitmap(BitmapFactory.decodeFile(fileSaved.getAbsolutePath()));

		imageResult = null;
		image = null;
		System.gc();
	}

	private void benchmarkTask() throws IOException, InterruptedException {
		long totalTime = 0L;

		File fileSaved = null;

		int count = 1;
		String sizes[] = { "8MP", "4MP", "2MP", "1MP", "0.3MP" };
		for (String size : sizes) {
			byte image[] = ImageUtils.streamToByteArray(context.getAssets().open(sizeToPath(size) + config.getImage()));
			
			config.setSize(size);
			for (int i = 0; i < 3; i++) {
				publishProgress("Benchmark [" + (count++) + "/15]");

				long initialTime = System.currentTimeMillis();
				byte imageResult[] = filter.cartoonizerImage(image);
				fileSaved = saveResultOnStorage(imageResult);

				ResultImage resultImage = new ResultImage(config);
				resultImage.setTotalTime(System.currentTimeMillis() - initialTime);
				//resultImage.setRpcProfile(MposFramework.getInstance().getEndpointController().rpcProfile);
				
				dao.add(resultImage);
				totalTime += resultImage.getTotalTime();
				
				if (count != 16) {
					imageResult = null;
					System.gc();
					Thread.sleep(750);
				}
			}
			image = null;
			System.gc();
		}

		result.setTotalTime(totalTime);
		result.setBitmap(decodeSampledBitmapFromResource(context, new FileInputStream(fileSaved), "0.3MP"));
		result.getConfig().setSize("Todos");

		dao.add(result);
		publishProgress("Benchmark Completo!");
	}

	private Bitmap decodeSampledBitmapFromResource(Context context, InputStream is, String size) throws IOException {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inMutable = true;

		if (size.equals("1MP") || size.equals("2MP")) {
			options.inSampleSize = 2;
		} else if (size.equals("4MP")) {
			options.inSampleSize = 4;
		} else if (size.equals("6MP")) {
			options.inSampleSize = 6;
		} else if (size.equals("8MP")) {
			options.inSampleSize = 8;
		} else {
			options.inSampleSize = 1;
		}

		options.inJustDecodeBounds = false;
		return BitmapFactory.decodeStream(is);
	}

	private Bitmap decodeSampledBitmapFromResource(Context context, String path, String size) throws IOException {
		return decodeSampledBitmapFromResource(context, context.getAssets().open(path), size);
	}
}