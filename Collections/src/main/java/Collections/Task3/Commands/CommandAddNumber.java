package Collections.Task3.Commands;

import Collections.Task3.Components.Operations;

import java.util.Scanner;
import java.util.Set;

public record CommandAddNumber() implements Command {

    @Override
    public void execute() {
        System.out.println("Enter a car number: ");
        String currentCarNumber = new Scanner(System.in).nextLine();
        addCarNumber(Operations.getCarNumbers(), currentCarNumber);
    }

    private static void addCarNumber(Set<String> carNumbers, String carNumber) {
        if (carNumbers.contains(carNumber)) {
            System.out.println("Car number " + carNumber + " already exists.");
        } else {
            carNumbers.add(carNumber);
            System.out.println("Car number added: " + carNumber);
        }
    }
}
