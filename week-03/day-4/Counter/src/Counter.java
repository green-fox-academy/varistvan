public class Counter {

    int number;
    int origNumber;

    Counter() {
        this.number = 0;
        this.origNumber = 0;
    }

    Counter(int number) {
        this.number = number;
        this.origNumber = number;
    }

    int add(int anotherNumber) {
        number = number + anotherNumber;
        return number;
    }

    int add() {
        return number++;
    }

    int get() {
       return number;
    }

    void reset() {
        number = this.origNumber;
    }
}
