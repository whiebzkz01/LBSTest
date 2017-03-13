package com.whieb.lbstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.location.LocationClient;

public class MainActivity extends AppCompatActivity {

    public LocationClient mLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
