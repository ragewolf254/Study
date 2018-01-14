package com.ragew.code.javapractice;

public class myClass {
    public static void main(String[] args) {
        System.out.println("Hello Java!, time to buy some rice!");
        int change = getRice(5,100);
        if (change < 0) {
            System.out.println("The robot's debt is: " + (-1 * change) + " pesos.");
        } else if (change == 0){
            System.out.println("The robot has no more money. Give it some!");
        } else {
            System.out.println("The robot's remaining money is: " + change + " pesos.");
        }
    }

    //Create a function
    private static int getRice(int kilosOfRice, int givenMoney){
        int currentRobotMoney = givenMoney;
        int priceToPay = kilosOfRice * 50;
        int change = currentRobotMoney - priceToPay;
        System.out.println("The robot has " + givenMoney + " pesos.");
        System.out.println("Open the door");
        System.out.println("Go outside");
        System.out.println("Buy " + kilosOfRice + " kilos of rice.");
        System.out.println("Pay " + priceToPay + " pesos. Nothing more, nothing less.");
        if (change < 0){
            System.out.println("Oh no! We are in debt. Our debt is " + (-1 * change )+ " pesos.");
        } else if (change == 0){
            System.out.println("There are no more change.");
        } else {
            System.out.println("Get the change. The change should be: " + change + " pesos. Nothing more, nothing less.");
        }
        System.out.println("Return home with rice");
        System.out.println("Close the door");
        return change;
    }
}
