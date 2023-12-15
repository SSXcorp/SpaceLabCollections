package Collections.Task6.Comparable;

import java.util.Comparator;

public class User implements Comparable<User>{
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

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.personalNumber, other.personalNumber);
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
