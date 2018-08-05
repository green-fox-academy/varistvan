import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        boolean controller = false;
        while (!controller){
            System.out.println("Guess a number between 1 and 20: ");
            int a = sc.nextInt();
            if(a<n){
                System.out.println("The stored number is higher");
            }else if(a>n){
                System.out.println("The stored number is lower");
            }else{
                System.out.println("You found the number: " + n);
                controller = true;
            }
        }
    }
}
