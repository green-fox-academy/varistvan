public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("yellow", 2.8);
        Sharpie sharpie2 = new Sharpie("pink", 3.0);
        Sharpie sharpie3 = new Sharpie("green", 0.8);
        Sharpie sharpie4 = new Sharpie("cyan", 1.35);

        sharpie1.use();
        sharpie3.use();
        sharpie3.use();

        printAll(sharpie1);
        printAll(sharpie2);
        printAll(sharpie3);
        printAll(sharpie4);
    }
    public static void printAll(Sharpie actual) {
        System.out.println("The " + actual.width + " wide, "+ actual.color + " coloured sharpie's ink level is: " + actual.inkAmount);
    }
}
