package com.example.dell.equationcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        int a=intent.getIntExtra(MainActivity.EXTRA_a,0);
        int b =intent.getIntExtra(MainActivity.EXTRA_b,0);
        int c = intent.getIntExtra(MainActivity.EXTRA_c,0);

        TextView textView =findViewById(R.id.textView3);
        textView.append("" + (a+b)*c);
    }
}
