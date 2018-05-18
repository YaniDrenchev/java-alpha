package models.base;

import models.TodoState;

import java.util.ArrayList;
import java.util.List;

public class TODO extends Item {
    private TodoState todoState;
    private static ArrayList<TODO> allTODOS = new ArrayList<>();
    public TODO(String title, String description, TodoState todoState) {
        super(title, description);
        this.todoState = todoState;
        allTODOS.add(this);
    }

    public String getDescription() {
        return super.getDescription();
    }

    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public String toString() {
        return " Title: " + super.getTitle() + " Description: " + super.getDescription()
                + " Todo State: " + todoState;
    }
    public void changeState(TodoState state){
        todoState = state;
    }

    public static ArrayList<TODO> getAllTODOS() {
        return allTODOS;
    }

    public TodoState getTodoState() {
        return todoState;
    }
}
