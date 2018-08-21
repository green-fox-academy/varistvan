public class Sharpie {

    String color;
    double width;
    double inkAmount;

    Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    Sharpie(String color, double width, double inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    void use() {
        inkAmount--;
    }

}