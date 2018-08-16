public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Alice");
        Student stud2 = new Student("Bill");
        Teacher teacher1 = new Teacher("Mr. Cork");
        Teacher teacher2 = new Teacher("Mrs. Doe");

        stud1.learn();
        stud2.question(teacher2);
        teacher1.teach(stud1);
        teacher2.answer();
    }
}
