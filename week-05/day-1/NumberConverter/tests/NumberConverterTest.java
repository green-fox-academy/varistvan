import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {

    @Test
    public void firstConvertion() {
        NumberConverter amount1 = new NumberConverter(0);
//        String amountLetters1 = amount1.convert(0);
        assertEquals("zero", amount1.convert());
    }

    @Test
    public void secondConvertion() {
        NumberConverter amount1 = new NumberConverter(71);
        assertEquals(" seventy one", amount1.convert());
    }

    @Test
    public void whatIfNumberIsNegative() {
        NumberConverter amount1 = new NumberConverter(-5);
        assertTrue(amount1.isNegative());
    }

    @Test
    public void wordConvertion() {
        NumberConverter amount1 = new NumberConverter(" twenty");
        assertEquals(20, amount1.convertToNr());
    }

    @Test
    public void newWordConvertion() {
        NumberConverter amount1 = new NumberConverter(" ninety six");
        assertEquals(96, amount1.convertToNr());
    }

}