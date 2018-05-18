package com.compan;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Node> children = new ArrayList<Node>();
    Node parrent = null;
    int val = 0;

    public Node(int data){
        this.val = data;
    }
    public Node(int data, Node parrent){
        this.val = data;
        this.parrent = parrent;
    }
    public List<Node> getChildren(){
        return children;
    }
    public void addChild(int data){
        Node child = new Node(data);
        child.setParrent(this);
    }
    public void setChildren(Node child){
        this.children.add(child);
    }
    public void setParrent(Node parrent){
        parrent.setChildren(this);
        this.parrent = this;
    }
}
