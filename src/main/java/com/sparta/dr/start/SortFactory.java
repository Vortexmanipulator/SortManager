package com.sparta.dr.start;


import com.sparta.dr.exceptions.SorterLoaderException;
import com.sparta.dr.sorters.*;


public class SortFactory {

    public static GenericSorter getSorter(int choiceOfSorter) throws SorterLoaderException {
        GenericSorter result;
        switch (choiceOfSorter) {
            case 1:
//                System.out.println("you've chosen Binary Sort");
                result = new BinarySort();
                break;
            case 2:
//                System.out.println("You've chosen Bubble Sort");
                result = new BubbleSort();
                break;

            case 3:
//                System.out.println("You've chosen Insertion Sort");
                result = new InsertionSort();
                break;
            case 4:
//                System.out.println("You've chosen Merge Sort");
                result = new MergeSort();
                break;
            case 5:
//                System.out.println("You've chosen Quick Sort");
                result = new QuickSort();
                break;
            default:
                throw new SorterLoaderException();
        }
        return result;
    }

}
