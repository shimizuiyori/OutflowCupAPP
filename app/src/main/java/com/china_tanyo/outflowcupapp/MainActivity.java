package com.china_tanyo.outflowcupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.xwalk.core.XWalkView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        XWalkView xWalkView = (XWalkView) this.findViewById(R.id.xwalkWebView);
        xWalkView.load("http://html5test.com/", null);

        //xWalkView.load("file:///android_asset/www/index.html", null);
    }
}
