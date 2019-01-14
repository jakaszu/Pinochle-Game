package pinochle.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

import org.junit.Test;

import pinochle.entity.CardType;

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
    	java.util.HashSet<Integer> noDuplicates = new HashSet<Integer>();
    	for(CardType cardType :CardType.values()) {
    		assertTrue(noDuplicates.add(cardType.getRank()));
    	}
    	assertEquals(CardType.values().length, noDuplicates.size());
    }
}
