import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number to divide the number 10 with: ");
        int divWith = scanner.nextInt();
        try {
            int res = 12 / divWith;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Fail!");
        }
    }
}
