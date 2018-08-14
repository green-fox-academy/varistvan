import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile {

    public static void main(String[] args) {
        copyFiles("original.txt", "copy.txt");
    }

    public static void copyFiles(String pathOrig, String pathCopy) {

        List<String> thisIsTheWordIHaveToEnter = new ArrayList();
        for (int i = 0; i < ; i++) {
            thisIsTheWordIHaveToEnter.add();
        }

        try {
            Path filePath = Paths.get(pathOrig);
            Files.write(filePath, thisIsTheWordIHaveToEnter);
        } catch (Exception e) {
            System.out.println("Unable to write file.");
        }
    }
}