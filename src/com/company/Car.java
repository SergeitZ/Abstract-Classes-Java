package com.company;

public class Car extends Vehicle {

    public Car (String make, int passengerCapacity, int year, Engine engine, String color, boolean isUsed) {
        super(make, passengerCapacity, year, engine, color, isUsed);
    }

    @Override
    public void turnOn () {
        isOn = true;
    }

    @Override
    public void turnOff () {
        isOn = false;
    }

}
