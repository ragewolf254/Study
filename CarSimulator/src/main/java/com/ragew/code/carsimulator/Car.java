package com.ragew.code.carsimulator;

/**
 * Created by ragew on 1/14/2018.
 */

public class Car {
    protected String m_color;
    Boolean hasGas = true;
    private int m_numberOfSeats = 6;
    protected String m_interior;
    public Car (){
        // insert code here later
        //insert default value
        m_color = "Black";
        m_interior = "Leather";
    }

    public Car (String chosenColor, String chosenInterior){
        m_color = chosenColor;
        m_interior = chosenInterior;
    }

    public void drive(){
        System.out.println("Broom Broom Bitch. ");
    }

    public int getNumberOfSeats() {
        return m_numberOfSeats;
    }

    public String getInterior() {
        return m_interior;
    }
}
