package com.sparta.dr.sorters;

import com.sparta.dr.logging.Logging;

public class InsertionSort implements GenericSorter {
    private static Logging logging = Logging.setupLogger();
    public int[] sortArray(int[] randArray){

        logging.logger.info("Insertion Sort Has Started");

        for (int i = 1; i <= randArray.length-1; i++) {
            int currentValue = randArray[i];

            int j = i - 1;

            while(j >= 0 && randArray[j] > currentValue){
               randArray[j+1] = randArray[j];
               j--;
            }
            randArray[j + 1] = currentValue;
        }

        return randArray;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
