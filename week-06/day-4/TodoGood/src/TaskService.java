import java.util.List;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService() {
        this.taskRepository = new TaskRepository();
    }

    public void removeTask(int id) {
        Task task = taskRepository.findById(id);

        taskRepository.remove(task);
    }

    public void completeTask(int id) {
        Task task = taskRepository.findById(id);

        if (task == null) {
            throw new IndexOutOfBoundsException();
        }

        taskRepository.save(task.asCompleted());
    }

    public void addTask(String taskName) {
        taskRepository.add(new Task(taskName, false));
    }

    public void listAllTasks() {
        List<Task> tasks = taskRepository.findAll();

        if (tasks.isEmpty()) {
            System.out.println("No todos for today! :)");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
