package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Create two unrelated classes that represent moving things (for example, Dog and Airplane).
//        Give each of them their own superclass (for example, in the case of Dog, the superclass might be Animal,
//        while in the case of Airplane, the superclass might be Vehicle).
//        Give all of these classes some properties and methods as you see fit.
//                Create an interface named Mover with a single method named move. The move method should return a
//                number representing the speed at which the thing is moving.
//        Make the subclasses implement the Mover interface. The move method should print something to the screen to
//        indicate that the thing is moving, providing whatever level of detail feels appropriate.
//        Make a RadarSpeedGun class. The class should have as a property a list of moving things.
//        Give RadarSpeedGun a method that sets all its moving things in motion, and calculates a total speed of all
//        the moving things.
//                Try utilizing the RadarSpeedGun class with a handful of moving things.
//   BONUS: Consider how and why it was advantageous to utilize an interface in this example.
//          Could there be an alternative way? What if instead of an interface, we made a Mover class, and made it the
//          superclass of all classes (ie, in the example stated above, both Animal and Vehicle would extend Mover)?


        Boat firstBoat = new Boat("Racing Boat" , false, 2017, 125);
        firstBoat.move();

        Koala firstKoala = new Koala ("Fuzzy" , 2, "P. cinereus" ,
                "Australia", 10);
        firstKoala.move();

        Train firstTrain = new Train(100, true, 2002, 20);
        firstTrain.move();


        RadarSpeedGun firstRadarSpeedGun = new RadarSpeedGun();
        firstRadarSpeedGun.allMovingList.add(firstBoat);
        firstRadarSpeedGun.allMovingList.add(firstKoala);
        firstRadarSpeedGun.allMovingList.add(firstTrain);

        firstRadarSpeedGun.calculateTotalSpeed(firstBoat.getSpeed());
        firstRadarSpeedGun.calculateTotalSpeed(firstKoala.getSpeed());
        firstRadarSpeedGun.calculateTotalSpeed(firstTrain.getSpeed());



//        firstRadarSpeedGun.calculateTotalSpeed(125);
//        firstRadarSpeedGun.calculateTotalSpeed(10);


        System.out.println(firstRadarSpeedGun.totalSpeed);


        System.out.println(firstRadarSpeedGun.allMovingList);
        firstRadarSpeedGun.printRadarSpeedGun();



     }
}
