package com.compan;

public class BinarySearchTree {
    int value;
    BinarySearchTree leftChild;
    BinarySearchTree rightChild;
    BinarySearchTree(int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    public BinarySearchTree insert(int val){
        if (val<= this.value){
            if (leftChild != null){
                return leftChild.insert(val);
            }
            leftChild = new BinarySearchTree(val);
            return leftChild;
        }
        else {
            if (rightChild!=null){
                rightChild.insert(val);
            }
            rightChild = new BinarySearchTree(val);
            return rightChild;
        }
    }
    public void traverse(){
        if (leftChild != null){
            leftChild.traverse();
        }
        System.out.println(this.value);
        if (rightChild != null){
            rightChild.traverse();
        }
    }

    public BinarySearchTree search(int value){
        if (this.value == value){
            return this;
        }
        if (this.value >= value && leftChild != null){
           return leftChild.search(value);
        }else if (this.value < value && rightChild!=null){
            return rightChild.search(value);
        }
        return null ;
    }
    public BinarySearchTree getMax(){
        if (rightChild!= null){
            return rightChild.getMax();
        }
        return this;
    }
    @Override
    public String toString() {
        return "val: " + value;
    }
}
