import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Your 2nd number: ");
        int b = scanner.nextInt();
        double c = (a + b)/2.;
        System.out.println("Sum: " + (a+b) + ", Average: " + c);
    }
}
