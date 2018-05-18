import base.ProjectManagementSystem;
import models.TicketPriority;
import models.TodoState;
import models.base.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProjectManagementSystemImpl implements ProjectManagementSystem {
    @Override
    public void addTicket(String title, String description, Date date,
                          TicketPriority priority,
                          String sender, String owner) {
        Ticket tick = new Ticket(title, description, date, priority, sender, owner);
        Data.addTicket(tick);
    }

    @Override
    public void addTodo(String title, String description, TodoState state) {
        TODO todo = new TODO(title, description, state);
        Data.addTodo(todo);
    }

    @Override
    public void addTask(String title, String description, Date dueDate,
                        TicketPriority priority, Date plannedTime, String assignee) {
        Task task = new Task(title, description, dueDate, priority, plannedTime,assignee);
        Data.addTask(task);
    }

    @Override
    public List<Item> listAll() {
        return Data.getAllItems();
    }

    @Override
    public List<Item> listTickets() {
        return Data.getAllTickets();
    }

    @Override
    public List<Item> listTodos() {
        return Data.getAllTodos();
    }

    @Override
    public List<Item> listTodos(TodoState state) {
        return null;
    }

    @Override
    public List<Item> listTasks() {
        return Data.getAllTasks();
    }

    @Override
    public List<Item> searchByTitleOrDescription(String pattern) {
        List<Item> allItems = Data.getAllItems();
        List<Item> matchedItems = new ArrayList<>();
        Pattern pattern1 = Pattern.compile(pattern);
        for (Item allItem : allItems) {
            Matcher m = pattern1.matcher(allItem.getTitle());
            if (m.find()) {
                matchedItems.add(allItem);
            }
        }
        for (int i = 0; i < allItems.size() ; i++) {
            Matcher m = pattern1.matcher(allItems.get(i).getDescription());
            if (m.find()){
                matchedItems.add(allItems.get(i));
            }
        }
        return matchedItems;
    }

    @Override
    public void changeTodoState(String title, String state) {
        ArrayList<TODO> alltodos = TODO.getAllTODOS();
        for (TODO alltodo : alltodos) {
            if (title.equals(alltodo.getTitle())) {
                alltodo.changeState(TodoState.fromName(state));
            }
        }
    }
}
