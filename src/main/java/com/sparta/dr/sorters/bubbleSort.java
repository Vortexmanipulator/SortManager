package com.sparta.dr.sorters;

public class bubbleSort {
    static int[] arraySort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        return array;
    }
    private static void swap(int[] array, int j) {
        int temp;
        temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
}
