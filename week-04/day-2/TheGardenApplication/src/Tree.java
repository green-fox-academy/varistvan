public class Tree extends Plant {

    private double minWater = 10;

    public Tree(String color) {
        super(color);
        addToWaterLevel(0);
    }

    public void printDemandForWater() {
        if (this.getWaterLevel() < minWater) {
            System.out.println("The " + getColor() + " tree needs water.");
        }else{
            System.out.println("The " + getColor() + " tree doesn't need water.");
        }
    }

    public void absorbWater(double waterUnit) {
        double absorbedWater;
        absorbedWater = (waterUnit * 40) / 100 ;
        addToWaterLevel(absorbedWater);
    }

    public boolean needsWater() {
        if (this.getWaterLevel() < minWater){
            return true;
        }else{
            return false;
        }
    }

}