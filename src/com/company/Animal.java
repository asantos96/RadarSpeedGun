package com.company;

    //Superclass AKA Parent class

public class Animal {
    private String species;
    private String nativeLocation;
    int speed;

    public Animal(String species, String nativeLocation, int speed){
        this.species = species;
        this.nativeLocation = nativeLocation;
        this.speed = speed;
    }

    //Setters and Getters

    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }

    public void setNativeLocation(String nativeLocation) {
        this.nativeLocation = nativeLocation;
    }
    public String getNativeLocation() {
        return nativeLocation;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
