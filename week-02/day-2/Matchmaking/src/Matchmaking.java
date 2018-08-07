import java.util.*;

public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));
        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> gToMatch, ArrayList<String> bToMatch) {
        ArrayList<String> matchedList = new ArrayList<>();
        int smallerGroup;
        if (gToMatch.size() < bToMatch.size()) {
            smallerGroup = gToMatch.size();
        }else{
            smallerGroup = bToMatch.size();
        }
        for (int i = 0; i < (smallerGroup * 2); i++) {
 //           matchedList.add(gToMatch.get(i) + ", " + bToMatch.get(i));
            if ((i+1) % 2 != 0) {
                matchedList.add(i, gToMatch.get(i/2));
            }else {
                matchedList.add(i, bToMatch.get(i/2));
            }
        }
        return matchedList;
    }

}
