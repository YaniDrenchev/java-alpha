package com.compan;

public class BinaryTree{
    Node root ;
    public BinaryTree(){
        root = null;
    }
    public Node addRecursive(int val, Node current ){
        if (current == null){
            return new Node(val);
        }
        if (val <= current.val ){
            addRecursive(val, current.leftChild);
        }
        if (val > current.val){
           addRecursive(val, current.rightChild);
        }
        else {
            return current;
        }
        return current;
    }
    public void add(int val){
        addRecursive(val, root);
    }
    public BinaryTree createTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }
    public  void preOrder(Node node){
        if (node == null){
            return;
        }
        preOrder(node.leftChild);
        System.out.println(node);
        preOrder(node.rightChild);
    }
    public void listALL(){
        preOrder(root);
    }
    public Node getLeft(){
     return root.leftChild;
    }
    public Node getRight(){
        return root.rightChild;
    }

}
