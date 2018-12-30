package fun.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest {

    @Test
    public void testNumberOfValuesIsCorrect() {
        assertEquals(4, Suit.values().length);
    }
}
