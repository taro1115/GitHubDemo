package com.qf.githubdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = new TextView(this);
    }

    public void openOther(View view) {
        Intent intent = new Intent();
        intent.setClass(this, SecondActivity.class);
        startActivityForResult(intent, 300);
    }
}
