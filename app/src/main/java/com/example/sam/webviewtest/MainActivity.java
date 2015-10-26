package com.example.sam.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);               //ping the webview container id
        WebSettings webSettings = myWebView.getSettings();                      //get webview settings initiated
        webSettings.setJavaScriptEnabled(true);                                 //enable javascript
        webSettings.setUserAgentString("Mozilla/5.0 (Linux; U; Android 4.4.4; fr-fr; Nexus 5 Build/KTU84P) AppleWebKit/537.16 (KHTML, like Gecko) Version/4.0 Safari/537.16");
        myWebView.setWebViewClient(new WebViewClient());                        //set the webview load inside the app
        myWebView.loadUrl("http://www.linepost.hk");      //load the url of the webview
    }


}
