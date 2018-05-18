package models.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import models.TicketPriority;
public class Ticket extends Item {

    private Date date;
    private TicketPriority ticketPriority;
    private String sender;
    private String owner;
    public Ticket(String title, String description, Date date,
                  TicketPriority ticketPriority,
                  String sender, String owner) {
        super(title, description);

        this.date = date;
        this.ticketPriority = ticketPriority;
        this.sender = sender;
        this.owner = owner;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getDescription() {
        return super.getDescription();
    }

    public Date getDate() {
        return  null;
    }

    public String getOwner() {
        return owner;
    }

    public String getSender() {
        return sender;
    }

    public TicketPriority getTicketPriority() {
        return ticketPriority;
    }
    @Override
    public String toString() {
        DateFormat ticketFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        return "Title: " + super.getTitle()+ " Description: " + super.getDescription() + " Date:" + ticketFormat.format(date)
                + " Ticket Priority: " + ticketPriority + " Sender: " + sender + " Owner: " + owner;
    }
}
