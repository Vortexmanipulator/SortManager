package com.sparta.dr.sorters.binaryTree;

import com.sparta.dr.exceptions.ChildNotFoundException;
import com.sparta.dr.logging.Logging;

import java.io.IOException;
import java.util.logging.*;


public class BinaryTreeImpl implements BinaryTree{
    private final Node rootNode;
    private int nodeCount = 1;
    private static Logger logger = Logger.getLogger("hello");
    public static Logging logging = Logging.setupLogger();




    public BinaryTreeImpl(int elements) {
        rootNode = new Node(elements);

    }
    private int i = 0;

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {

        return nodeCount;
    }

    @Override
    public void addElement(int element) {

        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++){
            addNodeToTree(rootNode, elements[i]);
        }
    }

    public boolean findElement(int element){
        Node node = findNode(element);
        if(node != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getLeftChild().getValue();

    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        return node.getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {
        int i = 0;
        int[] sortedArray = new int[getNumberOfElements()];
        return returnAscendingTree(sortedArray, rootNode);

    }



    @Override
    public int[] getSortedTreeDesc() {
        i = 0;
        int[] sortedArray = new int[getNumberOfElements()];
        return returnDescendingTree(sortedArray, rootNode);
    }



    private void addNodeToTree(Node node, int element){
        if(element < node.getValue()){
            if(node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
                nodeCount++;
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if(node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
                nodeCount++;
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if(element == node.getValue()){
                return node;
            }if (element < node.getValue()){
                node = node.getLeftChild();
            } else if (element > node.getValue()){
                node = node.getRightChild();
            }
        }
        return null;
    }

    private int[] returnAscendingTree(int[] sortedArray, Node node) {
        if (!node.isLeftChildEmpty()) {
            returnAscendingTree(sortedArray, node.getLeftChild());
        }
        sortedArray[i++] = node.getValue();
        if (!node.isRightChildEmpty()) {
            returnAscendingTree(sortedArray, node.getRightChild());
        }
        return sortedArray;
    }

    private int[] returnDescendingTree(int[] sortedArray, Node node) {

        if (!node.isRightChildEmpty()) {
            returnDescendingTree(sortedArray, node.getRightChild());
        }
        sortedArray[i++] = node.getValue();
        if (!node.isLeftChildEmpty()) {
            returnDescendingTree(sortedArray, node.getLeftChild());
        }
        return sortedArray;
    }


}
