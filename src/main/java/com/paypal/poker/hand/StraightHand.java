package com.paypal.poker.hand;

import java.util.List;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Draw;

public class StraightHand extends PokerHand {

	public StraightHand() {
		super("StraightHand");
	}

	@Override
	public boolean isMatched(Draw draw) {

		List<Card> cards = draw.getCards();

		boolean areInSequence = true;

		int sequence = cards.get(0).getLiteral().ordinal();
		for (int i = 1; i < cards.size(); i++) {

			if (cards.get(i).getLiteral().ordinal() != sequence - 1) {
				return false;
			}
		}

		return areInSequence;
	}

	@Override
	public List<Card> sortByBestHandDescending(Draw draw) {
		// Cards are already in sequence
		return draw.getCards();
	}

}
