public class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void learn() {
        System.out.println(name + " is learning right now.");
    }

    void question(Teacher teacher) {
        System.out.println(name + " asks: \"May I ask you, " + teacher.name + "?\"");
    }
}
