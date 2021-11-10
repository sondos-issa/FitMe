package com.example.twoactivities.model;

public class TrainFactory {
    public ITrain getModel(){
        return new TrainDa();
    }
}
