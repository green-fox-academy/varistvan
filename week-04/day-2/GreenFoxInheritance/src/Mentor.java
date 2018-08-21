public class Mentor extends Person {

    private String level;

    Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        this.level = level;  // (junior / intermediate / senior)
    }

    Mentor(){
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal(){
        System.out.println();
        System.out.print("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.print(" " + this.level + " mentor.");
    }

}
