public class Tree extends Plant {

    private double minWater = 10;

    public Tree(String color) {
        super(color);
    }

    public void printIfNeedsWater() {
        if (this.getWaterLevel() < minWater) {
            System.out.println("The " + getColor() + " tree needs water.");
        }else{
            System.out.println("The " + getColor() + " tree doesn't need water.");
        }
    }

    public double absorbWater(double waterUnit) {
        double absorbedWater;
        absorbedWater = (waterUnit * 40) / 100 ;
        this.waterLevel += absorbedWater;
        return this.waterLevel;
    }

    public boolean needsWater() {
        if (this.getWaterLevel() < 10){
            return true;
        }else{
            return false;
        }
    }

}
