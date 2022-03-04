package com.company;

//Subclass AKA Child class

public class Train extends Transportation implements Mover{
    int numberOfSeats;

    public Train(int numberOfSeats, boolean onLand, int yearBuilt, int speed){
        super(onLand, yearBuilt, speed);
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public int move(){
        System.out.println("The train has " + numberOfSeats + " seats and was built in " + getYearBuilt() + "." + " It is moving at a speed of "
                + getSpeed() + " MPH." + " Does it get used on land? " + getOnLand());
        return getSpeed();
    }

}
