package com.paypal.poker.hand;

import java.util.List;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Draw;
import com.paypal.poker.Card.comparator.SequencedCardsComparator;

public abstract class PokerHand implements Cloneable {

	private PokerHand nextHand;
	private String name;

	public PokerHand(String name) {
		this.name = name;
	}

	public abstract boolean isMatched(Draw draw);

	public abstract List<Card> sortByBestHandDescending(Draw draw);

	public void setNextHand(PokerHand pokerHand) {
		this.nextHand = pokerHand;
	}

	public PokerHand getNextHand() {
		return this.nextHand;
	}

	public int compareSimilarhands(Draw d1, Draw d2) {
		List<Card> cards1 = sortByBestHandDescending(d1);
		List<Card> cards2 = sortByBestHandDescending(d2);

		System.out.println("Comparing similar hands");
		System.out.println("P1:" + cards1);
		System.out.println("P2:" + cards2);

		return new SequencedCardsComparator().compare(cards1, cards2);
	}

	@Override
	public String toString() {
		return "PokerHand [name=" + name + "]";
	}

}
