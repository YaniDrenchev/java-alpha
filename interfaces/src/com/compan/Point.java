package com.compan;

public class Point implements Location {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    @Override
    public String toString(){
        return String.format("(%.2f, %.2f)", x, y);
    }

    @Override
    public String locate() {
        return this.toString();
    }
}
