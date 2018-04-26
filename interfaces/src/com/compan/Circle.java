package com.compan;

public class Circle extends GraphicalObject implements Location {
    private Point center;
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color);
        this.center = new Point(x, y);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return String.format("%s circle with center %s and radius % .2f", getColor(), center, radius);
    }
    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String locate() {
        return center.toString();
    }
}
