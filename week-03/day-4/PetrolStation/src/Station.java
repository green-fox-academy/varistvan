public class Station {

    int gasAmount;

    Station() {
        this.gasAmount = 2000;
    }

    Station(int gasAm) {
        this.gasAmount = gasAm;
    }

    void refill(Car car) {
        gasAmount = gasAmount - car.capacity;
        car.gasAmount = car.gasAmount + car.capacity;
    }
}
