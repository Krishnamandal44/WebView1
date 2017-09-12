package com.example.webview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final LinearLayout lnfacebook1=(LinearLayout)findViewById(R.id.lnfacebook);
		final LinearLayout lngoogle1=(LinearLayout)findViewById(R.id.lngoogle);
		lnfacebook1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i= new Intent(MainActivity.this,MainActivity2.class);
				i.putExtra("url", "http://facebook.com");
				startActivity(i);
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		lngoogle1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i2= new Intent(MainActivity.this,MainActivity2.class);
				i2.putExtra("url", "http://google.com");
				startActivity(i2);
				
				
				// TODO Auto-generated method stub
				
			}
		});
	}
}
