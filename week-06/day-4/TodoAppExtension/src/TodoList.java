import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todolist;

    public TodoList() {
        this.todolist = new ArrayList<>();
    }

    public void addTask(String newTaskDesrc) {
        int biggestIdNr = 0;
        if (this.todolist.size() != 0) {
            biggestIdNr = this.todolist.get(this.todolist.size() - 1).getId();
        }
        Todo task = new Todo(newTaskDesrc);
        this.todolist.add(task);
        this.todolist.get(this.todolist.size() - 1).setId(biggestIdNr + 1);
    }

    public void completeTask(int idNumber) {
        if (this.todolist != null) {
            for (int i = 0; i < this.todolist.size(); i++) {
                if (todolist.get(i).getId() == idNumber) {
                    this.todolist.get(i).completeTask();
                }
            }
        }
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

    public void removeTask(int idNumber) {
        if (this.todolist != null) {
            for (int i = 0; i < this.todolist.size(); i++) {
                if (todolist.get(i).getId() == idNumber) {
                    this.todolist.remove(this.todolist.get(i));
                }
            }
        }
    }
}