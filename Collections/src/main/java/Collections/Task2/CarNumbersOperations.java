package Collections.Task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CarNumbersOperations {

    LinkedList<String> carNumbers = new LinkedList<>(); // Cannot be replaced

    public void printCarNumbers() {
        if (carNumbers.isEmpty()) {
            System.out.println("Car numbers list is empty! Add some car numbers first!.");
        } else {
            System.out.println("List of registered cars: ");
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }

    public void addCarNumber(String carNumber, String positionInput) {
        int position;
        try {
            position = Integer.parseInt(positionInput);
        } catch (NumberFormatException e) {
            System.out.println("Position format is incorrect. Number will be added to the end of list.");
            carNumbers.add(carNumber);
            return;
        }

        if (position <= 0) {
            System.out.println("Position should be more than zero. Number will be added in the beginning of list.");
            carNumbers.addFirst(carNumber);
        } else if (position > carNumbers.size()) {
            System.out.println("Position is more than list size. Number will be added to the end of list.");
            carNumbers.add(carNumber);
        } else {
            System.out.println("This number was added to the position " + position + ": " + carNumber);
            carNumbers.add(position - 1, carNumber);
        }
    }

    public String enterCarNumber(Scanner scanner) {
        System.out.println("Enter a car number: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("СТОП")) {
            return "СТОП";
        } else if (input.equalsIgnoreCase("СПИСОК")) {
            printCarNumbers();
            return "СПИСОК";
        } else if (!input.trim().isEmpty()) {
            return input;
        } else {
            System.out.println("The number is empty. Please write correct number.");
            return enterCarNumber(scanner);
        }
    }

    public void addingOperation(Scanner scanner){
        System.out.println("Enter the car number: ");
        String input = scanner.nextLine();


    }
}
