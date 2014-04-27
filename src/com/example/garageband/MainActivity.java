package com.example.garageband;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

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

	public void mainMenu(View view) {
		setContentView(R.layout.activity_main);
	}	
	
	public void createRoomMenu(View view) {
		setContentView(R.layout.create_room);
	}
	
	public void joinRoomMenu(View view) {
		setContentView(R.layout.join_room);
	}

	public void playbackMenu(View view) {
		setContentView(R.layout.playback);
	}

	public void profileMenu(View view) {
		setContentView(R.layout.profile);
	}

	public void settingsMenu(View view) {
		setContentView(R.layout.settings);
	}
}
