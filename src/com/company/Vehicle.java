package com.company;
import java.util.*;

public abstract class Vehicle {
    private String type;
    private final List<String> passengers = new ArrayList<>();
    private int maxPassengers;
    private int year;
    private Engine engine;
    private String color;
    private boolean isUsed;

    public Vehicle(String type, int maxPassengers, int year, Engine engine, String color, boolean isUsed) {
        this.type = type;
        this.maxPassengers = maxPassengers;
        this.year = year;
        this.engine = engine;
        this.color = color;
        this.isUsed = isUsed;
    }

    public void addPassenger(String name) {
        passengers.add(name);
    }

    public void removePassenger (String name) {
        passengers.remove(name);
    }

}
