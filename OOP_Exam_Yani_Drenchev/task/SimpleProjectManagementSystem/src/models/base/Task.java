package models.base;

import models.TicketPriority;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Task extends Item  {

    private Date date;
    private TicketPriority ticketPriority;
    private Date plannedTime;
    private String assignee;

    public Task(String title, String description, Date date,
                TicketPriority ticketPriority,
                Date plannedTime, String assignee) {
        super(title, description);

        this.date = date;
        this.ticketPriority = ticketPriority;
        this.plannedTime = plannedTime;
        this.assignee = assignee;
    }

    public Date getDate() {
        return date;
    }

    public TicketPriority getTicketPriority() {
        return ticketPriority;
    }

    public String getDescription() {
        return super.getDescription();
    }

    public String getTitle() {
        return super.getTitle();
    }

    public Date getPlannedTime() {
        return plannedTime;
    }

    public String getAssignee() {
        return assignee;
    }
    @Override
    public String toString() {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        return " Title:  " + super.getTitle() + " Description: " + super.getDescription()
                + " Date: " + format.format(date)
                + " Ticket Priority: " + ticketPriority + "Planned date: "
                + plannedTime + "Assignee: " + assignee;
    }
}
