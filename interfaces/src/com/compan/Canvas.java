package com.compan;

import java.util.ArrayList;

public class Canvas {
    private ArrayList<GraphicalObject> object;


    public Canvas() {
        object = new ArrayList<>();
    }

    public void addObject(GraphicalObject object){
        this.object.add(object);
    }
    public void render(){
        for (int i = 0; i < object.size(); i++) {
            System.out.println(object.get(i).toString());
        }
    }
}
