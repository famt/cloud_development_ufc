package br.ufc.great.myphotos;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.ufc.great.myphotos.dao.model.AppConfiguration;
import br.ufc.great.myphotos.dao.model.ResultImage;
import br.ufc.great.myphotos.image.ImageFilter;
import br.ufc.great.myphotos.image.ImageFilterTask;
import br.ufc.great.myphotos.util.TaskResultAdapter;

public class MainActivity extends Activity {

    private ImageFilter filter;
    private AppConfiguration config;
    File photoFile = null;
    boolean firstPicture = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filter = new ImageFilter();
        config = new AppConfiguration();

        // Creates the file that will be used
        File storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (!storageDir.exists()) {
            storageDir.mkdirs();
        }
        photoFile = new File(storageDir, "temp_co_image.jpg");
    }

    /*
     * On Click event from Apply Filter button.
     */
    public void applyFilter(View view) {
        processImage();
    }

    private void processImage() {
        System.gc();

        config.setFilter(getRadioChecked());
        config.setImage(photoFile.getAbsolutePath());

        // Apply filter
        new ImageFilterTask(getApplication(), filter, config, taskResultAdapter)
                .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void enableFilterLayout() {
        findViewById(R.id.imagedetailslabel).setVisibility(View.VISIBLE);
        findViewById(R.id.exectime).setVisibility(View.VISIBLE);
        findViewById(R.id.simpleFilter).setVisibility(View.VISIBLE);
        findViewById(R.id.complexFilter).setVisibility(View.VISIBLE);
        findViewById(R.id.applyfilter).setVisibility(View.VISIBLE);
    }

    public void disableFilterLayout() {
        findViewById(R.id.imagedetailslabel).setVisibility(View.INVISIBLE);
        findViewById(R.id.exectime).setVisibility(View.INVISIBLE);
        findViewById(R.id.simpleFilter).setVisibility(View.INVISIBLE);
        findViewById(R.id.complexFilter).setVisibility(View.INVISIBLE);
        findViewById(R.id.applyfilter).setVisibility(View.INVISIBLE);
    }

    public void setExecTime(long totalTime) {
        Date date = new Date(totalTime);
        SimpleDateFormat df = new SimpleDateFormat("mm:ss.SSS");
        ((TextView) findViewById(R.id.exectime)).setText("Execution Time: " + df.format(date));
    }

    public void resetExecTime() {
        ((TextView) findViewById(R.id.exectime))
                .setText("Execution Time: 00:00.000");
    }

    public void setImageResolution(int h, int w) {
        ((TextView) findViewById(R.id.imagedetailslabel))
                .setText("Image Resolution: " + h + "x" + w);
    }

    public void resetImageResolution() {
        ((TextView) findViewById(R.id.imagedetailslabel))
                .setText("Image Resolution:");
    }

    /*
     * On Click event from Simple Radio.
     */
    public void setFilterAsSimple(View view) {
        ((RadioButton) findViewById(R.id.simpleFilter)).setChecked(true);
        ((RadioButton) findViewById(R.id.complexFilter)).setChecked(false);
    }

    /*
     * On Click event from Complex Radio.
     */
    public void setFilterAsComplex(View view) {
        ((RadioButton) findViewById(R.id.simpleFilter)).setChecked(false);
        ((RadioButton) findViewById(R.id.complexFilter)).setChecked(true);
    }

    /*
     * Return button marked
     */
    public String getRadioChecked() {
        if (((RadioButton) findViewById(R.id.simpleFilter)).isChecked())
            return "Red Ton";
        if (((RadioButton) findViewById(R.id.complexFilter)).isChecked())
            return "Cartoonizer";
        return "none";
    }

    public void disableStartCameraButton() {
        ((Button) findViewById(R.id.button)).setText("Processing...");
        ((Button) findViewById(R.id.button)).setClickable(false);
    }

    public void enableStartCameraButton() {
        ((Button) findViewById(R.id.button)).setText("Start Camera");
        ((Button) findViewById(R.id.button)).setClickable(true);
    }

    public void disableApplyFilterButton() {
        ((Button) findViewById(R.id.applyfilter)).setText("Please Wait...");
        ((Button) findViewById(R.id.applyfilter)).setClickable(false);
    }

    public void enableApplyFilterButton() {
        ((Button) findViewById(R.id.applyfilter)).setText("Apply Filter");
        ((Button) findViewById(R.id.applyfilter)).setClickable(true);
    }

    /*
     * On Click event from Start Camera button.
     */
    public void callCamera(View view) {
        // create Intent to take a picture and return control to the calling
        // application
        Intent cameraIntent = new Intent(
                android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
        startActivityForResult(cameraIntent, 0);
    }

    /*
     * Method called when the camera is done
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            // Add photo to the Gallery
            Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
            Uri contentUri = Uri.fromFile(photoFile);
            mediaScanIntent.setData(contentUri);
            this.sendBroadcast(mediaScanIntent);

            // Open picture and add to the ImageView
            Bitmap imageBitmap = BitmapFactory.decodeFile(photoFile.getAbsolutePath());
            ((ImageView) findViewById(R.id.imageView)).setImageBitmap(imageBitmap);

            // Configure picture resolution
            setImageResolution(imageBitmap.getHeight(), imageBitmap.getWidth());
            resetExecTime();

            // Show filter layout
            enableFilterLayout();
        }
    }

    private TaskResultAdapter<ResultImage> taskResultAdapter = new TaskResultAdapter<ResultImage>() {
        long initialTime = 0;
        long totalTime = 0;

        @Override
        public void completedTask(ResultImage obj) {
            if (obj != null) {
                totalTime = System.currentTimeMillis() - initialTime;
                ((ImageView) findViewById(R.id.imageView)).setImageBitmap(obj.getBitmap());
                setExecTime(totalTime);

            } else {
                resetImageResolution();
                resetExecTime();
                ((ImageView) findViewById(R.id.imageView)).setImageResource(android.R.color.transparent);
            }
            enableStartCameraButton();
            enableApplyFilterButton();
        }

        @Override
        public void taskOnGoing(int completed, String statusText) {
            // Disable start camera button
            initialTime = System.currentTimeMillis();
            disableStartCameraButton();
            disableApplyFilterButton();
        }
    };

    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Close");
        alertDialogBuilder.setIcon(android.R.drawable.ic_dialog_alert);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialogBuilder.setMessage("Close Camera Offloading?");
        alertDialogBuilder.create().show();
    }
}