package com.sparta.dr;

import com.sparta.dr.sorters.*;
import com.sparta.dr.start.SortFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class PerformanceTester {
    private int[] unsorterArray;
    private static int[] arrayToSort;
    @BeforeAll
    public static void classSetup(){
        Random random = new Random();
        arrayToSort = new int[100];
        for (int i = 0; i < 100; i++){
            arrayToSort[i] = random.nextInt(1000);
        }
    }
    @BeforeEach
    public void setup(){
        unsorterArray = arrayToSort.clone();
    }

    @Test
    @DisplayName("testBubbleSorter")
    void testBubbleSorter() {
        GenericSorter bubbleSort = new BubbleSort();
        double start = System.nanoTime();
        int[] sortedArray = bubbleSort.sortArray(unsorterArray);
        double end = System.nanoTime();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(end - start);

        
    }

    @Test
    @DisplayName("testQuickSorter")
    void testQuickSorter() {
        GenericSorter quickSort = new QuickSort();
        double start = System.nanoTime();
        int[] sortedArray = quickSort.sortArray(unsorterArray);
        double end = System.nanoTime();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(end - start);

    }

    @Test
    @DisplayName("testInsertionSorter")
    void testInsertionSorter() {
        GenericSorter insertionSort = new InsertionSort();
        double start = System.nanoTime();
        int[] sortedArray = insertionSort.sortArray(unsorterArray);
        double end = System.nanoTime();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(end - start);

    }

    @Test
    @DisplayName("testMergeSorter")
    void testMergeSorter() {
        GenericSorter mergeSort = new MergeSort();
        double start = System.nanoTime();
        int[] sortedArray = mergeSort.sortArray(unsorterArray);
        double end = System.nanoTime();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(end - start);
    }

    @Test
    @DisplayName("testBinarySorter")
    void testBinarySorter() {
        GenericSorter binarySort = new BinarySort();
        double start = System.nanoTime();
        int[] sortedArray = binarySort.sortArray(unsorterArray);
        double end = System.nanoTime();
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(end - start);

    }

}
