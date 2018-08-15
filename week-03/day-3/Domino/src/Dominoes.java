import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        System.out.println(dominoes);

        for (int i = 0; i < (dominoes.size()-1); i++) {
            if (dominoes.get(i).getValues()[1] != dominoes.get(i+1).getValues()[0]) {
                for (int j = i+1; j < dominoes.size(); j++) {
                    if (dominoes.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
                        Collections.swap(dominoes, i+1, j);
                    }
                }
            }
        }
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}