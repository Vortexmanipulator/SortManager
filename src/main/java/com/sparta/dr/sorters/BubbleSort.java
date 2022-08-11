package com.sparta.dr.sorters;

import java.util.logging.Logger;

public class BubbleSort implements GenericSorter {
    private static Logger logger = Logger.getLogger("hello");

    public int[] sortArray(int[] array) {

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
//        logger.log(Level.INFO, "temp is " +temp);
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }

}
