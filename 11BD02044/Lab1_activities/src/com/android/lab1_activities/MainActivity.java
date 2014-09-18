package com.android.lab1_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.app.*;
import android.util.*;
import android.os.*;
import android.content.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity  {

	EditText et1;
	EditText et2;
	Button btnSubmit;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
    et1 = (EditText)findViewById(R.id.editText1);
    et2 = (EditText)findViewById(R.id.editText2);
    btnSubmit = (Button) findViewById(R.id.button1);
    

    
    
   OnClickListener oclBtn = new OnClickListener(){
	 
	   public void onClick(View v){
		   Intent intent = new Intent(MainActivity.this, SecondActivity.class); 
		    intent.putExtra("firstname", et1.getText().toString());
		    intent.putExtra("lastname", et2.getText().toString());
		    startActivity(intent);
	   }
	   
   };
    
   btnSubmit.setOnClickListener(oclBtn);
    }
    
}
