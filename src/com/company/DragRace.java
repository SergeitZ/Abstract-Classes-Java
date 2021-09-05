package com.company;
import java.util.Locale;
import java.util.Scanner;

public class DragRace {
    Scanner scanner = new Scanner(System.in);
    public final int METERS_DISTANCE = 2000;
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_ORANGE = "\033[38;5;166m";
    public static Car[] cars = {
            new Car("Honda", 5, new CarEngine("Standard", 600), "Black", 3),
            new Car("Mitsubishi", 2, new CarEngine("Performance", 900), "White", 2)
    };
    public static Car selectedVehicle;
    public int vehicleSpeed = 0;

    public void run() {
        System.out.println("Welcome to " + TEXT_RED + "Drag Race!" + TEXT_RESET);
        String selection;
        do {
            System.out.println("""
                    Choose an option:
                    (1) Select vehicle
                    (E) Exit
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> vehicleSelection();
             }
        } while (!selection.equals("E"));
        System.out.println("Bye!");
    }

    public void vehicleSelection() {
        System.out.println("Choose an option: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\t\n" + (i + 1) + " - " + cars[i]);
        }
        String selection;
        do {
            System.out.println("""
                    Choose an option:
                    (1) Honda Civic (Engine: Standard)
                    (2) Mitsubishi (Engine: Performance)
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> selectedVehicle = cars[0];
                case "2" -> selectedVehicle = cars[1];
            }
        } while (!selection.equals("1") && !selection.equals("2"));
        raceInterface();
    }

    public void travelDistance() {
        selectedVehicle.distanceTravelled += (int) (vehicleSpeed / 60.0 * 1609);
    }

    public void raceInterface() {
        String selection;
        int turns = 0;
        System.out.println("Distance remaining: " + TEXT_ORANGE + METERS_DISTANCE + TEXT_RESET + " meters.");
        System.out.println(selectedVehicle);
        do {
            travelDistance();
            System.out.println("\nTime elapsed: " + turns + " Minutes " +
                    "| Vehicle speed: " + vehicleSpeed + " Mph " +
                    "| Distance Travelled: " + selectedVehicle.distanceTravelled + " meters" +
                    "| Distance remaining: " + TEXT_ORANGE + (METERS_DISTANCE - selectedVehicle.distanceTravelled)
                    + TEXT_RESET + " meters.");
            System.out.println("""
                    Choose an option:
                    (1) Accelerate
                    (2) Coast
                    (3) Brake
                    (4) Abort (Return to main menu)
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> accelerate();
                case "2" -> coast();
                case "3" -> brake();
                case "4" -> System.exit(0);
            }
            turns++;
        } while (turns != 10);
    }

    public void accelerate() {
        vehicleSpeed += selectedVehicle.getEngine().getHorsePower() * 0.025;
    }

    public void coast() {
        vehicleSpeed = vehicleSpeed - selectedVehicle.getWeightTons();
    }

    public void brake() {
        vehicleSpeed -= vehicleSpeed * 0.70;
    }
}
