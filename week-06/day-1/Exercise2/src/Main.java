import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) ->x).filter(x -> x % 2 != 0).summaryStatistics();
        System.out.println(stats.getAverage());
    }
}
