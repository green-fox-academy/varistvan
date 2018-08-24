public class Flower extends Plant {

    private int minWater = 5;

    public Flower(String color) {
        super(color);
        addToWaterLevel(0);
    }

    public void printDemandForWater() {
        super.printDemandForWater(this.minWater, "flower");
    }

    public void absorbWater(double waterUnit) {
        super.absorbWater(waterUnit, 75); // a flower can absorb 75% of the given water
    }

    public boolean needsWater() {
        return super.needsWater(minWater);
    }

}