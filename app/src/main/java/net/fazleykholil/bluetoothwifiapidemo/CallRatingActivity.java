package net.fazleykholil.bluetoothwifiapidemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Fazley on 09/11/2015.
 */
public class CallRatingActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "provide rating", Toast.LENGTH_LONG).show();
        setContentView(R.layout.call_rating);
    }
}
