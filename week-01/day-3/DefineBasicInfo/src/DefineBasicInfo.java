import java.util.Scanner;

public class DefineBasicInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        String nameInput = scanner.nextLine();
        System.out.println("Your age: ");
        int ageInput = scanner.nextInt();
        System.out.println("Your height: ");
        double heightInput = scanner.nextDouble();
        System.out.println("Are you married? (true or false): ");
        boolean maritalInput = scanner.nextBoolean();
        System.out.println("Your name is " + nameInput + " and you are " + ageInput + ".");
        System.out.println("You are " + heightInput + " m high and your marital status is: " + maritalInput);
    }
}
