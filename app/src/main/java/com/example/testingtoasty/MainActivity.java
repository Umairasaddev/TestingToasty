package com.example.testingtoasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//this toaster came from Toasty Project and thus library is working perfectly
        Toaster.simple_toast(this,"Welcome Am No One");
    }
}