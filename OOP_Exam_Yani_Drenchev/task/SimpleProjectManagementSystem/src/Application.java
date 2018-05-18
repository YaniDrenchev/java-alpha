import base.ProjectManagementSystem;
import commands.Command;
import commands.CommandType;
import models.TicketPriority;
import models.TodoState;
import models.base.Item;
import models.base.TODO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Application {
    private static final String EXIT_STATE = "EXIT";
    private final CommandParserImpl commandParser;
    ProjectManagementSystem system;

    public Application(CommandParserImpl commandParser, ProjectManagementSystem system) {
        this.system = system;
        this.commandParser = commandParser;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String commandString = in.nextLine();
            Command command = this.commandParser.parseCommand(commandString);

            if (command.getCommandType() == CommandType.EXIT) {
                break;
            }

            switch (command.getCommandType()) {
                case ADD_TODO:
                    String title = command.getParams()[0];
                    String description = command.getParams()[1];
                    TodoState state = TodoState.fromName(command.getParams()[2]);
                    system.addTodo(title, description, state);
                    break;
                case ADD_TASK:
                    DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    String TaskTitle = command.getParams()[0];
                    String TaskDescription = command.getParams()[1];
                    Date TaskDate = null;
                    try {
                        TaskDate = format.parse(command.getParams()[2]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    TicketPriority taskPriority = TicketPriority.fromName(command.getParams()[3]);
                    Date PlannedDate = null;
                    try {
                      PlannedDate =format.parse(command.getParams()[4]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String assignee = command.getParams()[5];
                    system.addTask(TaskTitle, TaskDescription, TaskDate, taskPriority, PlannedDate, assignee);
                    break;
                case ADD_TICKET:
                    DateFormat ticketFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
                    String TicketTitle = command.getParams()[0];
                    String TicketDescription = command.getParams()[1];
                    Date TicketDate = null;
                    try {
                        TicketDate = ticketFormat.parse(command.getParams()[2]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    TicketPriority ticketPriority = TicketPriority.fromName(command.getParams()[3]);

                    String sender = command.getParams()[4];
                    String owner = command.getParams()[5];
                    system.addTicket(TicketTitle, TicketDescription, TicketDate,
                            ticketPriority, sender, owner);
                    break;
                case LIST_ALL:
                    List<Item> list =system.listAll();
                    Collections.sort(list);
                    for (Item aList : list) {
                        System.out.println(aList);
                    }
                    break;
                case LIST_TASKS:
                    List<Item> listTask =system.listTasks();
                    Collections.sort(listTask);
                    for (Item aListTask : listTask) {
                        System.out.println(aListTask);
                    }
                    break;
                case LIST_TODOS:
                    List<Item> listTODOS =system.listTodos();
                    Collections.sort(listTODOS);
                    for (Item listTODO : listTODOS) {
                        System.out.println(listTODO);
                    }
                    break;
                case UPDATE_TODO:
                    String titleTODO = command.getParams()[0];
                    String stateTODO = command.getParams()[1];
                    system.changeTodoState(titleTODO, stateTODO);
                    break;
                case LIST_TICKETS:
                    List<Item> listTickets =system.listTickets();
                    Collections.sort(listTickets);
                    System.out.println(listTickets);
                    break;
                case LIST_TODOS_NOT_DONE:
                    ArrayList<TODO> listOfTODOS = TODO.getAllTODOS();
                    Collections.sort(listOfTODOS);
                    for (TODO listOfTODO : listOfTODOS) {
                        if (listOfTODO.getTodoState().equals(TodoState.NOT_DONE)) {
                            System.out.println(listOfTODO);
                        }
                    }
                    break;
                case SEARCH_BY_KEY_WORD:
                    String pattern = command.getParams()[0];
                    List<Item> foundedItems = system.searchByTitleOrDescription(pattern);
                    Collections.sort(foundedItems);
                    for (int i = 0; i < foundedItems.size(); i++) {
                        System.out.println(foundedItems.get(i));
                    }
            }
        }
    }
}
