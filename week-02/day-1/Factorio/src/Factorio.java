import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out its factorial: ");
        int a = sc.nextInt();
        System.out.println(a +"! = " + factorio(a));
    }
    public static long factorio(int n) {
        long factNr = 1;
        for (int i = 1; i <= n; i++) {
            factNr *= i;
        }
        return factNr;
    }
}
