package Collections.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> carOwners = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numbers app. Print СТОП to stop app.");

        while (true) {
            System.out.println("Choose command or print auto number: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("СТОП")) {
                break;
            } else if (input.equalsIgnoreCase("СПИСОК")) {
                printCarOwners(carOwners);
            } else if (input.equalsIgnoreCase("АВТОМОБИЛИ")) {
                printCarNumbers(carOwners);
            } else if (input.equalsIgnoreCase("ВЛАДЕЛЬЦЫ")) {
                printOwners(carOwners);
            } else {
                System.out.println("Print auto owner: ");
                String owner = scanner.nextLine();
                addCarAndOwner(carOwners, input, owner);
            }
        }

        System.out.println("Program work is completed.");
    }

    private static void addCarAndOwner(Map<String, String> carOwners, String carNumber, String owner) {
        carOwners.put(carNumber, owner);
        System.out.println("Car number added: " + carNumber + ", Owner: " + owner);
    }

    private static void printCarOwners(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Car numbers list is empty! Add some car numbers first!.");
        } else {
            System.out.println("List of registered cars and owners: :");
            for (Map.Entry<String, String> entry : carOwners.entrySet()) {
                System.out.println("Car number: " + entry.getKey() + ", Owner: " + entry.getValue());
            }
        }
    }

    private static void printCarNumbers(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Car numbers list is empty!");
        }
        else {
            System.out.println("Car numbers list:");
            for (String carNumber : carOwners.keySet()) {
                System.out.println(carNumber);
            }
        }
    }

    private static void printOwners(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Owners list is empty");
        }
        else {
            System.out.println("Owners list:");
            for (String owner : carOwners.values()) {
                System.out.println(owner);
            }
        }
    }


}
