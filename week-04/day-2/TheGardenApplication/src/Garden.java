import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Flower> flowers;
    private List<Tree> trees;

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public void addTree(Tree tree) {
        this.trees.add(tree);
    }

    public void watering(double wateringAmount) {
        int counter = 0;
        System.out.println("Watering with " + wateringAmount);
        for (Flower item : flowers) {
            if (item.needsWater()){
                counter++;
            }
        }
        for (Tree item : trees) {
            if (item.needsWater()){
                counter++;
            }
        }
        wateringAmount = wateringAmount / counter;
        for (Flower item : flowers) {
            if (item.needsWater()){
                item.absorbWater(wateringAmount);
            }
        }
        for (Tree item : trees) {
            if (item.needsWater()){
                item.absorbWater(wateringAmount);
            }
        }
    }

    @Override
    public String toString() {
        return "The garden has " + this.flowers.size() + " flowers and " + this.trees.size() + " trees.";
    }

    public void printGardenSituation() {
        for (Flower item : this.flowers) {
            item.printIfNeedsWater();
        }
        for (Tree item : this.trees) {
            item.printIfNeedsWater();
        }
        System.out.println();
    }

    public Garden() {
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }
}
