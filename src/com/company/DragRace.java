package com.company;
import java.util.Locale;
import java.util.Scanner;

public class DragRace {
    Scanner scanner = new Scanner(System.in);
    public final int METERS_DISTANCE = 1000;
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_ORANGE = "\033[38;5;166m";
    public static Car[] cars = {
            new Car("Honda", 5, new MidSizeEngine("Honda", 800), "Black", 3),
            new Car("Mitsubishi", 2, new MidSizeEngine("Mitsubishi", 900), "White", 2)
    };

    public void run() {
        System.out.println("Welcome to " + TEXT_RED + "Drag Race!" + TEXT_RESET);
        String selection;
        System.out.println("Distance remaining: " + TEXT_ORANGE + METERS_DISTANCE + TEXT_RESET + " meters.");
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
        System.out.println("Thank you!");
    }
    //TODO: get index number in line 27
    public void vehicleSelection() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("\t\n" + cars[i]);
        }

        System.out.println("\t1 - " + cars[0] + "\n" + "\n\t2 - " + cars[1]);
        String selection;
        do {
            System.out.println("""
                    Choose an option:
                    (1) Honda Civic (Mid-Size Engine)
                    (2) Mitsubishi (Large engine)
                    Selection:\s""");
            selection = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (selection) {
                case "1" -> System.out.println("1");
                case "2" -> System.out.println("2");
            }
        } while (!selection.equals("E"));
    }
}
