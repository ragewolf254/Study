package com.ragew.code.bmicalculator;

public class myClass {
    public static void main(String[] args) {
        System.out.println("Hello! This is a simple BMI calculator!");
        double bmi = myBMI(40, 1.7);
        System.out.println("Your BMI is: " + bmi);
        if (bmi > 25){
            System.out.println("You are overweight!");
        } else if (bmi < 25 && bmi > 18.4){
            System.out.println("You have normal weight!");
        } else {
            System.out.println("You are under weight!");
        }
    }

    public static double myBMI(double mass, double height){
        double myBmi;
        System.out.println("Your mass is: " + mass + " kilograms.");
        System.out.println("Your height is: " + height + " meters.");
        myBmi = mass/height;
        return myBmi;
    }
}
