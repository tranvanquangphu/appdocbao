package com.example.appdocbao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {
    WebView webview;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        back = (Button) findViewById(R.id.button_back);
        webview = (WebView) findViewById(R.id.webviewTinTuc);

        Intent intent = getIntent();

        String link = intent.getStringExtra("https://vnexpress.net/chu-phonefarm-he-lo-su-that-ve-tuong-tac-khung-tren-mang-xa-hoi-4673943.html");

        webview.loadUrl(link);

        //bỏ duyệt link trên điện thoại
        webview.setWebViewClient(new WebViewClient());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}