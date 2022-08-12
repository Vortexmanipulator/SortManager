package com.sparta.dr.display;


import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {

    static Scanner scanner = new Scanner(System.in);
    public int getSorter(){

        System.out.println("Enter the number of the sorter you would like to use");
        System.out.println("1. Binary sort \n2. BubbleSort \n3. InsertionSort \n4. MergeSort \n5. QuickSort");
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        return input;

    }


    public static int getArrayLength(){
        System.out.println("What would you like the list size to be?");
        int input;
        do{
            input = scanner.nextInt();
            if(input < 0){
                System.out.println("Invalid number entered, please enter something greater than 0");
            }
        }while (input < 0);
        return input;
    }


    public void choiceMade(String name){
        System.out.println("You have chosen: "+ name);
    }

    public void arrayBefore(int[] array) {
        System.out.println("Array before sort: "+ Arrays.toString(array));
    }
    public void arrayAfter(int[] array){
        System.out.println("Array after sort: "+Arrays.toString(array));
    }

    public void dealWithException(Throwable e){
        System.err.println(e);
    }
    public void timeTaken(double totalTime){
        System.out.println("The time taken to sort in milliseconds: "+ totalTime);
    }

}
