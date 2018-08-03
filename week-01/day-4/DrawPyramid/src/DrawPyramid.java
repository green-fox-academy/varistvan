// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of lines in the pyramid: ");
        int a = scanner.nextInt();
        for(int i=1; i<=a; i++){
            for(int j = a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<(i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
