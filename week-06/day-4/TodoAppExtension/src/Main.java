import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printUserGuide();

        TodoList tdlist = new TodoList();
        String pathName = "todo.txt";
        tdlist.readFromFile(pathName);

        Scanner sc = new Scanner(System.in);
        String commandLetter = sc.nextLine();
        while (!commandLetter.equalsIgnoreCase("x")) {
            if (commandLetter.equalsIgnoreCase("l")) {
                tdlist.printListWithNumbers();
            } else if (commandLetter.equalsIgnoreCase("a")) {
                tdlist.addNewTodo();
            } else if (commandLetter.equalsIgnoreCase("c")) {
                tdlist.completeTheTodo();
            } else if (commandLetter.equalsIgnoreCase("r")) {
                tdlist.removeTodoFromList();
            } else if (commandLetter.equalsIgnoreCase("i")) {
                printUserGuide();
            } else {
                System.out.println("Unknown command");
            }
            commandLetter = sc.nextLine();
        }
    }

    private static void printUserGuide() {
        System.out.println("Todo application");
        System.out.println("================");
        System.out.println();
        System.out.println("User instructions:");
        System.out.println("l   Lists all the tasks");
        System.out.println("a   Adds a new task");
        System.out.println("r   Removes a task");
        System.out.println("c   Completes a task");
        System.out.println("i   Prints out the instructions' list");
        System.out.println("x   Exit");
        System.out.println();
    }
}