package Collections.Task6.Comparator;

import java.util.Comparator;

public class SortByAge implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return user1.getAge() - user2.getAge();
    }
}
