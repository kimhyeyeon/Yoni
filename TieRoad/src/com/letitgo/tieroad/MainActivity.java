package com.letitgo.tieroad;

import com.letitgo.tieroad.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends ActionBarActivity {

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login_signup);
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
