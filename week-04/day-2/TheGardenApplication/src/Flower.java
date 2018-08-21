public class Flower extends Plant {

    private double minWater = 5;

    public Flower(String color) {
        super(color);
        addToWaterLevel(0);
    }

    public void printDemandForWater() {
        if (this.getWaterLevel() < minWater) {
            System.out.println("The " + getColor() + " flower needs water");
        }else{
            System.out.println("The " + getColor() + " flower doesn't need water");
        }
    }

    public void absorbWater(double waterUnit) {
        double absorbedWater;
        absorbedWater = (waterUnit * 75) / 100 ;
        addToWaterLevel(absorbedWater);
    }

    public boolean needsWater() {
        if (this.getWaterLevel() < 5){
            return true;
        }else{
            return false;
        }
    }

}
