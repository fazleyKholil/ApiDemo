package net.fazleykholil.bluetoothwifiapidemo;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    private ToggleButton tgBluetooth;
    private ToggleButton tgWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        final WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        final BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        tgBluetooth = (ToggleButton) findViewById(R.id.tgBlueetooth);
        tgWifi = (ToggleButton) findViewById(R.id.tgWifi);

        tgBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetooth(bluetoothAdapter);
            }
        });

        tgWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifi(wifiManager);
            }
        });
    }

    private void bluetooth(BluetoothAdapter bluetoothAdapter) {
        if(!bluetoothAdapter.isEnabled())
            bluetoothAdapter.enable();
        else
            bluetoothAdapter.disable();
    }

    private void wifi(WifiManager wifiManager) {
        if(!wifiManager.isWifiEnabled())
        wifiManager.setWifiEnabled(true);
        else
            wifiManager.setWifiEnabled(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
