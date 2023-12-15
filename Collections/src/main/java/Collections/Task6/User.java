package Collections.Task6;

import java.util.Comparator;

class User {



    private int personalNumber;
    private String firstName;
    private String lastName;
    private int age;

    public User(int personalNumber, String firstName, String lastName, int age) {
        this.personalNumber = personalNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }
    public static Comparator<User> ageComparator = Comparator.comparingInt(User::getAge);

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "personalNumber=" + personalNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
