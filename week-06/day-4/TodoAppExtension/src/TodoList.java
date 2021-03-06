import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoList {

    private List<Todo> todolist;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void readFromFile(String pathName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathName));
            for (String line : lines) {
                String[] parts = line.split(";");

                if (parts.length < 3) {
                    throw new RuntimeException("File corrupted");
                }

                Todo task = new Todo(Long.parseLong(parts[0]), parts[1]);
                todolist.add(task);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String pathName) {
        try {
            List<String> result = new ArrayList<>();
            for (Todo task : todolist) {
                result.add(String.format("%s;%s;%s", task.getId(), task.getTask(), task.getCreationTime()));
            }
            Files.write(Paths.get(pathName), result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNewTodo() {
        Scanner scDescr = new Scanner(System.in);
        System.out.println("Add description for the new task: ");
        String newTaskDescr = scDescr.nextLine();
        int biggestIdNr = 0;
        if (this.todolist.size() != 0) {
            biggestIdNr = this.todolist.get(this.todolist.size() - 1).getId();
        }
        Todo task = new Todo(newTaskDescr);
        this.todolist.add(task);
        this.todolist.get(this.todolist.size() - 1).setId(biggestIdNr + 1);
        printListWithNumbers();
    }

    public void completeTheTodo() {
        Scanner scComplNum = new Scanner(System.in);
        System.out.println("Number of task to complete: ");
        int idNumber = scComplNum.nextInt();
        if (this.todolist != null) {
            for (int i = 0; i < this.todolist.size(); i++) {
                if (todolist.get(i).getId() == idNumber) {
                    this.todolist.get(i).completeTask();
                }
            }
        }
        printListWithNumbers();
    }

    public void removeTodoFromList() {
        Scanner scRemNum = new Scanner(System.in);
        System.out.println("The id nr. of the task you want to remove: ");
        int taskIdToRemove = scRemNum.nextInt();
        if (this.todolist != null) {
            for (int i = 0; i < this.todolist.size(); i++) {
                if (todolist.get(i).getId() == taskIdToRemove) {
                    this.todolist.remove(this.todolist.get(i));
                }
            }
        }
        printListWithNumbers();
    }

    public void printListWithNumbers() {
        if (todolist.size() == 0) {
            System.out.println("Yeey, no todos for today :)");
        } else {
            for (Todo item : this.todolist) {
                item.printTask();
            }
        }
        System.out.println();
    }
}