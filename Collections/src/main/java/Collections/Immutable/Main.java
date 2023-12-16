package Collections.Immutable;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating an object of mutable list
        List<String> mutableListOfSports = new ArrayList<String>();
        mutableListOfSports.add("Hello1");
        mutableListOfSports.add("World1");

        // Creating an object of mutable Set
        Set<String> mutableSetOfData = new HashSet<String>();
        mutableSetOfData.add("Hello1");
        mutableSetOfData.add("World1");

        // Creating an object of mutable Set
        Map<Integer, String> mutableMapOfSports = new HashMap<Integer, String>();
        mutableMapOfSports.put(1, "Hello");
        mutableMapOfSports.put(2, "World");

        // Creating an immutable ArrayList from mutable ArrayList
        List<String> immutableListOfSports = List.copyOf(mutableListOfSports);

        // Creating an immutable HashSet from mutable HashSet
        Set<String> immutableSetOfData = Set.copyOf(mutableSetOfData);

        // Creating an immutable HashMap from mutable HashMap
        Map<Integer, String> immutableMapOfSports = Map.copyOf(mutableMapOfSports);

        // Creating an immutable List from mutable ArrayList using Stream | Collectors
        List<String> immutableList = mutableListOfSports.stream().collect(Collectors.toCollection(List::of));

        // Creating an immutable ArrayList OLD WAY
        Collection a = Collections.unmodifiableList(new ArrayList<>());
    }
}
