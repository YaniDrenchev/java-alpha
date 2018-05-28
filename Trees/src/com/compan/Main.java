package com.compan;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree test = new BinarySearchTree(10);
        test.insert(5);
        test.insert(11);
        test.insert(17);

        System.out.println(test.rightChild);
        System.out.println(test.search(17));
        System.out.println(test.getMax());
    }
}
