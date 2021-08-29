package com.company;

public class Car extends Vehicle {

    public Car (String make, int passengerCapacity, Engine engine, String color, int weightTons) {
        super(make, passengerCapacity, engine, color, weightTons);
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

}
