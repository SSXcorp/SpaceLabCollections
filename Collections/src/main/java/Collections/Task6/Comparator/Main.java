package Collections.Task6.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(102, "John", "Doe", 41));
        users.add(new User(105, "Alice", "Smith", 22));
        users.add(new User(101, "Bob", "Johnson", 35));
        users.add(new User(104, "Eve", "Jones", 33));
        users.add(new User(103, "Charlie", "Brown", 32));
        users.add(new User(107, "Grace", "Taylor", 47));
        users.add(new User(106, "David", "Williams", 12));
        users.add(new User(109, "Sophia", "Miller", 47));
        users.add(new User(108, "Michael", "Anderson", 33));
        users.add(new User(110, "Olivia", "Davis", 29));

        System.out.println("Коллекция до сортировки:");
        for (User user : users) {
            System.out.println(user);
        }

        Collections.sort(users, new SortByPersonalNumber());

        System.out.println("\nКоллекция после сортировки по персональному номеру:");
        for (User user : users) {
            System.out.println(user);
        }


        Collections.sort(users, User.ageComparator);
        Collections.sort(users, new SortByAge());

        System.out.println("\nКоллекция после сортировки по возрасту:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
