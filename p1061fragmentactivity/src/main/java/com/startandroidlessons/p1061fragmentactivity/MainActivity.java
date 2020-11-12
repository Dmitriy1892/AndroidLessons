package com.startandroidlessons.p1061fragmentactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Fragment2.onSomeEventListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment frag2 = new Fragment2();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment2, frag2);
        ft.commit();
    }

    public void onClick(View v) {
        Fragment frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment1);
        ((TextView) frag1.getView().findViewById(R.id.textView))
                .setText("Access to Fragment1 from Activity");

        Fragment frag2 = getSupportFragmentManager().findFragmentById(R.id.fragment2);
        ((TextView) frag2.getView().findViewById(R.id.textView))
                .setText("Access to Fragment2 from Activity");
    }

    @Override
    public void someEvent(String s) {
        Fragment frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment1);
        ((TextView) frag1.getView().findViewById(R.id.textView)).setText("Text from Fragment2: " + s);
    }
}