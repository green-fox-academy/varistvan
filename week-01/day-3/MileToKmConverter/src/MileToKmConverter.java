import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distance in kilometres: ");
        int kmInput = scanner.nextInt();
        double miles = kmInput * .621371;
        System.out.println("Distance in miles: " + miles);
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}