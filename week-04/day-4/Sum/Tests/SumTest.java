import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum list = new Sum();

    @Test
    public void sum() {
        //list.sum();
        assertEquals(19, list.sum());
    }
}