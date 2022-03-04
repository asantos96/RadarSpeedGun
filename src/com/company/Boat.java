package com.company;

// Make the subclasses implement the Mover interface. The move method should print something to the screen to
// indicate that the thing is moving.

    //Subclass AKA Child class

public class Boat extends Transportation implements Mover {
    private String typeOfBoat;


    //Constructor containing Transportation constructor and new variables created above
    public Boat(String typeOfBoat, boolean onLand , int yearBuilt, int speed){
        super(onLand, yearBuilt, speed);
        this.typeOfBoat = typeOfBoat;
    }

    //Move method created in the Mover interface being created below
    @Override
    public int move() {
        System.out.println("The " + typeOfBoat + "was built in " + getYearBuilt() + "." + " It is moving at a speed of "
                + getSpeed() + " MPH." + " Does it get used on land? " + getOnLand());
        return getSpeed();
    }
}
