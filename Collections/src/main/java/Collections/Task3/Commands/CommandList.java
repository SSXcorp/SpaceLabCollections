package Collections.Task3.Commands;

import Collections.Task3.Components.Operations;

import java.util.Set;

public record CommandList() implements Command {

    @Override
    public void execute() {
        printCarNumbers(Operations.getCarNumbers());
    }

    private static void printCarNumbers(Set<String> carNumbers) {
        if (carNumbers.isEmpty()) {
            System.out.println("Car number list is empty.");
        } else {
            System.out.println("Car number list: ");
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }
    }
}
