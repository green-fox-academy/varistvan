import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("What's your name?: ");
        String nameInput = scanner.nextLine();
        System.out.println("Hello, " + nameInput + "!");
    }
}