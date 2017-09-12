package com.example.webview;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		WebView wv=(WebView)findViewById(R.id.wv);
		String sval=getIntent().getExtras().getString("url");
		//String sval1=getIntent().getExtras().getString("url");
		wv.setWebViewClient(new WebViewClient());
		wv.getSettings().setJavaScriptEnabled(true);
		wv.loadUrl(sval);
	}

}
