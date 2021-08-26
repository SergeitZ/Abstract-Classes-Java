package com.company;

public abstract class Engine {
    private String manufacturer;
    private int horsePower;

    public Engine (String manufacturer, int horsePower) {
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
    }

    public String toString() {
        return "\n\tManufacturer: " + manufacturer + "\n\tHorse Power: " + horsePower;
    }
}
