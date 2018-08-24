public class Tree extends Plant {

    private int minWater = 10;

    public Tree(String color) {
        super(color);
        addToWaterLevel(0);
    }

    public void printDemandForWater() {
        super.printDemandForWater(this.minWater, "tree");
    }

    public void absorbWater(double waterUnit) {
        super.absorbWater(waterUnit, 40); // a tree can absorb 40% of the given water
    }

    public boolean needsWater() {
        return super.needsWater(minWater);
    }

}