package org.sfh6.cc.dara.activityinvestigation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.util.Log;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("lifecycle", "In the onCreate () event");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("lifecycle", "In the onDestroy() event");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("lifecycle", "In the onStop () event");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("lifecycle", "In the onRestart () event");
	}

	
	
	
}
