public class Pirate {

    int intox;
    boolean alive;

    Pirate() {
        this.intox = 0;
        this.alive = true;
    }

    void drinkSomeRum() {
        if (this.alive) {
            this.intox++;
        } else {
            System.out.println("He's dead.");
        }
    }

    void howsItGoingMate() {
        if (this.alive) {
            if (this.intox <= 4) {
                System.out.println("This pirate says: \"Pour me anudder!\"");
            } else {
                System.out.println("This Pirate says: \"Arghh, I'ma Pirate. How d'ya d'ink its goin?\"");
            }
        }else{
            System.out.println("He's dead.");
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
            System.out.println("One of the pirates is dead, you will not see any fight here.");
        }
    }

}
