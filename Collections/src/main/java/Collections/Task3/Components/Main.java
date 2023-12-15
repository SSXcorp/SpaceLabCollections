package Collections.Task3.Components;

import Collections.Task3.Commands.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Car parking program");

        while (true) {
            System.out.println("Enter your command: ");
            operations.setCommand(checkCommand(scanner));
            operations.executeCommand();
        }


    }

    public static Command checkCommand(Scanner scanner) {
        String s = scanner.nextLine();
        if (s.equalsIgnoreCase("СПИСОК")) {
            return new CommandList();
        }
        else if (s.equalsIgnoreCase("СТОП")) {
            return new CommandSTOP();
        }
        return new CommandAddNumber();
    }
}
