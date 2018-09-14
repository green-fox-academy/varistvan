import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printUserGuide();

        TodoList tdlist = new TodoList();
        tdlist.addTask("Walk the milk");
        tdlist.addTask("Buy dog");
        tdlist.addTask("Do homework");

        Scanner sc = new Scanner(System.in);
        String commandLetter = sc.nextLine();
        while (!commandLetter.equalsIgnoreCase("x")) {
            if (commandLetter.equalsIgnoreCase("l")) {
                tdlist.printListWithNumbers();
            } else if (commandLetter.equalsIgnoreCase("a")) {
                addNewTodo(tdlist);
            } else if (commandLetter.equalsIgnoreCase("c")) {
                completeTheTodo(tdlist);
            } else if (commandLetter.equalsIgnoreCase("r")) {
                removeTodoFromList(tdlist);
            } else {
                System.out.println("Unknown command");
            }
            commandLetter = sc.nextLine();
        }
    }

    private static void addNewTodo(TodoList tdlist) {
        Scanner scDescr = new Scanner(System.in);
        System.out.println("Add description for the new task: ");
        String taskName = scDescr.nextLine();
        tdlist.addTask(taskName);
        tdlist.printListWithNumbers();
    }

    private static void completeTheTodo(TodoList tdlist) {
        Scanner scComplNum = new Scanner(System.in);
        System.out.println("Number of task to complete: ");
        int taskNrToComplete = scComplNum.nextInt();
        tdlist.completeTask(taskNrToComplete);
        tdlist.printListWithNumbers();
    }

    private static void removeTodoFromList(TodoList tdlist) {
        Scanner scRemNum = new Scanner(System.in);
        System.out.println("The id nr. of the task you want to remove: ");
        int taskIdToRemove = scRemNum.nextInt();
        tdlist.removeTask(taskIdToRemove);
        tdlist.printListWithNumbers();
    }

    private static void printUserGuide() {
        System.out.println("Todo application");
        System.out.println("================");
        System.out.println();
        System.out.println("User instruction:");
        System.out.println("l   Lists all the tasks");
        System.out.println("a   Adds a new task");
        System.out.println("r   Removes a task");
        System.out.println("c   Completes a task");
        System.out.println("x   Exit");
        System.out.println();
    }
}