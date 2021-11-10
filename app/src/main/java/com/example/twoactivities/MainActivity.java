package com.example.twoactivities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText name;

    //public Button MoveTsec;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName3);
        //age = findViewById(R.id.AGE);

    }

    public void btnShow_Show(View view) {
        String UName = name.getText().toString();
        Toast.makeText(MainActivity.this, "hi "+UName + "welcome To My App!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this,scondActivity.class);
        startActivity(intent);

    }


}