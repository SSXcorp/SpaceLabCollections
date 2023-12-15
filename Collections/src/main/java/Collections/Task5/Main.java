package Collections.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10_000_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполнение списка случайными числами
        fillListRandomly(arrayList, SIZE);
        fillListRandomly(linkedList, SIZE);

        // Измерение времени для операций ArrayList
        measureTime("ArrayList: Добавление в конец", () -> addEnd(arrayList, SIZE));
        measureTime("ArrayList: Добавление в первую половину", () -> addFirstHalf(arrayList, SIZE));
        measureTime("ArrayList: Получение из конца", () -> getEnd(arrayList));
        measureTime("ArrayList: Получение из первой половины", () -> getFirstHalf(arrayList));
        measureTime("ArrayList: Удаление из конца", () -> removeEnd(arrayList));
        measureTime("ArrayList: Удаление из первой половины", () -> removeFirstHalf(arrayList));

        // Измерение времени для операций LinkedList
        measureTime("LinkedList: Добавление в конец", () -> addEnd(linkedList, SIZE));
        measureTime("LinkedList: Добавление в первую половину", () -> addFirstHalf(linkedList, SIZE));
        measureTime("LinkedList: Получение из конца", () -> getEnd(linkedList));
        measureTime("LinkedList: Получение из первой половины", () -> getFirstHalf(linkedList));
        measureTime("LinkedList: Удаление из конца", () -> removeEnd(linkedList));
        measureTime("LinkedList: Удаление из первой половины", () -> removeFirstHalf(linkedList));
    }

    private static void fillListRandomly(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt()+i*i);
        }
    }

    private static void addEnd(List<Integer> list, int size) {
        list.add(size + 1);
    }

    private static void addFirstHalf(List<Integer> list, int size) {
        list.add(size / 2, size + 1);
    }

    private static void getEnd(List<Integer> list) {
        int lastElement = list.get(list.size() - 1);
    }

    private static void getFirstHalf(List<Integer> list) {
        int firstHalfElement = list.get(list.size() / 2);
    }

    private static void removeEnd(List<Integer> list) {
        list.remove(list.size() - 1);
    }

    private static void removeFirstHalf(List<Integer> list) {
        list.remove(list.size() / 2);
    }

    private static void measureTime(String operation, Runnable runnable) {
        long startTime = System.currentTimeMillis();
        runnable.run();
        long endTime = System.currentTimeMillis();
        System.out.println(operation + ": " + (endTime - startTime) + " мс");
    }
}

