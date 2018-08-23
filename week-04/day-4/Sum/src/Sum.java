import java.util.ArrayList;
import java.util.List;

public class Sum {

    private List<Integer> myList;

    public Sum() {
        this.myList = new ArrayList<>();
        myList.add(5);
        myList.add(2);
        myList.add(8);
        myList.add(4);
    }

    public void printTheList() {
        System.out.print("[");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
            if (i < myList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int sum() {
        int sumOfList;
        sumOfList = 0;
        for (Integer item : myList) {
            sumOfList += item;
        }
        return sumOfList;
    }
}
