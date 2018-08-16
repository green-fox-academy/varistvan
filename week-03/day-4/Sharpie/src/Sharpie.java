public class Sharpie {

    String color;
    double width;
    double inkAmount;

    Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    void use() {
        inkAmount = inkAmount - 0.47;
    }

}
