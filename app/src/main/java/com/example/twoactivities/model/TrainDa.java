package com.example.twoactivities.model;

import com.example.twoactivities.model.ITrain;
import com.example.twoactivities.model.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainDa implements ITrain {
    private ArrayList<Train> Trains = new ArrayList<>();
    public TrainDa(){
        Trains.add(new Train("High ","30 min","4 days","3 weeks"));
        Trains.add(new Train("legs ","20 min","7 days","7 weeks"));
        Trains.add(new Train("legs ","25 min","3 days","2 weeks"));
    }
@Override
    public String[] getTrains(){
        String[] trains={"High","Middle","Low"};
        return trains;
    }

}
