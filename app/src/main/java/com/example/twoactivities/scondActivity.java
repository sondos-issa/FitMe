package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.twoactivities.model.ITrain;
import com.example.twoactivities.model.Train;
import com.example.twoactivities.model.TrainFactory;

import java.util.List;

public class scondActivity extends AppCompatActivity {
    private Spinner spinner;
    public String[] str ={"High","Middle","low"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);
        spinner = findViewById(R.id.dynamicSpinner);
        populateSpinner();
//        dyspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String stri = (String) dyspinner.getSelectedItem();
//                if(stri.equalsIgnoreCase("High"))
//                    Toast.makeText(scondActivity.this, "very good ", Toast.LENGTH_SHORT).show();
//                if(stri.equalsIgnoreCase("Middle"))
//                    Toast.makeText(scondActivity.this, "Nice keep going", Toast.LENGTH_SHORT).show();
//                if(stri.equalsIgnoreCase("low"))
//                    Toast.makeText(scondActivity.this, "its okay keep going you well do it", Toast.LENGTH_SHORT).show();
//            }
//        });
}

    private void populateSpinner() {
        TrainFactory factory = new TrainFactory();
        ITrain objTrain =  factory.getModel();
        String[] Name = objTrain.getTrains();


        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,Name);
        spinner.setAdapter(adapter);
    }

    public void GoTothird(View view) {

        Intent intent2 = new Intent(scondActivity.this,problem.class);
        startActivity(intent2);
        Toast.makeText(scondActivity.this, "I wish you well do it one days", Toast.LENGTH_SHORT).show();
    }

}