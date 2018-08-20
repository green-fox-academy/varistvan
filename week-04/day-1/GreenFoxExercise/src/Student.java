public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    Student(String name, int age, String gender, String previousOrganization){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    void introduce(){
        System.out.print("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
        System.out.println(" from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }

    void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

}
