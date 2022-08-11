package com.sparta.dr.sorters;

import com.sparta.dr.sorters.binaryTree.BinaryTree;
import com.sparta.dr.sorters.binaryTree.BinaryTreeImpl;

public class BinarySort implements GenericSorter {

    @Override
    public int[] sortArray(int[] array) {
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
