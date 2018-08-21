import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public void addStudent(Student randomStudent) {
        this.students.add(randomStudent);
    }

    public void addMentor(Mentor randomMentor) {
        this.mentors.add(randomMentor);
    }

    public void info() {
        System.out.println();
        System.out.print("The " + this.name + " cohort has " + this.students.size() + " students and " + this.mentors.size() + " mentors.");
    }

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }
}