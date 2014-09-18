package com.android.lab1_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.*;
import android.util.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.widget.*;

public class SecondActivity extends Activity {

	TextView tv1;
	
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second);
	
	tv1 = (TextView)findViewById(R.id.textView3);
	
	
	Intent intent =getIntent();
	
	String fname = intent.getStringExtra("firstname");
	String lname = intent.getStringExtra("lastname");
	
	tv1.setText(fname+ "  "+lname);
	
		
	
    }
	
}
