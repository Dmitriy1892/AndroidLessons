package com.startandroidlessons.p0941servicekillclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickStart(View v) {
        //ComponentName component = new ComponentName("com.startandroidlessons.p0941servicekillclient", "com.startandroidlessons.p0942servicekillserver.MyService");
        //Intent intent = new Intent(this, com.startandroidlessons.p0942servicekillserver.MyService.class);
        //intent.setComponent(component);
        //intent.putExtra("name", "value");
        //startService(intent);
    }
}