package com.ragew.code.carsimulator;

public class myClass {
    public static void main(String[] args) {
        System.out.println("Hello Car Simulator");

        Car myLambo = new Car("Red","Wood");
        Car myFerrari = new Car();
        myFerrari.drive();
        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        System.out.println("The autoBot's color is: " + autoBot.m_color);
        System.out.println("The autoBot's interior is: " + autoBot.m_interior);
        autoBot.drive();
    }
}
