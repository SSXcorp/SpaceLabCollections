package Collections.Task2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarNumbersOperations adder = new CarNumbersOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Car parking program: ");

        while (true) {
            String carNumber = adder.enterCarNumber(scanner);
            if (carNumber.equalsIgnoreCase("СПИСОК")) {
                continue;
            }
            if (carNumber.equalsIgnoreCase("СТОП")) {
                scanner.close();
                break;
            }
            System.out.println("Enter the car number position: ");
            String positionInput = scanner.nextLine();
            adder.addCarNumber(carNumber, positionInput);
        }

        System.out.println("The program was finished successfully!");

    }

}
