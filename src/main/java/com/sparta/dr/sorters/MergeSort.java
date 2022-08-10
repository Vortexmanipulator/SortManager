package com.sparta.dr.sorters;

public class MergeSort {

    public static void mergeSort(int[] randArray){
        int inputLength = randArray.length;

        if(inputLength < 2) {
            return;
        }
        int midIndex = inputLength /2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int [inputLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = randArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = randArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(randArray, leftHalf, rightHalf);

    }
    private static void merge(int[] randArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                randArray[k] = leftHalf[i];
                i++;
            }
            else {
                randArray[k] = rightHalf[j];
            }
            k++;
        }
            while(i < leftSize){
                randArray[k] = leftHalf[i];
                i++;
                k++;
            }
            while(j < rightSize){
                randArray[k] = rightHalf[j];
                j++;
                k++;
            }
    }

}
