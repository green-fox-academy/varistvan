import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {
        countLines("my-file.txt");
    }

    public static void countLines(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println("Number of rows in the file = " + lines.size());
        } catch (Exception e) {
            System.out.println("Number of rows in the file = 0");
        }
    }

}