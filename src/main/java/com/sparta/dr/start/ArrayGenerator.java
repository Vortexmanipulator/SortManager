package com.sparta.dr.start;

import java.util.Random;

public class ArrayGenerator {
    public static int[] randomArrayGenerator(int input){

        Random rand = new Random();
        int[] randArray = new int[input];
        for (int i = 0; i < input; i++) {
            randArray[i] = rand.nextInt(input);
        }
        return randArray;
    }

}
