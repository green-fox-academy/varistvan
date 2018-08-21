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

}