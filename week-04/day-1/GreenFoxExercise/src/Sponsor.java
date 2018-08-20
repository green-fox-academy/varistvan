public class Sponsor {

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;

    Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.company = "Google";
        this.hiredStudents = 0;
    }

    void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    void introduce(){
        System.out.print("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " who represents ");
        System.out.println(this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    void hire(){
        this.hiredStudents++;
    }

}
