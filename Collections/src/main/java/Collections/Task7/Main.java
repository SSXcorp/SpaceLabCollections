package Collections.Task7;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Merge sort
        long startTime = System.nanoTime();
        System.out.println("Merge Sort: ");
        int arr[] = { 9, 3, 1, 5, 13, 12 };
        Sort.mergeSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime() - startTime;
        System.out.println("Execution time: " + endTime + " milliseconds");
        Sort.display(arr);

        //Heap sort
        long startTime2 = System.nanoTime();
        System.out.println("Heap sort: ");
        int arr2[] = { 1, 12, 9 , 3, 10, 15 };
        Sort.heapSort(arr2);
        long endTime2 = System.nanoTime() - startTime2;
        System.out.println("Execution time: " + endTime2 + " milliseconds");
        Sort.display(arr2);

        //Insertion sort
        long startTime3 = System.nanoTime();
        System.out.println("Insertion sort: ");
        int arr3[] = {22, 21, 11, 15, 16};
        Sort.insertionSort(arr3, arr3.length);
        long endTime3 = System.nanoTime() - startTime3;
        System.out.println("Execution time: " + endTime3 + " milliseconds");
        Sort.display(arr3);

        //Selection Sort
        long startTime4 = System.nanoTime();
        System.out.println("Selection Sort: ");
        int arr4[] = {64,25,12,22,11};
        Sort.selectionSort(arr4);
        long endTime4 = System.nanoTime() - startTime4;
        System.out.println("Execution time: " + endTime4 + " milliseconds");
        Sort.display(arr4);

        //Bubble Sort
        long startTime5 = System.nanoTime();
        System.out.println("Bubble Sort: ");
        Sort ob = new Sort();
        int arr5[] = {6, 4, 5, 12, 2, 11, 9};
        Sort.bubbleSort(arr5, arr5.length);
        long endTime5 = System.nanoTime() - startTime5;
        System.out.println("Execution time: " + endTime5 + " milliseconds");
        ob.display(arr5);

    }

    
}
