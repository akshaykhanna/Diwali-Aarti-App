package com.akibb.bhakti;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.akibb.bhakti.R;



import android.content.Intent;

public class Main extends Activity implements OnClickListener {

	Button b0,b1,b2,b3,b4,b5,b6;
	int c=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		intial();
	}

	private void intial() 
	{
		// TODO Auto-generated method stub
		b0=(Button)findViewById(R.id.bG0);
		b1=(Button)findViewById(R.id.bL1);
		b2=(Button)findViewById(R.id.bOjj2);
		b3=(Button)findViewById(R.id.bjag3);
		b4=(Button)findViewById(R.id.bsja4);
		b5=(Button)findViewById(R.id.bsa5);
		b6=(Button)findViewById(R.id.be6);
		b0.setOnClickListener(this);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		b6.setOnClickListener(this);
	}


	@Override
	public void onClick(View arg0)
	{
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.bG0:c=0;start(c);
			break;
		case R.id.bL1:c=1;start(c);
			break;
		case R.id.bOjj2:c=2;start(c);
			break;
		case R.id.bjag3:c=3;start(c);
			break;
		case R.id.bsja4:c=4;start(c);
			break;
		case R.id.bsa5:c=5;start(c);
			break;
		case R.id.be6:
		   finish();
			break;
			
		}
		
		
	}
	
	private void start(int c) {
		// TODO Auto-generated method stub
		Bundle suitcase=new Bundle();
		suitcase.putInt("key_data", c);
		Intent flight;
		flight=new Intent(Main.this,Aarti.class);
		flight.putExtras(suitcase);
		startActivity(flight);
	}

	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu)

	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater capactiveButtonMenu=getMenuInflater();
	    capactiveButtonMenu.inflate(R.menu.main_menu, menu);
	    return true;
	    
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId())
		{
		
		
		case R.id.credits:
			Intent aboutus=new Intent("com.akibb.bhakti.ABOUTUS");
			startActivity(aboutus);
			break;
		
		case R.id.Exit:
			finish();
			break;
		}
		return false;
		
	}
	
}
