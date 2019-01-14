package fun.entity;

import java.util.ArrayList;
import java.util.List;

public class PinochleGame {

    public List<Hand> newRound() {
        PinochleDeck deck = new PinochleDeck();
        deck.shuffle();
        return dealCards(deck);
    }

    private List<Hand> dealCards(PinochleDeck pinochleDeck) {
        Hand handOne = new Hand();
        Hand handTwo = new Hand();
        Hand handThree = new Hand();
        Hand handFour = new Hand();
        Hand handDelete = new Hand();
        List<Card> cards = pinochleDeck.getCards();
        for (int deckPosition = 0; deckPosition < cards.size(); deckPosition += 4) {
            handOne.addCard(cards.get(deckPosition));
            handTwo.addCard(cards.get(deckPosition + 1));
            handThree.addCard(cards.get(deckPosition + 2));
            handFour.addCard(cards.get(deckPosition + 3));
        }
        List<Hand> hands = new ArrayList<Hand>(4);
        hands.add(handOne);
        hands.add(handTwo);
        hands.add(handThree);
        hands.add(handFour);
        return hands;
    }

}
