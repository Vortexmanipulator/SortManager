package com.sparta.dr.display;

import com.sparta.dr.sorters.BinarySort;

import java.util.Scanner;

public class DisplayManager {
    public static void userInputOutput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the sorter you would like to use");
        System.out.println("1. Binary sort \n2. BubbleSort \n3. InsertionSort \n4. MergeSort \n5. QuickSort");
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int n = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("you've chosen Binary Sort");
                break;
            case 2:
                System.out.println("You've chosen Bubble Sort");
                break;
            case 3:
                System.out.println("You've chosen Insertion Sort");
                break;
            case 4:
                System.out.println("You've chosen Merge Sort");
                break;
            case 5:
                System.out.println("You've chosen Quick Sort");
                break;

        }

    }
}
