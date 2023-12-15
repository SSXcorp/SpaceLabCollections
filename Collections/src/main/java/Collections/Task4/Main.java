package Collections.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> carOwners = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для учета автомобилей на парковке. Введите гос номер или введите 'СТОП' для завершения.");

        while (true) {
            System.out.println("Выберите команду или напишите номер авто: ");
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
                System.out.println("Введите владельца автомобиля: ");
                String owner = scanner.nextLine();
                addCarAndOwner(carOwners, input, owner);
            }
        }

        System.out.println("Работа программы завершена.");
    }

    private static void addCarAndOwner(Map<String, String> carOwners, String carNumber, String owner) {
        carOwners.put(carNumber, owner);
        System.out.println("Автомобиль добавлен в список: " + carNumber + ", Владелец: " + owner);
    }

    private static void printCarOwners(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Список гос номеров автомобилей пуст.");
        } else {
            System.out.println("Список гос номеров автомобилей и их владельцев:");
            for (Map.Entry<String, String> entry : carOwners.entrySet()) {
                System.out.println("Гос номер: " + entry.getKey() + ", Владелец: " + entry.getValue());
            }
        }
    }

    private static void printCarNumbers(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Список гос номеров автомобилей пуст.");
        }
        else {
            System.out.println("Список гос номеров автомобилей:");
            for (String carNumber : carOwners.keySet()) {
                System.out.println(carNumber);
            }
        }
    }

    private static void printOwners(Map<String, String> carOwners) {
        if (carOwners.isEmpty()) {
            System.out.println("Список владельцев автомобилей пуст.");
        }
        else {
            System.out.println("Список владельцев автомобилей:");
            for (String owner : carOwners.values()) {
                System.out.println(owner);
            }
        }
    }


}
