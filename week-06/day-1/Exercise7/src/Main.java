import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "Budapest Andrassy Avenue Sixtysix";

        Map<Character, Long> countsCharacters = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        countsCharacters.entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));
    }
}
