package fun.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinochleDeck {

    private final List<Card> cards = new ArrayList<Card>(48);

    public PinochleDeck() {
        addSuit(Suit.CLUBS);
        addSuit(Suit.SPADES);
        addSuit(Suit.HEARTS);
        addSuit(Suit.DIAMONDS);
        addSuit(Suit.CLUBS);
        addSuit(Suit.SPADES);
        addSuit(Suit.HEARTS);
        addSuit(Suit.DIAMONDS);
    }

    public List<Card> getCards() {
        return cards;
    }

    public synchronized void shuffle() {
        Collections.shuffle(cards);
    }

    private void addSuit(Suit suit) {
        cards.add(new Card(suit, CardType.ACE));
        cards.add(new Card(suit, CardType.TEN));
        cards.add(new Card(suit, CardType.KING));
        cards.add(new Card(suit, CardType.QUEEN));
        cards.add(new Card(suit, CardType.JACK));
        cards.add(new Card(suit, CardType.NINE));
    }
}
