public class Plant {

    private String color;
    private double waterLevel;

    public Plant(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    public void addToWaterLevel(double waterAmount) {
        this.waterLevel += waterAmount;
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }

    public String getColor() {
        return this.color;
    }

    public void absorbWater(double waterUnit, int procentNr) {
        double absorbedWater;
        absorbedWater = (waterUnit * procentNr) / 100;
        addToWaterLevel(absorbedWater);
    }

    public boolean needsWater(int minWaterLevel) {
        if (this.waterLevel < minWaterLevel) {
            return true;
        } else {
            return false;
        }
    }

    public void printDemandForWater(double minWater, String plantType) {
        if (this.getWaterLevel() < minWater) {
            System.out.println("The " + getColor() + " " + plantType + " needs water");
        } else {
            System.out.println("The " + getColor() + " " + plantType + " doesn't need water");
        }
    }

}