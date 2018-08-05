import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number of lines in the square: ");
        int a = sc.nextInt();
        int i, j, k, l, m;
        for(i=1; i<=a; i++){
            for(j=1; j<=a; j++){
                if((i==1 || i==a) || (j==1 || j==a)){
                    System.out.print("%");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}