import java.util.Scanner;
// Write a program that asks for two numbers and prints the bigger one
public class PrintBigger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your 1st number is: ");
        int a = scanner.nextInt();
        System.out.println("Your 2nd number is: ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("The bigger number is: " + a);
        }else if(a<b){
            System.out.println("The bigger number is: " + b);
        }else{
            System.out.println("The numbers are equal.");
        }
    }
}
