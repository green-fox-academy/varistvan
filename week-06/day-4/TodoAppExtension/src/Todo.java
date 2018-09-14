import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Todo {

    private int id;
    private String task;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;


    public Todo(String taskDescription) {
        this.task = taskDescription;
        this.createdAt = LocalDateTime.now(ZoneOffset.UTC);
    }

    public void setId(int idNumber) {
        this.id = idNumber;
    }

    public int getId() {
        return this.id;
    }

    public void completeTask() {
        this.completedAt = LocalDateTime.now(ZoneOffset.UTC);
    }

    public void printTask() {
        if (this.completedAt != null) {
            System.out.println(this.id + ". [x] " + this.task + ", created at: " + this.createdAt.toString() + ", completed at: " + this.completedAt.toString());
        } else {
            System.out.println(this.id + ". [ ] " + this.task + ", created at: " + this.createdAt.toString());
        }
    }

//    public Duration completionTime(LocalDateTime created, LocalDateTime completed) {
//        return completed - created;
//    }

}