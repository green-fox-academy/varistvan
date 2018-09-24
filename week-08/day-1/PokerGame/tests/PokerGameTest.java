import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PokerGameTest {
    private PokerGame pokerGame = new PokerGame();

    @Test
    public void checkCards() {
        ArrayList<Card> black = new ArrayList<>(5);
        Card card1 = new Card("h", 2);
        Card card2 = new Card("d", 3);
        Card card3 = new Card("s", 5);
        Card card4 = new Card("c", 9);
        Card card5 = new Card("d", 13);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("c", 2);
        Card card7 = new Card("h", 3);
        Card card8 = new Card("s", 4);
        Card card9 = new Card("c", 8);
        Card cardT = new Card("h", 14);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(cardT);

        assertTrue(pokerGame.whiteWins(black, white));
    }

    @Test
    public void checkWhiteFlush() {
        ArrayList<Card> black = new ArrayList<>(5);
        Card card1 = new Card("h", 2);
        Card card2 = new Card("s", 4);
        Card card3 = new Card("c", 4);
        Card card4 = new Card("d", 2);
        Card card5 = new Card("h", 4);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("s", 2);
        Card card7 = new Card("s", 8);
        Card card8 = new Card("s", 14);
        Card card9 = new Card("s", 12);
        Card cardT = new Card("s", 3);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(cardT);

        assertTrue(pokerGame.isFlush(white));
    }

    @Test
    public void checkBlackHighCard() {
        ArrayList<Card> black = new ArrayList<>(5);
        Card card1 = new Card("h", 2);
        Card card2 = new Card("d", 3);
        Card card3 = new Card("s", 5);
        Card card4 = new Card("c", 9);
        Card card5 = new Card("d", 13);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("c", 2);
        Card card7 = new Card("h", 3);
        Card card8 = new Card("s", 4);
        Card card9 = new Card("c", 8);
        Card cardT = new Card("h", 13);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(cardT);

        assertTrue(pokerGame.isHighCard(black));
    }

    @Test
    public void checkStraight() {
        ArrayList<Card> black = new ArrayList<>(5);
        Card card1 = new Card("h", 2);
        Card card2 = new Card("d", 3);
        Card card3 = new Card("s", 5);
        Card card4 = new Card("c", 9);
        Card card5 = new Card("d", 13);
        black.add(card1);
        black.add(card2);
        black.add(card3);
        black.add(card4);
        black.add(card5);

        ArrayList<Card> white = new ArrayList<>(5);
        Card card6 = new Card("c", 2);
        Card card7 = new Card("h", 3);
        Card card8 = new Card("s", 4);
        Card card9 = new Card("c", 8);
        Card cardT = new Card("h", 13);
        white.add(card6);
        white.add(card7);
        white.add(card8);
        white.add(card9);
        white.add(cardT);

        assertTrue(pokerGame.isStraight(black));
    }
}