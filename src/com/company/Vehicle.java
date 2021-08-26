package com.company;
import java.util.*;

public abstract class Vehicle {
    private String make;
    private final List<String> passengers = new ArrayList<>();
    private int maxPassengers;
    private int year;
    private Engine engine;
    private String color;
    private boolean isUsed;
    public boolean isOn = false;

    public Vehicle(String make, int maxPassengers, int year, Engine engine, String color, boolean isUsed) {
        this.make = make;
        this.maxPassengers = maxPassengers;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.isUsed = isUsed;
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

    public String getUsedStatus() {
        String answer;
        if (isUsed) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        return answer;
    }

    public String toString() {
        String output = "Make: " + make + "\nYear: " + year  + "\nColor: "  + color + "\nPre-Owned: " + getUsedStatus()+ "\nEngine status: " + getIsOn() + "\nEngine: " + engine; ;
        return output;
    }

}
