package com.compan;



public class Main {

    public static void main(String[] args) {
       BinaryTree bt = new BinaryTree();
       bt = bt.createTree();
       bt.root = new Node(10);
       bt.listALL();
        System.out.println(bt.getLeft());
    }





}
