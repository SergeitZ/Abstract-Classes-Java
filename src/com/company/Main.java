package com.company;

public class Main {

    public static void main(String[] args) {
        /*
    Challenge for Abstract Classes and Methods:

    Create a program focusing on Vehicles
    Required Classes: Vehicle, Engine
    Each Vehicle Class should contain one Engine
    Each Vehicle Class should contain methods to:
    Start/Stop
    Add Passengers
    Remove Passengers

    Basic Requirements:
    At least one Abstract Class
    At least two Abstract Methods
    */

//        HouseCat whiskers = new HouseCat("Whiskers", "Red", 2_500, true, "Scottish fold");
//
//        whiskers.displayWeightInPounds();
//        whiskers.meow();

        Car hondaCivic = new Car("Honda", 5, 2007, new MidSizeEngine("Honda", false, 2500), "Black", true);

        hondaCivic.addPassenger("Sergio");

        System.out.println(hondaCivic);
    }
}
