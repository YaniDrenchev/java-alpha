# Project management system

Implement a simple project management system

You application should support the following oparations:

- Add a ticket
  - Each ticket has a title, description, due date, priority, sender and owner
    - title, description, sender and owner are strings
    - due date is a real date
    - priorities can be either High Priority or Low Priority
- Add a task
  - Each task has a title, description, due date, priority, planned time and assignee
    - title, description and assignee are strings
    - due date is a real date
    - priorities can be either High Priority or Low Priority
- Add a TODO
  - Each TODO has title, description and state
    - title and description are strings
    - state is either Done or Not done 
- List all
  - List all tickets, tasks and TODOs
    - sorted by title

- List tickets
  - List only the tickets
    - sorted by title
- List tasks
  - List only the tasks
    - sorted by title
- List TODOs
  - List only the TODOs
    - sorted by title
- List TODOs that are not done
  - List only the TODOs that are not done
    - sorted by title
- Search by title or descrioption
  - List all tasks, tickets and TODOs that contain the searched text in their title or description 
    - sorted by title
- Change the state of a TODO
  - Think of how to identify different TODOs 

- All list and search commands should print human readable output


Use and extend the project provided:
  - You can create any number of classes, interfaces, enums, etc...
  - You can edit the provided classes, interfaces and enums only where they are marked with "// TODO: ..."

# Task 1

1. Create the classes, Todo, Ticket and Task
2. Implement the ProjectManagementSystemImpl class

# Task 2

Abstract the work with data into a Data class
- Use an interface that is injected into the ProjectManagementSystemImpl's constructor

# Task 3

Fix all bugs

_Hint_: Getting the params of a command
- Here you can change all code you want, but only if it fixes a bug


# Task 4

- Briefly list all you've done
  - Example:
  
    ```
    Created Todo, Ticket, Task classes
    Fixed bug in file FILE_NAME on line LINE_NUMBER
    ```

# General requirements

- Use good practices for Object-oriented design
- Use StreamingAPI where applicable
- Use validation on the Todo, Ticket and Task classes
  - Simple validation, like string length, past date, not nulll, etc..



# Sample inputs


```
ADD-TODO wash the dishes NOT DONE
LIST-TODOs
LIST-ALL
UPDATE-TODO XXXX DONE
