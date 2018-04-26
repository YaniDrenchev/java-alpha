package com.compan;

public class Main {

    public static void main(String[] args) {
        Canvas c = new Canvas();

        c.addObject(new Circle("Red", 0, 0, 3));
        c.addObject(new Rectangle("Red", 2, 3, 4, 5 ));
        c.addObject(new Line("Blue", 3));

        c.render();
    }
}
