package com.company;

import java.util.ArrayList;
import java.util.List;

public class RadarSpeedGun {

    // Make a RadarSpeedGun class. The class should have as a property a list of moving things. Could be an array
    public List<Mover> allMovingList = new ArrayList<>();

    public int totalSpeed;


    // Give RadarSpeedGun a method that sets all its moving things in motion, and calculates a total speed of all

    public void calculateTotalSpeed(int speed) {
        totalSpeed += speed;
    }

    //Method to print list
    public void printRadarSpeedGun() {
        for (int i = 0; i < allMovingList.size(); i++) {
            System.out.println(allMovingList.get(i));
        }
    }
}

