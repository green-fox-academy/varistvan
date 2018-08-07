import java.util.*;

public class IsInList{

    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
    }

    public static void checkNums(ArrayList<Integer> nrList) {
         System.out.println(nrList.containsAll(Arrays.asList(4, 8, 12, 16)));
    }

}