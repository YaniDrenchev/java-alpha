import base.CommandParser;
import base.ProjectManagementSystem;
import models.TicketPriority;
import models.base.Data;
import models.base.Item;
import models.base.Ticket;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CommandParserImpl parser = new CommandParserImpl();
        ProjectManagementSystem system = new ProjectManagementSystemImpl();
        Application app = new Application(parser, system);
        app.run();
    }
}
