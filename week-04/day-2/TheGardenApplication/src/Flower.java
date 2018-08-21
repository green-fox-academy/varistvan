public class Flower extends Plant {

    private double minWater = 5;

    public Flower(String color) {
        super(color);
        setWaterLevel(0);
    }

    public void printIfNeedsWater() {
        if (this.getWaterLevel() < minWater) {
            System.out.println("The " + getColor() + " flower needs water");
        }else{
            System.out.println("The " + getColor() + " flower doesn't need water");
        }
    }

    public void absorbWater(double waterUnit) {
        double absorbedWater;
        absorbedWater = (waterUnit * 75) / 100 ;
        setWaterLevel(absorbedWater);
    }

    public boolean needsWater() {
        if (this.getWaterLevel() < 5){
            return true;
        }else{
            return false;
        }
    }

}
