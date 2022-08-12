package com.sparta.dr.sorters;

import com.sparta.dr.logging.Logging;

import java.util.logging.Logger;

public class BubbleSort implements GenericSorter {
    private static Logging logging = Logging.setupLogger();
    public int[] sortArray(int[] array) {
        logging.logger.info("Bubble Sort Has Started");
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
