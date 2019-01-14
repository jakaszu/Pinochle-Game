package pinochle.entity;

// change
public class Card {

    private final Suit suit;
    private final CardType type;

    public Card(Suit suit, CardType type) {
        this.suit = suit;
        this.type = type;
    }

    public int getPointValue() {
        int pointValue = -1;
        switch (type) {
            case ACE:
            case TEN:
            case KING:
                pointValue = 1;
                break;
            case JACK:
            case NINE:
            case QUEEN:
                pointValue = 0;
                break;
            default:
                throw new RuntimeException("Unexpected CardType: " + type);
        }
        return pointValue;
    }

    @Override
    public boolean equals(Object object) {
        boolean areTheyEqual = false;
        if (object instanceof Card) {
            Card cardToCompare = (Card) object;
            if (this.suit.equals(cardToCompare.suit) && this.type.equals(cardToCompare.type)) {
                areTheyEqual = true;
            }
        }
        return areTheyEqual;
    }

    @Override
    public String toString() {
        return type + " of " + suit;
    }

	public CardType getType() {
		return type;
	}
}
