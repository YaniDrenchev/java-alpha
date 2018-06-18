package com.company;

import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Node> children = new ArrayList<>();
    Node parent;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node parent) {
        this.data = data;
        this.parent = parent;
    }


    public void addChild(Node child) {

        child.parent = this;
        this.children.add(child);
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }

    @Override
    public String toString() {
        return String.format("%d, ", data);
    }
}
