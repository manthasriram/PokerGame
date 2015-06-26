package com.paypal.poker.Card.comparator;

import java.util.Comparator;
import java.util.List;

import com.paypal.poker.Card.Card;

/**
 * Sequences the Cards in descending order
 * 
 * @author srmantha
 *
 */
public class SequencedCardsComparator implements Comparator<List<Card>> {

	public int compare(List<Card> cards1, List<Card> cards2) {
		for (int i = 0; i < cards1.size(); i++) {

			Card c1 = cards1.get(i);
			Card c2 = cards2.get(i);

			if (c1.getLiteral().ordinal() > c2.getLiteral().ordinal()) {
				return 1;
			} else if (c1.getLiteral().ordinal() < c2.getLiteral().ordinal()) {
				return -1;

			} else {
				continue;
			}

		}
		return 0;
	}

}
