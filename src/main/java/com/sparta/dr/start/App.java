package com.sparta.dr.start;

import com.sparta.dr.display.DisplayManager;
import com.sparta.dr.exceptions.SorterLoaderException;
import com.sparta.dr.logging.Logging;
import com.sparta.dr.sorters.BubbleSort;
import com.sparta.dr.sorters.InsertionSort;
import com.sparta.dr.sorters.MergeSort;
import com.sparta.dr.sorters.QuickSort;
import com.sparta.dr.sorters.binaryTree.BinaryTree;
import com.sparta.dr.sorters.binaryTree.BinaryTreeImpl;

import java.awt.geom.QuadCurve2D;
import java.util.Arrays;
import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger("mainLogger");
    public static void main(String[] args) {
        Logging.setupLogger();

        Logging.logger.info("Booting Display-Manager");

        DisplayManager displayManager = new DisplayManager();
        Controller controller = new Controller(displayManager);

        try {
            controller.runController();
        }catch(SorterLoaderException e){
           displayManager.dealWithException(e);
        }

    }
}
