package fun.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTypeTest {

    @Test
    public void testNumberOfValuesIsCorrect() {
        assertEquals(6, CardType.values().length);
    }

    @Test
    public void testGetRankWorks() {
        assertEquals(5, CardType.ACE.getRank());
    }

    @Test
    public void testGetRankIsUnique() {
finish this test then move to HandTest to make sure it is putting cards in correct order based on rank
    }
}
