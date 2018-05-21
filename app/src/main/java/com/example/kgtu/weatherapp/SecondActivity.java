package com.example.kgtu.weatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String city = getIntent().getStringExtra(MainActivity.CITY_NAME);
        TextView textView = findViewById(R.id.city_name);
        textView.setText(city);
    }
}
