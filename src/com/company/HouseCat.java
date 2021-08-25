package com.company;

public class HouseCat extends Cat{

    public HouseCat(String name, String color, int weightInGrams, boolean isNeutered, String species) {
        super(name, color, weightInGrams, isNeutered, species);
    }

    @Override
    public void meow() {
        System.out.println("I hate mondays");
    }
}
