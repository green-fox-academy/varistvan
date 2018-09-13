import java.util.List;

public class TaskRepository {
    private final TaskFileReader reader;
    private final TaskFileWriter writer;

    public TaskRepository() {
        reader = new TaskFileReader();
        writer = new TaskFileWriter();
    }

    public List<Task> findAll() {
        return reader.loadTasks();
    }

    public void add(Task task) {
        List<Task> tasks = findAll();

        long nextId = findNextId(tasks);

        tasks.add(task.withId(nextId));

        save(tasks);
    }

    public Task findById(long id) {
        List<Task> tasks = findAll();
        Task taskFound = null;

        for (Task task : tasks) {
            if (task.getId() == id) {
                taskFound = task;
            }
        }

        return taskFound;
    }

    public void save(Task task) {
        List<Task> tasks = findAll();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.remove(i);
                tasks.add(i, task);
            }
        }

        save(tasks);
    }

    public void remove(Task task) {
        List<Task> tasks = findAll();

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(task)) {
                tasks.remove(i);
                i--;
            }
        }

        save(tasks);
    }

    private long findNextId(List<Task> tasks) {
        long largestId = 0;

        for (Task task : tasks) {
            if (task.getId() > largestId) {
                largestId = task.getId();
            }
        }

        return largestId + 1;
    }

    private void save(List<Task> tasks) {
        writer.writeTasks(tasks);
    }
}