import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you want to add? ");
        int a = sc.nextInt();
        System.out.println("Sum: " + sum(a));
    }

    public static int sum(int n) {
        int totalNr = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your number: ");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            totalNr += a;
        }
        return totalNr;
    }
}
