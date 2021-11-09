package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class scondActivity extends AppCompatActivity {
public String[] str ={"High","Middle","low"} ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        Spinner dyspinner = findViewById(R.id.dynamicSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(scondActivity.this, android.R.layout.simple_spinner_dropdown_item,str);
        dyspinner.setAdapter(adapter);
}
    public void GoTothird(View view) {
        Intent intent2 = new Intent(scondActivity.this,problem.class);
        startActivity(intent2);
    }

}