public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public void getGoal(){
        System.out.println();
        System.out.print("My goal is: Live for the moment!");
    }

    public void introduce(){
        System.out.println();
        System.out.print("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
    }

 /*   public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }*/
}