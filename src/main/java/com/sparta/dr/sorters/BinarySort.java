package com.sparta.dr.sorters;


import com.sparta.dr.logging.Logging;
import com.sparta.dr.sorters.binaryTree.BinaryTree;
import com.sparta.dr.sorters.binaryTree.BinaryTreeImpl;

public class BinarySort implements GenericSorter {
    public static Logging logging = Logging.setupLogger();
    @Override
    public int[] sortArray(int[] array) {
        logging.logger.info("Binary Sort Has Started");
        BinaryTree tree = new BinaryTreeImpl(array[0]);
        for (int i = 1; i < array.length; i++) {
            tree.addElement(array[i]);
        }
        return tree.getSortedTreeAsc();
    }

    @Override
    public String getName() {
        return "Binary Sort";
    }
}
