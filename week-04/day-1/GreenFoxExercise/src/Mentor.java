public class Mentor {

    String name;
    int age;
    String gender;
    String level;

    Mentor(String name, int age, String gender, String level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;  // (junior / intermediate / senior)
    }

    Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }

    void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    void introduce(){
        System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " " + this.level + " mentor.");
    }

}
