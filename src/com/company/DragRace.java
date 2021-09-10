package com.company;
import java.util.Locale;
import java.util.Scanner;

public class DragRace {
    Scanner scanner = new Scanner(System.in);
    public final int METERS_DISTANCE = 5000;
    public static Car[] cars = {
            new Car("Honda", 5, null, "Black", 4),
            new Car("Mitsubishi", 2, null, "White", 2),
            new Car("Nissan", 2, null, "White", 3)
    };
    //TODO: Code ending, once you reach the finish line
    //TODO: Interface
    public static Engine[] engines = {
            new CarEngine("Standard", 600),
            new CarEngine("Performance", 900),
            new CarEngine("Alien-Tech", 2500)
    };

    public static Car selectedVehicle;
    public int vehicleSpeed = 0;

    public void run() {
        System.out.println("Welcome to " + Color.RED + "Drag Race!" + Color.RESET);
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
        System.out.println("Select vehicle: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\t\n" + (i + 1) + " - " + cars[i]);
        }
        String selection;
        do {
            System.out.println("""
                    Select vehicle:
                    (1) Honda Civic
                    (2) Mitsubishi Evo
                    (3) Nissan Skyline
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> selectedVehicle = cars[0];
                case "2" -> selectedVehicle = cars[1];
                case "3" -> selectedVehicle = cars[2];
            }
        } while (!selection.equals("1") &&
                 !selection.equals("2") &&
                 !selection.equals("3"));
        selectEngine();
    }

    public void selectEngine() {
        System.out.println("Select engine: ");
        for (int i = 0; i < engines.length; i++) {
            System.out.println("\t\n" + (i + 1) + " - " + engines[i]);
        }
        String selection;
        do {
            System.out.println("""
                    Select engine:
                    (1) Standard Engine: 600 HP
                    (2) Performance Engine: 900 HP
                    (3) Alien tech Engine: 2500 HP
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> selectedVehicle.installEngine(engines[0]);
                case "2" -> selectedVehicle.installEngine(engines[1]);
                case "3" -> selectedVehicle.installEngine(engines[2]);
            }
        } while (!selection.equals("1") &&
                 !selection.equals("2") &&
                 !selection.equals("3"));
        raceInterface();
    }

    public void travelDistance() {
        selectedVehicle.distanceTravelled += (int) (vehicleSpeed / 60.0 * 1609);
    }

    public void raceInterface() {
        String selection;
        int turns = 0;
        System.out.println("Distance remaining: " + Color.ORANGE + METERS_DISTANCE + Color.RESET + " meters.");
        System.out.println(selectedVehicle);
        do {
            travelDistance();
            System.out.println("\nTime elapsed: " + turns + " Minutes " +
                    "| Vehicle speed: " + vehicleSpeed + " Mph " +
                    "| Distance Travelled: " + selectedVehicle.distanceTravelled + " meters" +
                    "| Distance remaining: " + Color.ORANGE + (METERS_DISTANCE - selectedVehicle.distanceTravelled)
                    + Color.RESET + " meters.");
            System.out.println("""
                    Choose an option:
                    (1) Accelerate
                    (2) Coast
                    (3) Brake
                    (4) Restart race
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> accelerate();
                case "2" -> coast();
                case "3" -> brake();
                case "4" -> {
                    selectedVehicle.distanceTravelled = 0;
                    vehicleSpeed = 0;
                    raceInterface();
                }
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
