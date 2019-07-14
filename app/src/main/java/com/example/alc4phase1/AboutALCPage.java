package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.ClientCertRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutALCPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alcpage);


        String url = "https://www.andela.com/alc/";

        WebView web = (WebView) findViewById(R.id.about_page);
        web.loadUrl(url);

        web.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        }
    }

