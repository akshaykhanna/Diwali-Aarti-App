package com.akibb.bhakti;







import android.app.Activity;
import android.content.Intent;


import android.os.Bundle;



public class Intro extends Activity 
{

	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		
		// for in-App adds
		
		getWindow().setBackgroundDrawableResource(R.drawable.intro);
		//setContentView(R.layout.intro);
		
		
		
		
		
		
		
		Thread timer= new Thread()
		{

			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				
				try
				{
					sleep(1500);//layout will be displayed for 3sec
					
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
					
				}
				finally
				{
					Intent sta2= new Intent("com.akibb.bhakti.MAIN");//Finally it will start menu activity
					startActivity(sta2);
					
				}
			
				
				
			}
		
		};
		timer.start();
		
		
		
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
		
		
	}
	

}
