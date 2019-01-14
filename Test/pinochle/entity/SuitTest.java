package pinochle.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pinochle.entity.Suit;

public class SuitTest {

    @Test
    public void testNumberOfValuesIsCorrect() {
        assertEquals(4, Suit.values().length);
    }
}
