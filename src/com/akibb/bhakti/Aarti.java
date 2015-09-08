package com.akibb.bhakti;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Aarti  extends Activity
{
    TextView tv;
    LinearLayout ll;
    Bitmap bm;
    BitmapDrawable bdrawable;
	int s;
    String name[]={"Shree Ganesh Aarti","Maha Laxmi Aarti","Om jai Jadgdish","Jai Ambe Gauri","Shiv Ji Aarti","Saraswati Aarti"};
    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

    
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aarti);
		Bundle suitcase=getIntent().getExtras();
		  s=suitcase.getInt("key_data");
		  intial();
		  setUp(s);
	}
	private void intial() {
		// TODO Auto-generated method stub
		tv=(TextView)findViewById(R.id.textView1);
		ll=(LinearLayout)findViewById(R.id.llImg);
	}
	private void setUp(int ss) 
	{
		// TODO Auto-generated method stub
		tv.setText(name[ss]);
		select(ss);
		 bdrawable = new BitmapDrawable(bm);
		 ll.setBackgroundDrawable(bdrawable);
	}
	private void select(int ss) {
		// TODO Auto-generated method stub
		switch(ss)
		{
		case 0:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.ganpati);
			break;
		case 1:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.laxmi1);
			break;
		case 2:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.om_jai1);
			break;
		case 3:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.ambe1);
			break;
		case 4:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.shiv1);
			break;
		case 5:
			bm= BitmapFactory.decodeResource(getResources(), R.drawable.saraswati_aarti);
			break;
		}
	}

}
