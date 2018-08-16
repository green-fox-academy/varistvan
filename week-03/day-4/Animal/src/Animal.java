public class Animal {
    String species;
    int hunger;
    int thirst;

    Animal(String species) {
        this.species = species;
        hunger = 50;
        thirst = 50;
    }

    Animal(String species, int hunger, int thirst) {
        this.species = species;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    void eat() {
        hunger--;
        System.out.println("The " + species + " eats.");
    }

    void drink() {
        thirst--;
        System.out.println("The " + species + " drinks.");
    }

    void play() {
        hunger--;
        thirst--;
        System.out.println("The " + species + " plays.");
    }
}
