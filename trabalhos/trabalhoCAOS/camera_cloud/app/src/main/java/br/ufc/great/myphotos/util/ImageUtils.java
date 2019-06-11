package br.ufc.great.myphotos.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * @author Philipp
 */
public final class ImageUtils {
	private ImageUtils() {
	}

	/**
	 * Encode raw (color matrix) to data buffer (jpeg). Work with any runtime
	 * Android or Java SE.
	 *
	 * @param imageRaw
	 * @return
	 * @throws IOException
	 */
	public static byte[] encodeRawToJpeg(int[][] imageRaw) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream(
				2 * 1024 * 1024); // 2mb
		byte data[] = null;

		Bitmap bitmap = encodeMatrixToBitmap(imageRaw);
		bitmap.compress(Bitmap.CompressFormat.JPEG, 100, output);

		output.flush();
		data = output.toByteArray();

		// clean
		output.close();
		output = null;
		bitmap = null;
		System.gc();
		return data;
	}

	/**
	 * Decode databuffer (jpeg) to raw (color matrix). Work with any runtime
	 * Android or Java SE.
	 *
	 * @param data
	 * @return
	 * @throws IOException
	 */
	public static int[][] decodeJpegToRaw(byte[] data) throws IOException {
		int imageRaw[][] = null;
		imageRaw = decodeBitmapToMatrix(BitmapFactory.decodeByteArray(data, 0,
				data.length));
		return imageRaw;
	}

	private static int[][] decodeBitmapToMatrix(Bitmap image)
			throws IOException {
		int imgWidth = image.getWidth();
		int imgHeight = image.getHeight();
		int imageMatrix[][] = new int[imgWidth][imgHeight];

		for (int x = 0; x < imgWidth; x++) {
			for (int y = 0; y < imgHeight; y++) {
				imageMatrix[x][y] = image.getPixel(x, y);
			}
		}

		image.recycle();
		image = null;
		System.gc();
		return imageMatrix;
	}

	private static Bitmap encodeMatrixToBitmap(int imageMatrix[][]) {
		Bitmap.Config conf = Bitmap.Config.ARGB_8888;
		Bitmap image = Bitmap.createBitmap(imageMatrix.length,
				imageMatrix[0].length, conf);

		int imgWidth = image.getWidth();
		int imgHeight = image.getHeight();
		for (int x = 0; x < imgWidth; x++) {
			for (int y = 0; y < imgHeight; y++) {
				image.setPixel(x, y, imageMatrix[x][y]);
			}
		}
		return image;
	}

	public static byte[] streamToByteArray(InputStream is) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream(
				2 * 1024 * 1024); // 2mb
		byte buffer[] = new byte[32 * 1024];

		int read = 0;
		while ((read = is.read(buffer)) != -1) {
			output.write(buffer, 0, read);
		}

		output.flush();
		return output.toByteArray();
	}

	public static int[][] rawImageClone(int matrix[][]) {
		int clone[][] = new int[matrix.length][0];

		int width = matrix.length;
		for (int i = 0; i < width; i++) {
			clone[i] = Arrays.copyOf(matrix[i], matrix[i].length);
		}

		return clone;
	}

	public static int getRed(int color) {
		return (color >> 16) & 0xFF;
	}

	public static int getGreen(int color) {
		return (color >> 8) & 0xFF;
	}

	public static int getBlue(int color) {
		return color & 0xFF;
	}

	public static int setColor(int red, int green, int blue) {
		return (0xFF << 24) | (red << 16) | (green << 8) | blue;
	}
}