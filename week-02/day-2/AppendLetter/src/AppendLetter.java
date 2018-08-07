import java.util.*;

public class AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(appendA(far));
    }

    public static List<String> appendA(List<String> missingALetter) {
        for(int i = 0; i < missingALetter.size(); i++) {
            String tempWord = missingALetter.get(i) + 'a';
            missingALetter.set(i, tempWord);
        }
        return missingALetter;
    }
}
