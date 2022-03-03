package com.company;

    //Superclass AKA Parent class

public class Transportation {
    private boolean onLand;
    private int yearBuilt;

    //Constructor to carry into Boat child class
    public Transportation (boolean onLand, int yearBuilt){
        this.onLand = onLand;
        this.yearBuilt = yearBuilt;
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


}
