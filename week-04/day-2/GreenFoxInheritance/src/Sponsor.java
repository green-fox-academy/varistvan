public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void getGoal(){
        System.out.println();
        System.out.print("My goal is: Hire brilliant junior software developers.");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.print(" who represents " + this.company + " and hired " + this.hiredStudents + " students so far.");
    }

    void hire(){
        this.hiredStudents++;
    }
}