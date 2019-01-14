package pinochle.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand {
	private final List<Card> cards = new ArrayList<>();

	public List<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		if (cards.isEmpty()) {
			cards.add(card);
		} else {
			int i = 0;
			for (Iterator<Card> iterator = cards.iterator(); iterator.hasNext();) {
				Card existingCard = iterator.next();
				if (card.getType().getRank() >= existingCard.getType().getRank()) {
					cards.add(i, card);
					break;
				}
				i++;
			}
		}
	}

	@Override
	public String toString() {
		return cards.toString();
	}
}
