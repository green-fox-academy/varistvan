public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("cat");
        Animal animal2 = new Animal("dog", 20, 30);
        Animal animal3 = new Animal("fox");

        printItAll(animal1);
        printItAll(animal2);
        printItAll(animal3);

        animal1.drink();
        animal1.drink();
        animal1.drink();
        animal1.play();

        animal2.play();
        animal2.play();

        animal3.eat();

        printItAll(animal1);
        printItAll(animal2);
        printItAll(animal3);
    }

    public static void printItAll(Animal ani){
        System.out.print("The hunger level of the " + ani.species + " is: " + ani.hunger);
        System.out.print(" and the thirst level is: " + ani.thirst);
        System.out.println();
    }
}