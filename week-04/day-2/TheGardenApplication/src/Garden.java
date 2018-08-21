import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Flower> flowers;
    private List<Tree> trees;

    public Garden() {
        this.flowers = new ArrayList<>();
        this.trees = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public void addTree(Tree tree) {
        this.trees.add(tree);
    }

    public void watering(double wateringAmount) {
        int counter = 0;
        System.out.println("Watering with " + (int)wateringAmount);
        for (Flower item : flowers) {
            if (item.needsWater()) {
                counter++;
            }
        }
        for (Tree item : trees) {
            if (item.needsWater()) {
                counter++;
            }
        }
        wateringAmount = wateringAmount / counter;
        for (Flower item : flowers) {
            if (item.needsWater()) {
                item.absorbWater(wateringAmount);
            }
        }
        for (Tree item : trees) {
            if (item.needsWater()) {
                item.absorbWater(wateringAmount);
            }
        }
    }

    public void printGardenSituation() {
        for (Flower item : this.flowers) {
            item.printDemandForWater();
        }
        for (Tree item : this.trees) {
            item.printDemandForWater();
        }
        System.out.println();
    }

}