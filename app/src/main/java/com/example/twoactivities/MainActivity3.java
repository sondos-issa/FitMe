package com.example.twoactivities;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private int seconds = 0;
    private boolean running = false;
    private ListView list;
    public String[] str ={"1- Hands Left","2- Hands right","3- repeat for 10 min"} ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
       list=findViewById(R.id.list);
//        Spinner dyspinner = findViewById(R.id.dynamicSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity3.this, android.R.layout.simple_spinner_dropdown_item,str);
        list.setAdapter(adapter);
        checkInstance(savedInstanceState);
        runTimer();
    }
    private void checkInstance(Bundle savedInstanceState) {
        if(savedInstanceState != null){
            seconds = savedInstanceState.getInt("SECONDS");
            running = savedInstanceState.getBoolean("RUNNING");
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("SECONDS", seconds);
        outState.putBoolean("RUNNING", running);
    }
    private void runTimer(){
        final TextView txtTime = findViewById(R.id.txtTime);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600) / 60;
                int secs = seconds%60;
                String time = hours +" : " + minutes + " : " + secs;
                txtTime.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }});
    }
    public void btnStartOnClick(View view) {

        running = true;
    }
    public void btnStopOnClick(View view) {

        running = false;
    }
    public void btnResetOnClick(View view)
    {
        running = false;
        seconds = 0;
    }
}
