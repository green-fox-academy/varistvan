import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to handle? ");
        int a = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= a; i++){
            System.out.println("Enter the number nr. " + i + " :");
            double n = sc.nextInt();
            sum += n;
        }
        double c = sum/a;
        System.out.println("Sum: " + sum + ", Average: " + c);
    }
}
