package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //public Button MoveTsec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnShow_Show(View view) {

        Intent intent = new Intent(MainActivity.this,scondActivity.class);
        startActivity(intent);

    }


//    public void btnStartOnClick(View view) {
//    }
//
//    public void btnStopOnClick(View view) {
//    }
//
//    public void btnResetOnClick(View view) {
//    }
}