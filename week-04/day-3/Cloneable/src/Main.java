public class Main {
    public static void main(String[] args) {

        Student john = new Student("John", 20, "male", "BME");
        john.introduce();

        try {
            Student cloned = (Student)john.clone();
            cloned.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}