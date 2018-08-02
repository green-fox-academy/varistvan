import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of chickens: ");
        int chickenNr = scanner.nextInt();
        System.out.println("Number of pigs: ");
        int pigNr = scanner.nextInt();
        int legNr = (2 * chickenNr) + (4 * pigNr);
        System.out.println("Number of animal legs on your farm: " + legNr);
    }
}
