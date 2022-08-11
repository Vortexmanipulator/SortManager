package com.sparta.dr.sorters;

public class InsertionSort implements GenericSorter {

    public int[] sortArray(int[] randArray){

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
