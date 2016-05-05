package com.example.accelerometer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	 private static final String TAG = MainActivity.class.getName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void connect(View view) {
        Log.i(TAG, "Connect clicked");
        EditText hostName = (EditText)findViewById(R.id.host);
        EditText port = (EditText)findViewById(R.id.port);
        Log.i(TAG, "Host name is " + hostName.getText());
        Log.i(TAG, "Port is " + port.getText());
        Intent intent = new Intent(this, ConnectedActivity.class);
        startActivity(intent);
    }

}
