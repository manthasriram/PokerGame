package com.paypal.poker.Card;

import java.util.Comparator;

/**
 * Card representation
 * 
 * @author srmantha
 *
 */
public class Card {

	private Suite suite;
	private Literal literal;

	public Card(Suite s, Literal l) {
		this.suite = s;
		this.literal = l;
	}

	public Literal getLiteral() {
		return literal;
	}

	public Suite getSuite() {
		return suite;
	}

	@Override
	public String toString() {
		return "Card [suite=" + suite + ", literal=" + literal + "]";
	}

	public static class CardComparator implements Comparator<Card> {
		/*
		 * Arrange in descening order
		 */
		public int compare(Card o1, Card o2) {
			return (-1) * o1.getLiteral().compareTo(o2.getLiteral());
		}
	}

}
