package com.ragew.code.carsimulator;

/**
 * Created by ragew on 1/14/2018.
 */

public class SelfDrivingCar extends Car{
    public SelfDrivingCar(String chosenColor, String chosenInterior) {
        super(chosenColor, chosenInterior);
        System.out.println("This is the self driving car");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving to Googleplex.");
    }
}
