// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
import java.util.Scanner;

public class DrawDiamond{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of lines in the diamond: ");
        int a = scanner.nextInt();
        int i, j, k, l, m;
        for(i=1; i<=a; i++){
            if(i <= (a+1)/2){
                for(j = 0; j < (a+1)/2-i; j++){
                    System.out.print(" ");
                }
                for(k = 1; k < (i*2); k++){
                    System.out.print("*");
                }
            }else{
                for(l = 1; l < i-(a/2); l++){
                    System.out.print(" ");
                }
                for(m = 1; m <= (a-i)*2+1; m++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}