package com.company;

    //Superclass AKA Parent class

public class Transportation {
    private boolean onLand;
    private int yearBuilt;
    private int speed;

    //Constructor to carry into Boat child class
    public Transportation (boolean onLand, int yearBuilt, int speed){
        this.onLand = onLand;
        this.yearBuilt = yearBuilt;
        this.speed = speed;
    }
    //Setters and getters to access in Boat child class
    public void setOnLand(boolean onLand) {
        this.onLand = onLand;
    }
    public boolean getOnLand(){
        return onLand;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
