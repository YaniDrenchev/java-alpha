package models.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private static List<Item> allTickets = new ArrayList<>();
    private static List<Item> allTasks = new ArrayList<>();
    private static List<Item> allTodos = new ArrayList<>();
    private static List<Item> allItems = new ArrayList<>();

    public static void addTicket(Ticket ticket){
        allTickets.add(ticket);
        allItems.add(ticket);
    }

    public static List<Item> getAllTickets() {
        return allTickets;
    }
    public static void addTask(Task task){
        allTasks.add(task);
        allItems.add(task);
    }
    public static List<Item> getAllTasks() {
        return allTasks;
    }
    public static void addTodo(TODO todo){
        allTasks.add(todo);
        allItems.add(todo);
    }

    public static List<Item> getAllTodos() {
        return allTodos;
    }

    public static List<Item> getAllItems() {
        return allItems;
    }
}
