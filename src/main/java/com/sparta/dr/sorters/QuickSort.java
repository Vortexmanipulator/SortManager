package com.sparta.dr.sorters;

public class QuickSort implements GenericSorter {
    public static void quickSort(int[] randArray, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = randArray[highIndex];

        int leftPointer = lowIndex; //9
        int rightPointer = highIndex; // 9

        while (leftPointer < rightPointer){
            while (randArray[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (randArray[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(randArray, leftPointer, rightPointer);
        }
        swap(randArray, leftPointer, highIndex);

        quickSort(randArray, lowIndex, leftPointer-1);
        quickSort(randArray, leftPointer+1, highIndex);
    }
    private static void swap(int[] randArray, int index1, int index2){
        int temp = randArray[index1];
        randArray[index1] = randArray[index2];
        randArray[index2] = temp;
    }

    @Override
    public int[] sortArray(int[] array) {
        quickSort(array,0, array.length-1);
        return array;
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }
}
