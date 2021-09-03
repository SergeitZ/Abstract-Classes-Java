package com.company;
import java.util.*;

public abstract class Vehicle {
    private String make;
    private final List<String> passengers = new ArrayList<>();
    private int maxPassengers;
    private Engine engine;
    private String color;
    private int weightTons;
    public boolean isOn = true;
    public int speed;
    public int distanceTravelled;

    public Vehicle(String make, int maxPassengers, Engine engine, String color, int weight) {
        this.make = make;
        this.maxPassengers = maxPassengers;
        this.engine = engine;
        this.color = color;
        this.weightTons = weight;
        speed = 0;
        distanceTravelled = 0;

    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public void addPassenger(String name) {
        passengers.add(name);
    }

    public void removePassenger (String name) {
        passengers.remove(name);
    }

    public String getIsOn() {
        String status;
        if (isOn) {
            status = "ON";
        } else {
            status = "OFF";
        }
        return status;
    }

    public String toString() {
        return "Make: " + make + " | Weight: " + weightTons + " tons " + "| \n\tEngine: " + engine;
    }

//    public String toString() {
//        String output = "Make: " + make + "\nColor: "  + color + "\nWeight: " + weightTons + " tons\nEngine status: " + getIsOn() + "\nEngine: " + engine; ;
//        return output;
//    }

}
