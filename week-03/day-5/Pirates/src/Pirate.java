import java.util.Arrays;

public class Pirate {

    int intox;
    boolean alive;

    Pirate() {
        this.intox = 0;
        this.alive = true;
    }

    void drinkSomeRum() {
        if (this.alive == false) {
            System.out.println("He's dead.");
        } else {
            this.intox++;
        }
    }

    void howsItGoingMate() {
        if (this.alive == false) {
            System.out.println("He's dead.");
        } else if (this.intox <= 4) {
            System.out.println("This pirate says: \"Pour me anudder!\"");
        }else{
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    void die() {
        this.alive = false;
    }

    void brawl(Pirate pirx) {
        if (this.alive && pirx.alive) {
            int chance;
            chance = (int) (Math.random() * 3);
            if (chance == 0) {
                this.alive = false;
                pirx.alive = false;
                System.out.println("Both pirates died.");
            } else if (chance == 1) {
                this.alive = false;
                System.out.println("The challenger pirate died.");
            } else if (chance == 2) {
                pirx.alive = false;
                System.out.println("The challanged pirate died.");
            }
        }else{
            System.out.println("One of the pirates is dead, so it is not possible to fight.");
        }
    }

    public static void main(String[] args) {
        Pirate firstPir = new Pirate();
        Pirate secondPir = new Pirate();
        Pirate thirdPir = new Pirate();
        firstPir.drinkSomeRum();
        firstPir.drinkSomeRum();
        firstPir.drinkSomeRum();
        firstPir.drinkSomeRum();
        firstPir.drinkSomeRum();
        secondPir.drinkSomeRum();
        secondPir.drinkSomeRum();
        firstPir.howsItGoingMate();
        secondPir.howsItGoingMate();
        secondPir.die();
        secondPir.drinkSomeRum();
        secondPir.howsItGoingMate();
        firstPir.brawl(thirdPir);
        firstPir.howsItGoingMate();
        thirdPir.howsItGoingMate();

    }

}
