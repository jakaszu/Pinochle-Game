package fun.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PinochleDeckTest {

    @Test
    public void testGetCardsHasValidCards() {
        PinochleDeck pinochleDeck = new PinochleDeck();
        List<Card> cards = pinochleDeck.getCards();
        assertEquals(48, cards.size());
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.ACE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.JACK)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.KING)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.NINE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.QUEEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.CLUBS, CardType.TEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.ACE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.JACK)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.KING)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.NINE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.QUEEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.DIAMONDS, CardType.TEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.ACE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.JACK)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.KING)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.NINE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.QUEEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.HEARTS, CardType.TEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.ACE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.JACK)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.KING)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.NINE)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.QUEEN)));
        assertTrue(hasValidOccurencesOfCard(cards, new Card(Suit.SPADES, CardType.TEN)));
    }

    private boolean hasValidOccurencesOfCard(List<Card> cards, Card cardToValidate) {
        int count = 0;
        for (Card card : cards) {
            if (cardToValidate.equals(card)) {
                count++;
            }
        }
        return count == 2 ? true : false;
    }

}
