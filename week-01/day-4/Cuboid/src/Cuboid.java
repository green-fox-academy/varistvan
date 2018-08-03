import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Side a of your cuboid: ");
        double a = scanner.nextDouble();
        System.out.println("Side b of your cuboid: ");
        double b = scanner.nextDouble();
        System.out.println("Side c of your cuboid: ");
        double c = scanner.nextDouble();
        System.out.println("Surface: " + 2*((a*b)+(b*a)+(b*c)) );
        System.out.println("Volume: " + (a * b * c));
    }
}
