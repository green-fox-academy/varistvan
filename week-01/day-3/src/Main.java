import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*int intNum = 0;
        intNum++;
        intNum += 5;    // *= , /= ,
        double dub = 1.5;
        boolean bool = true;
        String name = "Alex";
        char firstChar = 'c';
        System.out.println("\"idezet\"");
        /*
        /*int number = 15;
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("oszthato 3-al es 5-el");
        }else{
            System.out.println("blabla");
        }
        */
        /*
        int i = 0;
        while(i < 10){
            System.out.println("BADBOI is awesome!");
            i++;
        }*/
        /*for (int i = 0; i < 10; i++){
            System.out.println("I <3 GreenFox");
        }
        int j = 0;
        do{
            System.out.println("Hello Alopex!");
            j++;
        }while(j < 5);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a neved: ");
        String line = sc.nextLine();
        System.out.println("Hello " + line +"!");
    }
}
