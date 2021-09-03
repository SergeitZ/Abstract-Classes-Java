package com.company;

public abstract class Engine {
    private String type;
    private int horsePower;

    public Engine (String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String toString() {
        return "\n\tType: " + type + "\n\tHorse Power: " + horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
