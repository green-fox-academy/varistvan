import java.awt.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> inc = number -> number + 1;
        int x = inc.apply(5);
        IntBinaryOperator add = (a, b) -> a + b;
        Consumer print = number -> System.out.println(number);

        Function<Integer, Integer> increment = Main::increment;
        DoubleToIntFunction random = rand -> 4;
        IntSupplier rand = () -> 4;
        IntPredicate isPositive = number -> number > 0;
        Predicate<Integer> isPositiveAgain = nr -> nr > 0;
    }

    void print(int a) {
        System.out.println(a);
    }

    static int increment(int number) {
        return number +1;
    }

    boolean isPositive(int number) {
        return number > 0;
    }

}
