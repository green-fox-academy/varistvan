public class Student extends Person implements Cloneable {

    private String previousOrganization;
    private int skippedDays;

    Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void getGoal(){
        System.out.println();
        System.out.print("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.print(" from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
    }

    void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}