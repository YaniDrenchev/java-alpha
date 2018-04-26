package com.compan;

public class Line extends GraphicalObject {
    private int weight;

    public Line(String color, int weight) {
        super(color);
        this.weight = weight;
    }

    @Override
    public String toString(){
        return String.format("%s is line with weight %n", getColor(), weight);
    }
    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
