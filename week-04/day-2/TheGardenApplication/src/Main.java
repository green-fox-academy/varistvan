public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        Flower yellow = new Flower("yellow");
        garden.addFlower(yellow);
        Flower blue = new Flower("blue");
        garden.addFlower(blue);
        Tree purple = new Tree("purple");
        garden.addTree(purple);
        Tree orange = new Tree("orange");
        garden.addTree(orange);

        garden.printGardenSituation();
        garden.watering(40);
        garden.printGardenSituation();
        garden.watering(70);
        garden.printGardenSituation();
    }
}