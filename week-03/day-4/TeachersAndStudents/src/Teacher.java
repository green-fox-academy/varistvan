public class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student student) {
        System.out.println(name + " is teaching " + student.name + ".");
    }

    void answer() {
        System.out.println(name + " says: \"Here is my answer: ...\"");
    }
}
