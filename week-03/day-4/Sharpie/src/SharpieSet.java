import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void addSharpie(Sharpie sharpie) {
        this.sharpies.add(sharpie);
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        ArrayList<Integer> toRemove = new ArrayList<>();
        int indexToRemove;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount <= 0) {
                //sharpies.remove(i);
                System.out.println("Sharpie number " + (i+1) + ". with the " + sharpies.get(i).color + " color is thrown away.");
                toRemove.add(i);
            }
        }
        for (int j = 0; j < toRemove.size() ; j++) {
            indexToRemove = toRemove.get(j)-j;
            sharpies.remove(indexToRemove);
        }
        System.out.println(sharpies.size());
    }

}
