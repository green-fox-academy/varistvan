import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        char[] charArray = {'a', 'l', 'm', 'a', 'f', 'a'};
        Stream<Character> cStream = IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]);
        System.out.println(charArray);
    }
}
