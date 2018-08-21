public class Main {
    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("yellow", 2.8);
        Sharpie sharpie2 = new Sharpie("pink", 3.0, 1);
        Sharpie sharpie3 = new Sharpie("green", 0.8);
        Sharpie sharpie4 = new Sharpie("cyan", 1.35);

        sharpie1.use();
        sharpie3.use();
        sharpie3.use();

        printAll(sharpie1);
        printAll(sharpie2);
        printAll(sharpie3);
        printAll(sharpie4);
        System.out.println("---------------------------------------------------");

        SharpieSet shSet = new SharpieSet();

        Sharpie sh1 = new Sharpie("orange", 2.8);
        shSet.addSharpie(sh1);
        Sharpie sh2 = new Sharpie("magenta", 3.0, 0);
        shSet.addSharpie(sh2);
        Sharpie sh3 = new Sharpie("neon", 0.8);
        shSet.addSharpie(sh3);
        Sharpie sh4 = new Sharpie("sky blue", 1.35);
        shSet.addSharpie(sh4);
        Sharpie sh5 = new Sharpie("purple", 1.0, 0);
        shSet.addSharpie(sh5);

        System.out.println("Number of usable sharpies: " + shSet.countUsable());
        shSet.removeTrash();

    }

    public static void printAll(Sharpie actual) {
        System.out.println("The " + actual.width + " wide, "+ actual.color + " coloured sharpie's ink level is: " + actual.inkAmount);
    }
}