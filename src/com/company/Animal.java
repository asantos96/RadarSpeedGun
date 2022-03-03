package com.company;

    //Superclass AKA Parent class

public class Animal {
    private String species;
    private String nativeLocation;

    public Animal(String species, String nativeLocation){
        this.species = species;
        this.nativeLocation = nativeLocation;
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
}
