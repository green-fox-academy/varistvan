import java.util.ArrayList;
import java.util.Comparator;

public class PokerGame {

    public static void main(String[] args) {
    }

    public boolean whiteWins(ArrayList<Card> list1, ArrayList<Card> list2) {
        for (Card card : list2) {
            if (card.getValue() == 14) {
                return true;
            }
//            else {
//                return false;
//            }
        }
        return false;
    }

    public boolean isFlush(ArrayList<Card> list1) {
        String suitForFlush = list1.get(0).getSuit();
        for (Card card : list1) {
            if (!card.getSuit().equals(suitForFlush)) {
                return false;
            }
        }
        return true;
    }

    public boolean allValuesDiffer(ArrayList<Card> list1) {
        for (int i = 0; i < list1.size() - 1; i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).getValue() == list1.get(j).getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isHighCard(ArrayList<Card> list) {
        if (allValuesDiffer(list) && !isFlush(list)) {
            return true;
        }
        return false;
    }

    public boolean isStraight(ArrayList<Card> list) {
        ArrayList<Integer> arrayOfValues = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer intObj = new Integer(i);
            arrayOfValues.add(list.get(intObj).getValue());
        }
        arrayOfValues.sort(Comparator.naturalOrder());
        for (int i = 0; i < arrayOfValues.size() - 1; i++) {
            if (!(arrayOfValues.get(i) + 1 == arrayOfValues.get(i+1))) {
                return false;
            }
        }
        return true;
    }

    public boolean isStraightFlush(ArrayList<Card> list) {
        if (isFlush(list) && isStraight(list)) {
            return true;
        }
        return false;
    }

}

// C, D, H, and S
// 2, 3, 4, 5, 6, 7, 8, 9, 10,
// jack, queen, king, ace (denoted 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A)