package fun.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class PinochleGameTest {

    PinochleGame pinochleGame = new PinochleGame();

    @Test
    public void testNewRoundCreatesFourHands() {
        List<Hand> hands = pinochleGame.newRound();
        assertEquals(4, hands.size());
    }

    @Test
    public void testNewRoundEachHandHasTwelveCards() {
        List<Hand> hands = pinochleGame.newRound();
        for (Hand hand : hands) {
            assertEquals(12, hand.getCards().size());
        }
    }
    //test to make sure cards are dealt correctly
    @Test
    public void testNewRoundShufflesCards() {
        boolean areHandsAcrossRoundsIdentical = true;
        List<Hand> handsFromRoundOne = pinochleGame.newRound();
        List<Hand> handsFromRoundTwo = pinochleGame.newRound();
        int roundOneIndex = 0;
        for (Iterator<Hand> roundOneIterator = handsFromRoundOne.iterator(); roundOneIterator.hasNext(); roundOneIndex++) {
            Hand roundOneHand = roundOneIterator.next();
            Hand roundTwoHand = handsFromRoundTwo.get(roundOneIndex);
            int roundOneCardIndex = 0;
            for (Iterator<Card> roundOneCardIterator = roundOneHand.getCards().iterator(); roundOneCardIterator.hasNext(); roundOneCardIndex++) {
                Card roundOneCard = roundOneCardIterator.next();
                Card roundTwoCard = roundTwoHand.getCards().get(roundOneCardIndex);
                if (!roundOneCard.equals(roundTwoCard)) {
                    areHandsAcrossRoundsIdentical = false;
                    break;
                }
            }
            if (!areHandsAcrossRoundsIdentical) {
                break;
            }
        }
        assertFalse(areHandsAcrossRoundsIdentical);
    }
}
