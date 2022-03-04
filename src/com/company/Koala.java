package com.company;

// Make the subclasses implement the Mover interface. The move method should print something to the screen to
// indicate that the thing is moving, providing whatever level of detail feels appropriate.

    //Subclass AKA Child class

public class Koala extends Animal implements Mover {
    private String name;
    private int age;

    //Constructor to call variables into move method
    public Koala (String name, int age, String species, String nativeLocation){
        super(species, nativeLocation);
        this.name = name;
        this.age = age;
    }

    //Implementing the move method from the Mover Interface
    @Override
    public int move (int speed){
        System.out.println( name + " the Koala belongs to the " + getSpecies() + " species. " + " He is native to the "
                +  getNativeLocation() + ". " + " He is " + age + " years old and is moving at a speed of " +
                speed + " MPH.");
        return speed;
    }
}
