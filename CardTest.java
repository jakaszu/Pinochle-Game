package fun.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardTest {

    @Test
    public void testGetPointValueReturnsOneForAce() {
        Card card = new Card(Suit.CLUBS, CardType.ACE);
        assertEquals(1, card.getPointValue());
    }

    @Test
    public void testGetPointValueReturnsOneForTen() {
        Card card = new Card(Suit.CLUBS, CardType.TEN);
        assertEquals(1, card.getPointValue());
    }

    @Test
    public void testGetPointValueReturnsOneForKing() {
        Card card = new Card(Suit.CLUBS, CardType.KING);
        assertEquals(1, card.getPointValue());
    }

    @Test
    public void testGetPointValueReturnsZeroForQueen() {
        Card card = new Card(Suit.CLUBS, CardType.QUEEN);
        assertEquals(0, card.getPointValue());
    }

    @Test
    public void testGetPointValueReturnsZeroForJack() {
        Card card = new Card(Suit.CLUBS, CardType.JACK);
        assertEquals(0, card.getPointValue());
    }

    @Test
    public void testGetPointValueReturnsZeroForNine() {
        Card card = new Card(Suit.CLUBS, CardType.NINE);
        assertEquals(0, card.getPointValue());
    }
}
