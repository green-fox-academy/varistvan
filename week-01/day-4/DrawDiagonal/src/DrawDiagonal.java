import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines in the square: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
                if((i==1 || i==a) || (j==1 || j==a) || (i==j)){
                    System.out.print("%");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
