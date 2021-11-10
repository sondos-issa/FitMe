package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class problem extends AppCompatActivity {
private CheckBox cABS,cLEGS,cARMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        cABS = findViewById(R.id.checkBox2);
        cLEGS=findViewById(R.id.checkBox3);
        cARMS=findViewById(R.id.checkBox);
        cABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cABS.isChecked()){
                    Intent intent4 = new Intent(problem.this,Abs.class);
                    startActivity(intent4);
                }
            }
        });
        cLEGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cLEGS.isChecked()){
                    Intent intent5 = new Intent(problem.this,Legs.class);
                    startActivity(intent5);
                }
            }
        });
        cABS = findViewById(R.id.checkBox2);
        cLEGS=findViewById(R.id.checkBox3);
        cARMS=findViewById(R.id.checkBox);
        cABS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cABS.isChecked()){
                    Intent intent4 = new Intent(problem.this,Abs.class);
                    startActivity(intent4);
                }
            }
        });
        cARMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cARMS.isChecked()){
                    Intent intent4 = new Intent(problem.this,MainActivity3.class);
                    startActivity(intent4);
                }
            }
        });
    }


}