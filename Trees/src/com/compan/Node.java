package com.compan;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Node> children = new ArrayList<Node>();
    Node leftChild = null;
    Node rightChild = null;
    int val = 0;

    public Node(int data){
        this.val = data;
        leftChild = null;
        rightChild = null;
    }

    public List<Node> getChildren(){
        return children;
    }
    public void setChildren(Node child){
        this.children.add(child);
    }


    public void setVal(int val) {
        this.val = val;
    }
    public Boolean isLeaf(){
        return this.children.size() == 0;
    }

    @Override
    public String toString() {
        return "the vlaue is" + this.val;
    }
}
