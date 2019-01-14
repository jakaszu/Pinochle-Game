package pinochle.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import pinochle.entity.Card;
import pinochle.entity.CardType;
import pinochle.entity.Hand;
import pinochle.entity.Suit;

public class HandTest {

    @Test
    public void testAddCardWorks() {
        Hand hand = new Hand();
        assertTrue(hand.getCards().isEmpty());
        hand.addCard(new Card(Suit.CLUBS, CardType.ACE));
        assertFalse(hand.getCards().isEmpty());
    }

    @Test
    public void testAddCardPutsInCorrectOrder() {
        Hand hand = new Hand();
        Card lowestCard = createLowestCard();
        hand.addCard(lowestCard);

        Card highestCard = createdHighestCard();
        hand.addCard(highestCard);
        List<Card> cards = hand.getCards();

        assertEquals(highestCard, cards.get(0));
        assertEquals(lowestCard, cards.get(1));
    }
    
    @Test
    public void testAddCardPutsInProperRankOrder() {
    	assertTrue(1==2);
    }

    private Card createdHighestCard() {
        return new Card(Suit.CLUBS, CardType.ACE);
    }

    private Card createLowestCard() {
        return new Card(Suit.CLUBS, CardType.NINE);
    }
}
