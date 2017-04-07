package com.example.sonlv4.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int add(int a, int b) {
        if (a > b) {
            return a + b;
        }
        return b + a;
    }
    private int addNew(int a, int b) {
        if (a > b) {
            return a + b;
        }
        return b + a;
    }
}
