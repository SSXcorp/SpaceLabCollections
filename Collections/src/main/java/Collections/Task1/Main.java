package Collections.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> carNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Car parking program: ");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("СТОП")) {
                scanner.close();
                break;
            } else if (input.equalsIgnoreCase("СПИСОК")) {
                printCarNumbers(carNumbers);
            } else if (!input.trim().isEmpty()) {
                addCarNumber(carNumbers, input);
            } else {
                System.out.println("Your input is empty. Please write a car number: ");
            }
        }

        System.out.println("The program was finished successfully!");
    }

    private static void addCarNumber(ArrayList<String> carNumbers, String carNumber) {
        carNumbers.add(carNumber);
        System.out.println("Car number added: " + carNumber);
    }

    private static void printCarNumbers(ArrayList<String> carNumbers) {
        if (carNumbers.isEmpty()) {
            System.out.println("Car numbers list is empty! Add some car numbers first!");
        } else {
            System.out.println("List of registered cars: ");
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }


}
