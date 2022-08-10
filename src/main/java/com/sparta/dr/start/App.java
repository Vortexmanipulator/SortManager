package com.sparta.dr.start;

import com.sparta.dr.display.DisplayManager;
import com.sparta.dr.sorters.QuickSort;

import java.awt.geom.QuadCurve2D;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] array = {2,1,23,13,45,5,4,6,7,8,24};
//        DisplayManager.userInputOutput();
//        System.out.println(Arrays.toString(array));
        QuickSort.quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array);
    }
}
