public class Plant {

    private String color;
    private double waterLevel;

    public Plant(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }

    public void addToWaterLevel(double waterAmount) {
        this.waterLevel += waterAmount;
    }

    public String getColor() {
        return this.color;
    }

    public void printDemandForWater() {
        if (this.getWaterLevel() <= 0) {
            System.out.println("The " + getColor() + " plant needs water");
        }else{
            System.out.println("The " + getColor() + " plant doesn't need water");
        }
    }
}