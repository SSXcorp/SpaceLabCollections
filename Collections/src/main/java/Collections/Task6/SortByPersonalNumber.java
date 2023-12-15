package Collections.Task6;

import java.util.Comparator;

public class SortByPersonalNumber implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.getPersonalNumber() - user2.getPersonalNumber();
    }
}
