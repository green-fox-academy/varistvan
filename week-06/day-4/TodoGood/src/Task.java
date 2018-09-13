import java.util.Objects;

public class Task {
    private final long id;
    private final String name;
    private final boolean isCompleted;

    public Task(String name, boolean isCompleted) {
        this(0, name, isCompleted);
    }

    public Task(long id, String name, boolean isCompleted) {
        this.id = id;
        this.name = name;
        this.isCompleted = isCompleted;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s] %s", id, getXIfCompleted(), name);
    }

    private String getXIfCompleted() {
        if (isCompleted) {
            return "X";
        }

        return " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Task asCompleted() {
        return new Task(id, name, true);
    }

    public Task withId(long id) {
        return new Task(id, name, isCompleted);
    }
}