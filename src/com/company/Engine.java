package com.company;

public abstract class Engine {
    private String manufacturer;
    private boolean isOn;
    private int horsePower;

    public Engine (String manufacturer, boolean isOn, int horsePower) {
        this.manufacturer = manufacturer;
        this.isOn = isOn;
        this.horsePower = horsePower;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        String status;
        if (isOn) {
            status = "On";
        } else {
            status = "Off";
        }
        return status;
    }

    public String toString() {
        return "\n\tManufacturer: " + manufacturer + "\n\tStatus: " + getStatus() + "\n\tHorse Power: " + horsePower;
    }
}
