/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nolinearstructures.tree;

import java.util.function.Consumer;

/**
 *
 * @author arlese.rodriguezp
 */
public class BinaryTreeNode {
// package visible data members

    Object element;
    BinaryTreeNode leftChild; // left subtree
    BinaryTreeNode rightChild; // right subtree

    // constructors
    public BinaryTreeNode() {
    }

    public BinaryTreeNode(Object theElement) {
        element = theElement;
    }

    public BinaryTreeNode(Object theElement,
            BinaryTreeNode theleftChild,
            BinaryTreeNode therightChild) {
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
    }

    // output method
    @Override
    public String toString() {
        return element.toString();
    }

    public void printNode() {
        System.out.print(this.toString() + " ");
    }

    public void addOne(ContNodos counter) {
        counter.addOne();
    }
}
