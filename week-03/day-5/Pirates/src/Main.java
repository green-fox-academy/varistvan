public class Main {
    public static void main(String[] args) {

        Pirate the1stPir = new Pirate();
        Pirate the2ndPir = new Pirate();
        Pirate the3rdPir = new Pirate();

        for (int i = 0; i < 5; i++) {
            the1stPir.drinkSomeRum();
        }
        the2ndPir.drinkSomeRum();

        the1stPir.howsItGoingMate();
        the2ndPir.howsItGoingMate();

        the2ndPir.die();
        the2ndPir.drinkSomeRum();
        the2ndPir.howsItGoingMate();

        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        the1stPir.brawl(the2ndPir); //let's see what happens when a dead pirate is challenged
        the1stPir.brawl(the3rdPir);
        the1stPir.howsItGoingMate();
        the3rdPir.howsItGoingMate();

    }
}