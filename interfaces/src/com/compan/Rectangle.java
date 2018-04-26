package com.compan;

public class Rectangle extends GraphicalObject {
    private Point topLeftCorner;
    private double width, height;



    public Rectangle(String color, double x , double y, double width, double height) {
        super(color);
        this.topLeftCorner = new Point(x ,y);
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return String.format("%s rectangle with top left corner %s, and dimensions (%.2f, %.2f)",
                getColor(), topLeftCorner, width,height);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
